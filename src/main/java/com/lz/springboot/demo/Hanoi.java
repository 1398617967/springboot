/**
 * FileName: Hanoi
 * Author:   liuzhuo
 * Date:     2018/11/1 13:38
 * Description: 用递归实现汉诺塔
 * History:
 * <author>          <time>          <version>          <desc>
 * liuzhuo        2018/11/1 13:38      1.0.0             描述
 */
package com.lz.springboot.demo;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用递归实现汉诺塔〉
 *
 * @author Administrator
 * @create 2018/11/1
 * @since 1.0.0
 */
public class Hanoi {

    public static void main(String [] args){
        hanoi(3,'A','B','C');
    }

    /**
     * 无论有多少个盘子,都认为只有两个,上面的所有盘子和最下面的一个盘子
     * @param n  共有n个盘子
     * @param from  开始的柱子
     * @param mid   中间的柱子
     * @param to    目标柱子
     */
    public static void hanoi(int n,char from,char mid, char to){
        if(n==1){
            System.out.println("第1个盘子从"+from+"移到"+to);
        }else {
            //移动上面所有盘子到中间位置
            hanoi(n-1,from,to,mid);
            System.out.println("第"+n+"个盘子从"+from+"移到"+to);
            //把上面所有的盘子从中间位置移动到目标位置
            hanoi(n-1,mid,from,to);

        }
    }
}
