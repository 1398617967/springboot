/**
 * FileName: Demo
 * Author:   Administrator
 * Date:     2018/9/29 11:21
 * Description: Demo
 * History:
 * <author>          <time>          <version>          <desc>
 * liuzhuo        2018/9/29 11:21      1.0.0             描述
 */
package com.lz.springboot.controller;

import com.lz.springboot.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 〈一句话功能简述〉<br>
 * 〈Demo〉
 *
 * @author Administrator
 * @create 2018/9/29
 * @since 1.0.0
 */
@Controller
@RequestMapping("/springboot")
public class Demo {
    /**
     * 自定义属性配置ip
     */
    @Value("${boot.ip}")
    private String ip;

    /**
     * 自定义属性配置名字
     */
    @Value("${boot.name}")
    private String name;

    /**
     * 注入config类
     */
    @Autowired
    private Config config;

    /**
     * 功能描述: 〈〉
     *
     * @param: []
     * @return: java.lang.String
     * @since: 1.0.0
     * @author: liuzhuo
     * @Date: 2018/9/29 11:23
     */
    @RequestMapping("/test")
    public String test() {
        return "Hello World" + ip + "hah" + name + "年龄:" + config.getAge();
    }

    /**
     * 功能描述: 〈〉
     *
     * @param: [model]
     * @return: java.lang.String
     * @since: 1.0.0
     * @author: liuzhuo
     * @Date: 2018/10/2 14:03
     */
    @RequestMapping("/toJsp")
    public String toJsp(Model model) {
        model.addAttribute("msg", "springboot集成jsp");
        return "index";
    }
}
