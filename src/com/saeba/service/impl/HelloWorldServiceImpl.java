package com.saeba.service.impl;

import com.saeba.dao.HelloWorldDao;
import com.saeba.dao.impl.HelloWorldDaoImpl;
import com.saeba.service.HelloWorldService;

/**
 * Created by wiwil on 2017/4/9.
 */
public class HelloWorldServiceImpl implements HelloWorldService {

    private HelloWorldDao dao = new HelloWorldDaoImpl();

    @Override
    public String sayHello(String username) {
        dao.saveSayHelloUser(username);
        return username + " say HELLO!";
    }
}
