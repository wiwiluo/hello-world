package com.saeba.dao.impl;

import com.saeba.dao.HelloWorldDao;

/**
 * Created by wiwil on 2017/4/9.
 */
public class HelloWorldDaoImpl implements HelloWorldDao
{

    @Override
    public void saveSayHelloUser(String username)
    {
        System.out.println("save username : " + username);
    }
}
