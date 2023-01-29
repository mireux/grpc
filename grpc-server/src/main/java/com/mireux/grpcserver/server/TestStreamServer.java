package com.mireux.grpcserver.server;

import com.example.test.stream.service.Request;
import com.example.test.stream.service.Response;
import com.example.test.stream.service.TestGrpcStreamGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.lognet.springboot.grpc.GRpcService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * <p>在开始处详细描述该类的作用</p>
 *
 * @author haijie.liang@juphoon.com
 * @date 2023/1/29 11:03
 */
@GRpcService
@Slf4j
public class TestStreamServer extends TestGrpcStreamGrpc.TestGrpcStreamImplBase {

    @Override
    public void test(Request request, StreamObserver<Response> responseObserver) {
        log.info("request：{}", request);
        List<String> list = new ArrayList<>();
        list.add("l");
        list.add("h");
        list.add("j");
        responseObserver.onNext(Response.newBuilder()
                .setResponse(request.toString())
                .setTimestamp(System.currentTimeMillis())
                .addAllB(list)
                .build());
        responseObserver.onCompleted();
    }

    /**
     * 客户端流
     *
     * @param responseObserver
     * @return
     */
    @Override
    public StreamObserver<Request> testStreamRequest(StreamObserver<Response> responseObserver) {
        StreamObserver<Request> responseStreamObserver = new StreamObserver<Request>() {
            @Override
            public void onNext(Request request) {
                log.info("client stream:{}", request);
            }

            @Override
            public void onError(Throwable throwable) {
                log.error(throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                log.info("close");
            }
        };
        responseStreamObserver.onNext(Request.newBuilder().setRequest("client stream").build());
        return responseStreamObserver;
    }

    /**
     * 服务端流
     *
     * @param request
     * @param responseObserver
     */
    @Override
    public void testStreamResponse(Request request, StreamObserver<Response> responseObserver) {
        log.info("request：{}", request);
        for (int i = 0; i < 10; i++) {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            responseObserver.onNext(Response.newBuilder().setResponse("server stream:" + request + ":" + i).build());
        }
        responseObserver.onCompleted();

    }

    /**
     * 双端流
     *
     * @param responseObserver
     * @return
     */
    @Override
    public StreamObserver<Request> testStream(StreamObserver<Response> responseObserver) {
        return new StreamObserver<Request>() {
            @Override
            public void onNext(Request request) {
                for (int i = 0; i < 10; i++) {
                    log.info(request.getRequest());
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    responseObserver.onNext(Response.newBuilder().setResponse("all stream").build());
                }
            }

            @Override
            public void onError(Throwable throwable) {
                log.error(throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                log.info("close");
                responseObserver.onCompleted();
            }
        };
    }
}
