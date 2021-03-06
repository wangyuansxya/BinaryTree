package com.binary.tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by wangyuan on 2017/3/15.
 * 二叉树的先序遍历
 * 1，递归的遍历方法
 * 2，非递归的遍历方法
 *
 * 说明：先序遍历，中序遍历和后序遍历都是相对于根节点来说的，而左子树和右子树的遍历顺序一定是先左后右
 */
public class BinaryTree extends com.binary.tree.Binary {

    /**
     * 访问节点
    * @param node
     */
    public static void visit(Node node) {
        System.out.print(node.key + ",");
    }

    /**
     * 递归实现前序遍历
     * 遍历顺序是根节点-左子树-右子树
     * h, d, b, a, c, g, f, e
     */
    public static void leftRecursive(Node node) {
        if (node != null) {
            visit(node);
            leftRecursive(node.left);
            leftRecursive(node.right);
        }
    }

    /**
     * 递归实现中序遍历
     * 遍历顺序是左子树-根节点-右子树
     * d,
     */
    public static void centerRecursive(Node node) {
        if (node != null) {
            centerRecursive(node.left);
            visit(node);
            centerRecursive(node.right);
        }
    }

    /**
     * 递归实现后序遍历
     * 遍历顺序是左子树-右子树-根节点
     */
    public static void rightRecursive(Node node) {
        if (node != null) {
            rightRecursive(node.left);
            rightRecursive(node.right);
            visit(node);
        }
    }

    //非递归实现的前序遍历
    /**
     * //栈 特点后进的先出 即先访问的后进栈
     * 对于每一个节点的来说访问的顺序都应该是根左右
     * hdbacgfe
     * @param node
     */
    public static void leftUnRecursiveStack(Node node) {
        Stack<Node> stack = new Stack<Node>();
        if(node != null) {
            stack.push(node);
            while (!stack.empty()) {
                node = stack.pop();
                visit(node);
                if(node.right != null) {
                    stack.push(node.right);
                }
                if(node.left != null) {
                    stack.push(node.left);
                }
                //为什么p.getLeft() 在后，getRight()在前应为while 循环第一句就是pop visit所以要把left放上，先访问。之中方法是即压即访问法。
                //此处是由于栈的特点决定的
            }
        }
    }
    public static void leftUnRecursiveStack2(Node node) {
        Stack<Node> stack = new Stack<Node>();
        while (node != null || stack.size() > 0) {
            while (node != null) {
                visit(node);
                stack.push(node);
                node = node.left;
            }
            if(stack.size() > 0) {
                node = stack.pop();
                node = node.right;
            }
        }
    }

    /**
     * 使用队列进行层次访问
     * @param node
     */
    public static void leftUnRecursiveQueue(Node node) {
        Queue<Node> queue = new ArrayDeque<Node>();
        if(node != null) {
            queue.offer(node);
            while (!queue.isEmpty()) {
                node = queue.poll();
                visit(node);
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
    }

    //非递归实现的中序遍历
    /**
     * //栈 特点后进的先出 左根右
     * 因此这里的思路应该是先将右子树的节点放入栈中-根节点-左子树节点
     * 对于每一个节点的来说访问的顺序都应该是左根右
     * a,b,d,c,h,g,e,f
     * feghcdba
     * @param node
     */
    public static void centerUnRecursiveStack(Node node) {
        Stack<Node> stack = new Stack<Node>();
        while (node != null || stack.size() > 0) {
            //左子树入栈
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            if (stack.size() > 0) {
                node = stack.pop();
                visit(node);
                node = node.right;
            }
        }
    }


    //非递归实现的后序遍历
    /**
     * 左右根
     * 对于每一个节点的来说访问的顺序都应该是左右根
     * //栈 特点后进的先出
     * abcdefgh
     * @param node
     */
    public static void rightUnRecursiveStack(Node node) {
        Stack<Node> stack = new Stack<Node>();
        Node t = node;
        while (node != null) {
            // 左子树入栈
            while (node.left != null) {
                stack.push(node);
                node = node.left;
            }
            // 当前节点无右子或右子已经输出
            while (node != null && (node.right == null || node.right == t)) {
                visit(node);
                t = node;// 记录上一个已输出节点
                if (stack.empty())
                    return;
                node = stack.pop();
            }
            // 处理右子
            stack.push(node);
            node = node.right;
        }
    }

    public static int countTree(Node node) {
        if(node == null) {
            return 0;
        } else {
           return countTree(node.left) + countTree(node.right) + 1;
        }
    }

    /**
     * 求出二叉树深度的递归算法
     * @param root
     * @return
     * 思路：若一一棵二叉树为空，那么它的深度为0，否则它的深度等于左子树和右子树中的最大深度+1
     */
    public static int depthBTree(Node root) {
        if(root == null) {
            return 0;
        }else {
            int dep1 = depthBTree(root.left);
            int dep2 = depthBTree(root.right);
            if(dep1 > dep2) {
                return dep1 + 1;
            }else {
                return dep2 + 1;
            }
        }
    }

    /**
     * 查找节点
     * @param root
     * @param x
     * @return
     */
    public static Node findBTree(Node root, Object x) {
        if(root == null) {
            return null;
        }else {
            if(root.key.equals(x)) {
                return root;
            } else {
                Node o = findBTree(root.left, x);
                if(o != null) {
                    return o;
                }
                o = findBTree(root.right, x);
                if(o != null) {
                    return o;
                }
            }
            return null;
        }
    }
}
