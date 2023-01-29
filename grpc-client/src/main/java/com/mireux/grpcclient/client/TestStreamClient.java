package com.mireux.grpcclient.client;

import com.example.test.stream.service.Request;
import com.example.test.stream.service.Response;
import com.example.test.stream.service.TestGrpcStreamGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/**
 * <p>在开始处详细描述该类的作用</p>
 *
 * @author haijie.liang@juphoon.com
 * @date 2023/1/29 11:08
 */
@Component
@Slf4j
public class TestStreamClient {
    /**
     * 阻塞式流，支持服务端流和普通流
     */
    private TestGrpcStreamGrpc.TestGrpcStreamBlockingStub testBlocking;
    /**
     * 非阻塞式流，只支持普通流
     */
    private TestGrpcStreamGrpc.TestGrpcStreamFutureStub testFuture;
    /**
     * 流，支持普通流，服务端流，客户端流和双端流
     */

    private TestGrpcStreamGrpc.TestGrpcStreamStub testGrpcStub;

    @PostConstruct
    public void init() {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build();
        testBlocking = TestGrpcStreamGrpc.newBlockingStub(managedChannel);
        testGrpcStub = TestGrpcStreamGrpc.newStub(managedChannel);
        testFuture = TestGrpcStreamGrpc.newFutureStub(managedChannel);
    }

    /**
     * 普通流
     */
    public void print() {
        Response test = testBlocking.test(Request.
                newBuilder()
                .setRequest("一个参数一个返回值" + new Date().toString())
                .setTimestamp(System.currentTimeMillis())
                .build());
        System.out.println(test);
    }

    /**
     * 客户端流
     */
    public void printClient() {
        StreamObserver<Request> request = testGrpcStub.testStreamRequest(new StreamObserver<>() {
            @Override
            public void onNext(Response value) {
                log.info("response:{}", value);
            }

            @Override
            public void onError(Throwable t) {
                log.error(t.getMessage());
            }

            @Override
            public void onCompleted() {
                log.info("close");
            }
        });
        for (int i = 0; i < 10; i++) {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            request.onNext(Request.newBuilder().setRequest("client stream:" + i).build());
        }
        request.onCompleted();
    }


    /**
     * 服务端流
     */
    public void printServer() {
        Iterator<Response> test = testBlocking.testStreamResponse(Request.newBuilder().build());
        while (test.hasNext()) {
            System.out.println(test.next());
        }
    }

    /**
     * 双端流
     */
    public void printAll() {
        StreamObserver<Request> stream = testGrpcStub.testStream(new StreamObserver<Response>() {
            @Override
            public void onNext(Response response) {
                log.info(response.getResponse());
            }

            @Override
            public void onError(Throwable t) {
                log.error(t.getMessage());
            }

            @Override
            public void onCompleted() {
                log.info("close");
            }
        });
        for (int i = 0; i < 10; i++) {
            stream.onNext(Request.newBuilder().setRequest("all stream").build());
        }
        stream.onCompleted();
    }


}
