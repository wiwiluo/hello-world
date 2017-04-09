package com.saeba.demo;

import com.saeba.service.HelloWorldService;
import com.saeba.service.impl.HelloWorldServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

/**
 * Created by wiwil on 2017/4/9.
 */
public class HelloWorld
{

    public static void main(String[] args)
    {
        HelloWorldService service = new HelloWorldServiceImpl();
        String words = service.sayHello("77sama");
        System.out.println(words);
    }

}
