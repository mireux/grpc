package com.mireux.grpcclient.service.impl;

import com.mireux.grpcclient.client.HelloWorldClient;
import com.mireux.grpcclient.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>在开始处详细描述该类的作用</p>
 *
 * @author haijie.liang@juphoon.com
 * @date 2023/1/29 09:57
 */
@Service
@Slf4j
public class HelloServiceImpl implements HelloService {
    private final HelloWorldClient helloWorldClient;

    public HelloServiceImpl(HelloWorldClient helloWorldClient) {
        this.helloWorldClient = helloWorldClient;
    }

    @Override
    public String hello(String firstName, String lastName) {
        log.info("firstName:{},lastName:{}", firstName, lastName);
        return helloWorldClient.sayHello(firstName, lastName);
    }
}
