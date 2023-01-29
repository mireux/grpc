package com.mireux.grpcclient.client;

import com.example.test.stream.service.TestGrpcStreamGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

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

    private TestGrpcStreamGrpc.TestGrpcStreamStub testGRpcStub;

    @PostConstruct
    public void init() {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build();
        testBlocking = TestGrpcStreamGrpc.newBlockingStub(managedChannel);
        testGRpcStub = TestGrpcStreamGrpc.newStub(managedChannel);
        testFuture = TestGrpcStreamGrpc.newFutureStub(managedChannel);
    }


}
