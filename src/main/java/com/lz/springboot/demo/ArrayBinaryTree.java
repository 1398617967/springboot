/**
 * FileName: ArrayBinaryTree
 * Author:   liuzhuo
 * Date:     2018/11/5 14:43
 * Description: 把数组看成完全二叉树遍历
 * History:
 * <author>          <time>          <version>          <desc>
 * liuzhuo        2018/11/5 14:43      1.0.0             描述
 */
package com.lz.springboot.demo;

/**
 * 〈一句话功能简述〉<br>
 * 〈把数组看成完全二叉树遍历〉
 *
 * @author Administrator
 * @create 2018/11/5
 * @since 1.0.0
 */
public class ArrayBinaryTree {

    int[] data;

    public ArrayBinaryTree(int[] data) {
        this.data = data;
    }

    public void frontShow() {
        frontShow(0);
    }

    /**
     * 前序遍历
     *
     * @param index
     */
    public void frontShow(int index) {
        if (data == null || data.length == 0) {
            return;
        }
        //先遍历当前节点的内容
        System.out.println(data[index]);
        //2*index +1  处理左节点
        if (2 * index + 1 < data.length) {
            frontShow(2 * index + 1);
        }
        //2*index +2  处理右节点
        if (2 * index + 2 < data.length) {
            frontShow(2 * index + 2);
        }
    }
}


class TestArrayBinaryTree {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 4, 5, 6, 7};
        ArrayBinaryTree tree = new ArrayBinaryTree(data);
        tree.frontShow();
    }
}