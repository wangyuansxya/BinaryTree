package com;

/**
 * Created by wangyuan on 2017/3/16.
 */
public class Test {
    public static void main(String args[]) {
        int i = 127;
        Integer i1= 127;
        System.out.println(i == i1.intValue());

        int j = -100;

        System.out.println(Math.abs(j));
    }
}
