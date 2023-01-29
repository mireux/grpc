package com.mireux.grpcclient.service;

/**
 * <p>在开始处详细描述该类的作用</p>
 *
 * @author haijie.liang@juphoon.com
 * @date 2023/1/29 09:57
 */
public interface HelloService {

    /**
     * hello test
     *
     * @param firstName 姓
     * @param lastName  名
     * @return 结果
     */
    String hello(String firstName, String lastName);

}
