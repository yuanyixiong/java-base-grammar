/********************************************
 * Copyright (c) , yuan yi xiong
 *
 * All rights reserved
 *
 *********************************************/
package online.shixun.demo.eshop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName C
 * @Description TODO
 * @Date 2018/07/09 14:37
 * @Author yuan yi xiong
 * @Version 1.0
 **/
public class C {

    private Logger logger = LoggerFactory.getLogger(getClass());

    public C(){
        System.out.println("C()");
    }


    {
        System.out.println("代码块 c static1 begin");
    }

    static {
        System.out.println("c static1");
    }

    {
        System.out.println("代码块 c static1 end");
    }

    {
        System.out.println("代码块 c static1 begin");
    }

    static {
        System.out.println("c static2");
    }

    {
        System.out.println("代码块 c static2 end");
    }
}
