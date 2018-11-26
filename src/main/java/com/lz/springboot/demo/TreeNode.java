/**
 * FileName: TreeNode
 * Author:   liuzhuo
 * Date:     2018/11/2 16:16
 * Description: 节点
 * History:
 * <author>          <time>          <version>          <desc>
 * liuzhuo        2018/11/2 16:16      1.0.0             描述
 */
package com.lz.springboot.demo;

/**
 * 〈一句话功能简述〉<br>
 * 〈节点〉
 *
 * @author Administrator
 * @create 2018/11/2
 * @since 1.0.0
 */
public class TreeNode {
    /**
     * 节点的权
     */
    int value;
    /**
     * 左后代
     */
    TreeNode leftNode;
    /**
     * 右后代
     */
    TreeNode rigntNode;

    public TreeNode(int value) {
        this.value = value;
    }

    public void setLeftNode(TreeNode lNode) {
        this.leftNode = lNode;
    }

    public void setRigntNode(TreeNode rNode) {
        this.rigntNode = rNode;
    }


    public void frontShow() {
        //先遍历当前节点的内容
        System.err.println(value);
        //左节点
        if (leftNode != null) {
            leftNode.frontShow();
        }
        //右节点
        if (rigntNode != null) {
            rigntNode.frontShow();
        }
    }

    public void midShow() {
        //左节点
        if (leftNode != null) {
            leftNode.midShow();
        }
        //先遍历当前节点的内容
        System.err.println(value);
        //右节点
        if (rigntNode != null) {
            rigntNode.midShow();
        }
    }


    public void endShow() {
        //左节点
        if (leftNode != null) {
            leftNode.endShow();
        }

        //右节点
        if (rigntNode != null) {
            rigntNode.endShow();
        }

        //先遍历当前节点的内容
        System.err.println(value);
    }

    public TreeNode frontSearch(int i) {
        TreeNode target = null;
        //对比当前节点的值
        if (this.value == i) {
            return this;
        } else {
            //查找左节点
            if (leftNode != null) {
                target = leftNode.frontSearch(i);
            }
            if (target != null) {
                return target;
            }
            if (rigntNode != null) {
                target = rigntNode.frontSearch(i);
            }
        }
        return target;
    }

    public void delete(int i) {
        TreeNode parent = this;
        if (parent.leftNode != null) {
            if (parent.leftNode.value == i) {
                parent.leftNode = null;
                return;
            } else {
                parent.leftNode.delete(i);
            }
        }

        if (parent.rigntNode != null) {
            if (parent.rigntNode.value == i) {
                parent.rigntNode = null;
                return;
            } else {
                parent.rigntNode.delete(i);
            }
        }
    }
}
