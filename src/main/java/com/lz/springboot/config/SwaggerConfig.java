/**
 * FileName: SwaggerConfig
 * Author:   liuzhuo
 * Date:     2018/10/30 8:42
 * Description: swagger配置
 * History:
 * <author>          <time>          <version>          <desc>
 * liuzhuo        2018/10/30 8:42      1.0.0             描述
 */
package com.lz.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 〈一句话功能简述〉<br>
 * 〈swagger配置〉
 *
 * @author Administrator
 * @create 2018/10/30
 * @since 1.0.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.lz.springboot"))
                .paths(PathSelectors.any()).build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger测试")
                .description("这是一个Swagger的测试")
                .termsOfServiceUrl("http://blog.csdn.net/java_yes")
                .version("1.0").build();
    }

}
