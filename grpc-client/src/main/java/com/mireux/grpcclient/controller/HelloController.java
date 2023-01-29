package com.mireux.grpcclient.controller;

import com.mireux.grpcclient.client.TestStreamClient;
import com.mireux.grpcclient.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>在开始处详细描述该类的作用</p>
 *
 * @author haijie.liang@juphoon.com
 * @date 2023/1/29 09:58
 */
@RestController
public class HelloController {

    private final HelloService helloService;
    private final TestStreamClient testStreamClient;

    public HelloController(HelloService helloService, TestStreamClient testStreamClient) {
        this.helloService = helloService;
        this.testStreamClient = testStreamClient;
    }

    @GetMapping("/hello")
    public String hello(String firstName, String lastName) {
        return helloService.hello(firstName, lastName);
    }

    @GetMapping("/client")
    public void clientStream() {
        testStreamClient.printClient();
    }

    @GetMapping("/server")
    public void serverStream() {
        testStreamClient.printServer();
    }

    @GetMapping("/all")
    public void allStream() {
        testStreamClient.printAll();
    }
}
