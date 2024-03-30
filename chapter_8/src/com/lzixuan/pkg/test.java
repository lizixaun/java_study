package com.lzixuan.pkg;

import com.lzixuan.modifier.A;

/**
 * @author 李子煊
 * @version 1.0
 */
public class test {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.n1);//其他不行。在不同包下面

    }
}
