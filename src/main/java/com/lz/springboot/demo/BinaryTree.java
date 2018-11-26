/**
 * FileName: BinaryTree
 * Author:   liuzhuo
 * Date:     2018/11/2 9:26
 * Description: 二叉树
 * History:
 * <author>          <time>          <version>          <desc>
 * liuzhuo        2018/11/2 9:26      1.0.0             描述
 */
package com.lz.springboot.demo;

/**
 * 〈一句话功能简述〉<br>
 * 〈二叉树〉
 *
 * @author Administrator
 * @create 2018/11/2
 * @since 1.0.0
 */
public class BinaryTree {
    TreeNode root;

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void frontShow() {
        if (root != null) {
            root.frontShow();
        }
    }

    public void midShow() {
        if (root != null) {
            root.midShow();
        }
    }

    public void endShow() {
        if (root != null) {
            root.endShow();
        }
    }

    public TreeNode frontSearch(int i) {
        return root.frontSearch(i);
    }

    public void delete(int i) {
        if (root.value == i) {
            root = null;
        } else {
            root.delete(i);
        }
    }
}


class Test2 {
    public static void main(String[] args) {
        //创建一棵树
        BinaryTree binaryTree = new BinaryTree();
        //创建一个根节点
        TreeNode root = new TreeNode(1);
        //把根节点赋给树
        binaryTree.setRoot(root);

        TreeNode rootL = new TreeNode(2);
        TreeNode rootR = new TreeNode(3);
        //把新创建的节点设置为根节点的子节点
        root.setLeftNode(rootL);
        root.setRigntNode(rootR);

        //为第二层的左节点创建两个子节点
        rootL.setLeftNode(new TreeNode(4));
        rootL.setRigntNode(new TreeNode(5));
        //为第二层的右节点创建两个子节点
        rootR.setLeftNode(new TreeNode(6));
        rootR.setRigntNode(new TreeNode(7));
        //前序遍历树
        binaryTree.frontShow();
        System.out.println("===============================");
        //中序遍历
        binaryTree.midShow();
        System.err.println("===============================");
        //后序遍历
        binaryTree.endShow();
        System.err.println("===============================");
        //前序查找
        TreeNode five = binaryTree.frontSearch(5);
        System.err.println(five);
        //删除一个子树
        binaryTree.delete(1);
        binaryTree.frontShow();
    }
}
