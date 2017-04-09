package com.saeba.web;

import com.saeba.domain.User;

/**
 * Created by wiwil on 2017/4/9.
 */
public class HelloWorldServlet
{

    public static void main(String[] args)
    {
        User user = new User();
        user.setUserID(1);
        user.setUsername("77sama");
        user.setAge(30);
        user.setSex("男");
        System.out.println(user);
    }

}
