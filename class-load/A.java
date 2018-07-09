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
 * @ClassName A
 * @Description TODO
 * @Date 2018/07/09 14:37
 * @Author yuan yi xiong
 * @Version 1.0
 **/
public class A {

    private Logger logger = LoggerFactory.getLogger(getClass());

    public A() {
        System.out.println("A()");
    }

    {
        System.out.println("代码块 a static1 begin");
    }

    static {
        System.out.println("a static1");
    }

    {
        System.out.println("代码块 a static1 end");
    }

    public static void main(String[] args) {

        System.out.println("main");

        C b1 = new B();
        System.out.println("..............................");
        C b2 = new B();
        System.out.println("..............................");
        A a1 = new A();
        System.out.println("..............................");
        A a2 = new A();

    }

    {
        System.out.println("代码块 a static1 begin");
    }

    static {
        System.out.println("a static2");
    }

    {
        System.out.println("代码块 a static2 end");
    }
}
