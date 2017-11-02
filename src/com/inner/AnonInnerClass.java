package com.inner;

/**
 * Created by wangyuan on 2017/3/17.
 * 测试匿名内部类
 */
public class AnonInnerClass {
    public String tag = "AnonInnerClass";

    public void print() {
        System.out.println(tag + "-----AnonInnerClass");
    }

    public interface AnonInnerListener {
        void onAnonInnerListenr();
    }
}
