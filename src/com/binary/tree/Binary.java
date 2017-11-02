package com.binary.tree;

/**
 * Created by wangyuan on 2017/3/15.
 */
public class Binary {
    /**
     * 构造树
     */
    public static Node init() {
        Node a = new Node("a");//一个二叉树的节点
        Node b = new Node("b", a, null);//将a节点作为b节点的左节点
        Node c = new Node("c");
        Node d = new Node("d", b, c);
        Node e = new Node("e");
        Node f = new Node("f", e, null);
        Node g = new Node("g", null, f);
        Node h = new Node("h", d, g);
        return h;
    }


    public static Node create() {
        Node g = new Node("g");
        Node h = new Node("h");//一个二叉树的节点
        Node f = new Node("f");
        Node e = new Node("e");
        Node d = new Node("d", h, null);
        Node c = new Node("c", f, g);
        Node b = new Node("b", d, e);//将a节点作为b节点的左节点
        Node a = new Node("a", b, c);
        return a;
    }
}
