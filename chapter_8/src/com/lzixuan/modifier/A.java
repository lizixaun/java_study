package com.lzixuan.modifier;

/**
 * @author 李子煊
 * @version 1.0
 */
public class A {
    public int n1=100;
    protected int n2=200;
    int n3=300;
    private int n4=400;
    public void m1(){
        System.out.println(n1+n2+n3+n4);//没有报错，也就是说同类是都可以访问的
    }
}
