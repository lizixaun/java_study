package com.lzixuan.modifier;

/**
 * @author 李子煊
 * @version 1.0
 */
public class B {
    public void say(){
        A a = new A();
        //在同一个包下，可以访问public , protected 和默认,不能访问private
        System.out.println(a.n1+""+a.n2+a.n3);//a.n4会报错因为是私有的

    }
}
