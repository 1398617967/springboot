package com.lz.springboot.demo;

/**
 * 〈一句话功能简述〉<br> 
 * 〈线索二叉树的节点〉
 *
 * @author Administrator
 * @create 2018/11/2
 * @since 1.0.0
 */
public class ClodTreeNode {
    /** 节点的权 */
    int value;
    /** 左后代 */
    ClodTreeNode leftNode;
    /** 右后代 */
    ClodTreeNode rigntNode;
    /** 标识指针类型 */
    int leftType;
    int rightType;

    public ClodTreeNode(int value){
        this.value =value;
    }

    public void setLeftNode(ClodTreeNode lNode) {
        this.leftNode = lNode;
    }

    public void setRigntNode(ClodTreeNode rNode) {
        this.rigntNode = rNode;
    }

    public void frontShow(){
       //先遍历当前节点的内容
        System.err.println(value);
       //左节点
        if(leftNode!=null) {
            leftNode.frontShow();
        }
        //右节点
        if(rigntNode!=null) {
            rigntNode.frontShow();
        }
    }

    public void midShow(){
        //左节点
        if(leftNode!=null){
            leftNode.midShow();
        }
        //先遍历当前节点的内容
        System.err.println(value);
        //右节点
        if(rigntNode!=null) {
            rigntNode.midShow();
        }
    }

    public void endShow(){
        //左节点
        if(leftNode!=null){
            leftNode.endShow();
        }

        //右节点
        if(rigntNode!=null) {
            rigntNode.endShow();
        }

        //先遍历当前节点的内容
        System.err.println(value);
    }

    public ClodTreeNode frontSearch(int i){
        ClodTreeNode target=null;
       //对比当前节点的值
        if(this.value==i){
            return this;
        }else {
            //查找左节点
            if(leftNode!=null){
                target = leftNode.frontSearch(i);
            }
            if(target!=null){
                return target;
            }
            if(rigntNode!=null){
                target = rigntNode.frontSearch(i);
            }
        }
        return target;
    }

    public void delete(int i){
        ClodTreeNode parent = this;
        if(parent.leftNode!=null){
            if(parent.leftNode.value==i){
                parent.leftNode = null;
                return;
            }else {
                parent.leftNode.delete(i);
            }
        }

        if(parent.rigntNode!=null){
            if(parent.rigntNode.value==i){
                parent.rigntNode = null;
                return;
            }else {
                parent.rigntNode.delete(i);
            }
        }
    }
}
