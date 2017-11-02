package com.binary.tree;

/**
 * Created by wangyuan on 2017/3/15.
 */
public class TestMain {
    public static void main(String[] args) {
        Node node = BinaryTree.create();
        /*BinaryTree.leftRecursive(node);
        BinaryTree.centerRecursive(node);
        BinaryTree.rightRecursive(node);*/
        //先序遍历
        System.out.println("先序遍历");
        BinaryTree.leftRecursive(node);
        System.out.println();
        BinaryTree.leftUnRecursiveStack(node);
        System.out.println();
        BinaryTree.leftUnRecursiveStack2(node);
        System.out.println();
        System.out.println("队列层级遍历");
        BinaryTree.leftUnRecursiveQueue(node);
        System.out.println();

        //中序遍历
        System.out.println("中序遍历");
        BinaryTree.centerRecursive(node);
        System.out.println();
        BinaryTree.centerUnRecursiveStack(node);
        System.out.println();

        //后序遍历
        System.out.println("后序遍历");
        BinaryTree.rightRecursive(node);
        System.out.println();
        BinaryTree.rightUnRecursiveStack(node);
        System.out.println();
        //计算二叉树节点数
        System.out.println("计算二叉树节点数");
        System.out.println(BinaryTree.countTree(node));
        System.out.println();

        System.out.println("计算二叉树深度");
        System.out.println(BinaryTree.depthBTree(node));
        System.out.println();

        System.out.println("获取节点");
        System.out.println(BinaryTree.findBTree(node, "a").key);
        System.out.println();
    }
}
