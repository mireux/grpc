package com.mireux.grpcclient.client;

import com.grpc.grpcserver.server.Greeting;
import com.grpc.grpcserver.server.HelloWorldServiceGrpc;
import com.grpc.grpcserver.server.Person;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * <p>在开始处详细描述该类的作用</p>
 *
 * @author haijie.liang@juphoon.com
 * @date 2023/1/29 10:03
 */
@Component
@Slf4j
public class HelloWorldClient {
    /**
     * 阻塞stub
     */
    private HelloWorldServiceGrpc.HelloWorldServiceBlockingStub serviceBl;


    @PostConstruct
    public void init() {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build();
        serviceBl = HelloWorldServiceGrpc.newBlockingStub(managedChannel);
    }


    public String sayHello(String firstName, String lastName) {
        Person person = Person.newBuilder().setFirstName(firstName).setLastName(lastName).build();
        Greeting greeting = serviceBl.sayHello(person);
        return greeting.getMessage();
    }

}
