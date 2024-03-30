package com.lzixuan.modifier;

/**
 * @author 李子煊
 * @version 1.0
 */
public class test {
    public static void main(String[] args) {
        A a=new A();
        a.m1();//都可以输出，因为这个方法的名字前缀是public
        B b = new B();
        b.say();//

    }
}
