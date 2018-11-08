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
public class ClodBinaryTree {
    ClodTreeNode root;

    /** 设置根节点 */
    public void setRoot(ClodTreeNode root) {
        this.root = root;
    }

    /** 获取根节点 */
    public ClodTreeNode getRoot() {
        return root;
    }

    /** 中序线索化二叉树 */
    public void clodNodes(){
        clodNodes(root);
    }

    public void clodNodes(ClodTreeNode root){

    }

    /** 前序遍历 */
    public void frontShow(){
       if(root != null){
           root.frontShow();
       }
    }

    /** 中序遍历 */
    public void midShow(){
        if(root != null) {
            root.midShow();
        }
    }

    /** 后序遍历 */
    public void endShow(){
        if(root != null){
            root.endShow();
        }
    }

    /** 前序查找 */
    public ClodTreeNode frontSearch(int i ){
        return  root.frontSearch(i);
    }

    /** 删除子树 */
    public void delete(int i ){
       if(root.value == i){
           root = null;
       }else {
           root.delete(i);
       }
    }
}


class Test1{
    public static void main(String[] args){

    }
}
