/**
 * FileName: ServletInitializer
 * Author:   liuzhuo
 * Date:     2018/10/6 11:43
 * Description: 使用jsp必须实现SpringBootServletInitializer接口
 * History:
 * <author>          <time>          <version>          <desc>
 * liuzhuo        2018/10/6 11:43      1.0.0             描述
 */
package com.lz.springboot.controller;

import com.lz.springboot.SpringbootWebApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 〈一句话功能简述〉<br>
 * 〈使用jsp必须实现SpringBootServletInitializer接口〉
 *
 * @author Administrator
 * @create 2018/10/6
 * @since 1.0.0
 */
public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootWebApplication.class);
    }
}
