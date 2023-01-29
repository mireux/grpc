package com.mireux.grpcserver.server;

import com.grpc.grpcserver.server.Greeting;
import com.grpc.grpcserver.server.HelloWorldServiceGrpc;
import com.grpc.grpcserver.server.Person;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.lognet.springboot.grpc.GRpcService;

/**
 * <p>在开始处详细描述该类的作用</p>
 *
 * @author haijie.liang@juphoon.com
 * @date 2023/1/29 09:34
 */
@GRpcService
@Slf4j
public class HelloServer extends HelloWorldServiceGrpc.HelloWorldServiceImplBase {

    @Override
    public void sayHello(Person request, StreamObserver<Greeting> responseObserver) {
        log.info("request:{}", request);
        responseObserver.onNext(Greeting.newBuilder().setMessage("当前时间为" + System.currentTimeMillis()).build());
        responseObserver.onCompleted();
    }
}
