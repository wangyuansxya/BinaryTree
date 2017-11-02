package com.inner;

/**
 * Created by wangyuan on 2017/3/17.
 */
public class OuterClass {

    public int i = 0;
    public String s = "a";

    /**
     * 内部类
     * inner class
     * 相当于一个成员变量，是一个实例变量
     * 默认持有一个外部类的引用 --此处的引用应该是外部类的一个实例
     */
    public class InnerClass {

        public void print(){
            System.out.println(i + "-----" + s);
        }
    }

    /**
     * 内部类
     * static inner class
     * 不持有外部类的引用
     * 相当于一个静态的成员变量
     * 静态的变量就是类变量
     */
    public static class StaticInnerClass {

        public void print(){
            System.out.println(j + "-----static inner class");
        }
    }

    public static int j = 1;

    /**
     * member class
     */
    public MemberClass m = null;

    /**
     * 匿名内部类
     */
    public void anonInnerClass(final int i) {
        new AnonInnerClass() {
            @Override
            public void print() {
                super.print();
                System.out.println("i = " + i);
            }
        }.print();
    }

    //匿名类
    private AnonInnerClass.AnonInnerListener aIL = new AnonInnerClass.AnonInnerListener() {

        @Override
        public void onAnonInnerListenr() {

        }
    };




    public static void main(String[] args) {
        OuterClass o = new OuterClass();
        InnerClass i = o.new InnerClass();
        i.print();

        StaticInnerClass s = new StaticInnerClass();
        s.print();

        if(o.m == null)o.m = new MemberClass();
        o.m.print();

        o.anonInnerClass(3);
    }
}
