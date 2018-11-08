/**
 * FileName: config
 * Author:   Administrator
 * Date:     2018/9/30 20:07
 * Description: 这是一个测试自定义配置文件映射
 * History:
 * <author>          <time>          <version>          <desc>
 * liuzhuo        2018/9/30 20:07      1.0.0             描述
 */
package com.lz.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br>
 * 〈这是一个测试自定义配置文件映射〉
 *
 * @author liuzhuo
 * @create 2018/9/30
 * @since 1.0.0
 */
@Component
@ConfigurationProperties(prefix = "boot")
@PropertySource(value = "classpath:application.yml", ignoreResourceNotFound = true)
public class Config {
    /**
     * 年龄
     */
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
