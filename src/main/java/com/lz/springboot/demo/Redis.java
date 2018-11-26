/**
 * FileName: Redis
 * Author:   liuzhuo
 * Date:     2018/11/26 14:01
 * Description: 测试jedis
 * History:
 * <author>          <time>          <version>          <desc>
 * liuzhuo        2018/11/26 14:01      1.0.0             描述
 */
package com.lz.springboot.demo;

import redis.clients.jedis.Jedis;

import java.util.Iterator;
import java.util.Set;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试jedis〉
 *
 * @author liuzhuo
 * @create 2018/11/26
 * @since 1.0.0
 */
public class Redis {
    public static void main(String[] args){
        //链接redis服务器
        Jedis jedis = new Jedis("192.168.1.172",6379);
        System.err.println("检查服务是否正常"+jedis.ping());
        Set<String> keys = jedis.keys("*");
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
