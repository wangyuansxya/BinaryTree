package com.binary.tree;

/**
 * Created by wangyuan on 2017/3/15.
 */
public class Node {
    public String key;
    public Node left;
    public Node right;

    public Node(String key) {
        this.key = key;
    }

    public Node(String key, Node left, Node right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }
}
