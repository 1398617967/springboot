/**
 * FileName: Node
 * Author:   liuzhuo
 * Date:     2018/10/31 15:36
 * Description: Node
 * History:
 * <author>          <time>          <version>          <desc>
 * liuzhuo        2018/10/31 15:36      1.0.0             描述
 */
package com.lz.springboot.demo;

/**
 * 〈双向循环链表〉<br>
 * 〈Node〉
 *
 * @author Administrator
 * @create 2018/10/31
 * @since 1.0.0
 */
public class Node {

    Node pre = this;
    Node next = this;
    int data;

    public Node(int data) {
        this.data = data;
    }

    /**
     * 新增节点
     */
    public void after(Node node) {
        //当前节点的下一个节点指向
        Node nextNode = this.next;
        //当前节点指向下一个节点
        this.next = node;
        //把下一个节点的前缀指向原节点
        node.pre = this;
        //把当前节点的前缀指向下一个节点
        nextNode.pre = node;
        //把下一个节点的后缀指向当前节点
        node.next = nextNode;
    }

    /**
     * 获取下一个节点
     */
    public Node getNext() {
        return this.next;
    }

    /**
     * 获取上一个节点
     */
    public Node getPre() {
        return this.pre;
    }

    /**
     * 获取数据
     */
    public int getData() {
        return this.data;
    }

}