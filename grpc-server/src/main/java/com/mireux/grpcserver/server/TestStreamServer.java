package com.mireux.grpcserver.server;

import com.example.test.stream.service.Request;
import com.example.test.stream.service.Response;
import com.example.test.stream.service.TestGrpcStreamGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.lognet.springboot.grpc.GRpcService;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public StreamObserver<Request> testStreamRequest(StreamObserver<Response> responseObserver) {
        return super.testStreamRequest(responseObserver);
    }

    @Override
    public void testStreamResponse(Request request, StreamObserver<Response> responseObserver) {
        super.testStreamResponse(request, responseObserver);
    }

    @Override
    public StreamObserver<Request> testStream(StreamObserver<Response> responseObserver) {
        return super.testStream(responseObserver);
    }
}
