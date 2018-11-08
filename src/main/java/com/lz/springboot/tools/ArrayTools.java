/**
 * FileName: ArrayTools
 * Author:   liuzhuo
 * Date:     2018/10/30 10:31
 * Description: 操作数组的工具类
 * History:
 * <author>          <time>          <version>          <desc>
 * liuzhuo        2018/10/30 10:31      1.0.0             描述
 */
package com.lz.springboot.tools;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈操作数组的工具类〉
 *
 * @author liuzhuo
 * @create 2018/10/30
 * @since 1.0.0
 */
public class ArrayTools {

    /** 获取数组长度的方法 */
    public static int size(int[] elements){
        return elements.length;
    }

    /** 往数组的末尾添加一个元素 */
    public static int[] add(int element,int[] elements){
        //创建一个新数组
        int[] newArr = new int[elements.length+1];
        int len = elements.length;
        //把原数组中的元素复制到新数组中
        for(int i = 0; i<len;i++){
            newArr[i] = elements[i];
        }
        //把添加的元素放入新数组中
        newArr[elements.length] = element;
        return newArr;
    }

    /** 删除数组中的元素 */
    public static int[] delete(int index,int[] elements){
        if(index<0 || index > elements.length-1){
            throw new RuntimeException("下标越界");
        }
        //创建一个新数组,长度为原数组长度-1
        int[] newArr = new int[elements.length-1];
        int len = newArr.length;
        //复制原有数据到新数组
        for (int i =0; i<len;i++){
            //需要删除的元素前边的元素
            if(i<index){
                newArr[i] = elements[i];
            }else {
                //需要删除的元素后面的元素
                newArr[i] = elements[i+1];
            }
        }
        return newArr;
    }

    /** 获取指定位置的元素 */
    public static int get(int index,int[] elements){
        if(index<0 || index > elements.length-1){
            throw new RuntimeException("下标越界");
        }
        return elements[index];
    }

    /** 插入一个元素到指定位置 */
    public static int[] insert(int index,int element,int[] elements){
        if(index<0 || index > elements.length-1){
            throw new RuntimeException("下标越界");
        }
        //创建一个新数组
        int[] newArr = new int[elements.length+1];
        int len = elements.length;
        //将原数组中的数据复制到新数组中
        for (int i =0 ;i<len;i++){
            //目标位置之前的元素
            if(i<index){
                newArr[i] = elements[i];
            }else {
                //目标位置之后的元素
                newArr[i+1] = elements[i];
            }
        }
        //插入新的元素
        newArr[index] = element;
        return  newArr;
    }

    /** 替换指定位置的元素 */
    public static  int[] replace(int index,int element,int[] elements){
        if(index<0 || index > elements.length-1){
            throw new RuntimeException("下标越界");
        }
        elements[index] = element;
        return  elements;
    }

    /** 线性查找目标元素所对应的下标 */
    public static int findElementByLine(int element , int[] elements){
        int len = elements.length;
        for(int i=0; i<len; i++){
            if(elements[i]==element){
                return i ;
            }
        }
        return -1;
    }

    /** 二分法查找目标元素所对应的下标 */
    public static int findElementByBinary(int element , int[] elements){
        //记录开始位置
        int begin = 0;
        //记录结束位置
        int end = elements.length-1;
        //记录中间位置
        int mid = (begin + end) >>1;
        //记录目标位置
        int index = -1;
        //循环查找
        while (true){
            //如果开始位置在结束位置之后或者重合,则没有这个元素
            if(begin>=end){
                return -1;
            }
            //判断中间的元素是否是要查找的元素
            if(elements[mid] == element){
                index = mid;
                break;
            }else {
                //如果中间的元素比目标元素大
                if (elements[mid]>element){
                    //把结束位置调整到中间位置的前一个位置
                    end = mid-1;
                }else {
                    begin = mid+1;
                }
                //取出中间位置
                mid = (begin + end)>>1;
            }
        }
        return index;
    }

    /** 冒泡排序 */
    public static int[] bubbleSort(int[] elements){
        for(int i = 0;i<elements.length-1;i++){
            for (int j =0;j<elements.length-1-i;j++){
                if(elements[j]>elements[j+1]){
                    int temp = elements[j];
                    elements[j] = elements[j+1];
                    elements[j+1]=temp;
                }
            }
        }
        return  elements;
    }

    /** 快速排序 */
    public static int[] quickSort(int[] elements,int start,int end){
        if(start < end){
            //把数组中的第0个数字作为标准数
            int stard = elements[start];
            //记录需要排序的下标
            int low = start;
            int high = end;
            //循环找出比标准数大的数和比标准数小的数
            while (low<high){
                //右边的数字比标准数大
                while (low<high && stard <= elements[high]){
                    high--;
                }
                //使用右边的数字替换左边的数字
                elements[low] = elements[high];
                //如果左边的数字比标准数小
                while (low<high && stard >= elements[low]){
                    low++;
                }
                elements[high] = elements[low];
            }
            //把标准数赋值给低所在位置的元素(高位和低位重合)
            elements[low] = stard;
            //处理所有比标准数小的数字
            quickSort(elements,start,low);
            //处理所有比标准数小的数字
            quickSort(elements,low+1,end);
        }
       return elements;
    }

    /** 插入排序 */
    public static int[] insertSort(int[] elements){
        //遍历所有的数字
        for (int i = 1;i<elements.length;i++){
            //如果当前数字比前一个数字小
            if(elements[i]<elements[i-1]){
                int temp = elements[i];
                //遍历当前数字前面所有的数字
                int j;
                for(j = i-1;j>=0 && elements[j]>temp;j--){
                    //把前一个数字赋给后一个
                    elements[j+1] = elements[j];
                }
                //把临时变量(外层for循环的当前元素)赋给不满足条件的后一个元素
                elements[j+1] = temp;
            }
        }
        return elements;
    }
}

class  B {
    public static void main(String[] args){
        int [] arr = {11,222,24,84,195,0};
       arr= ArrayTools.insertSort(arr);
        System.err.println(Arrays.toString(arr));
    }
}
