/********************************************
 * Copyright (c) , yuan yi xiong
 *
 * All rights reserved
 *
 *********************************************/
package online.shixun.demo.eshop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLOutput;

/**
 * @ClassName B
 * @Description TODO
 * @Date 2018/07/09 14:37
 * @Author yuan yi xiong
 * @Version 1.0
 **/
public class B extends C {

    private Logger logger = LoggerFactory.getLogger(getClass());

    public B(){
        System.out.println("B()");
    }


    {
        System.out.println("代码块 b static1 begin");
    }

    static {
        System.out.println("b static1");
    }

    {
        System.out.println("代码块 b static1 end");
    }

    {
        System.out.println("代码块 b static1 begin");
    }

    static {
        System.out.println("b static2");
    }

    {
        System.out.println("代码块 b static2 end");
    }

}
