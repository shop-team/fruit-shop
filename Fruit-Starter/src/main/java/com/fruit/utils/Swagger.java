package com.fruit.utils;

import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.function.Predicate;

/**
 * ${DESCRIPTION}
 * @author 张进
 * @create 2017-09-29 15:41
 **/
@Configuration
@EnableSwagger2
public class Swagger {

    @Bean
    public Docket createRestApi() {
//        Predicate<RequestHandler> predicate = new Predicate<RequestHandler>() {
//            public boolean test(RequestHandler input) {
//                Class<?> declaringClass = input.declaringClass();
//                // 排除BasicError
//                 if (declaringClass == BasicErrorController.class) {
//                     return false;
//                 }
//                // 被注解的类(被注释了RestController、Controller)
//                if (declaringClass.isAnnotationPresent(RestController.class) || declaringClass.isAnnotationPresent(Controller.class)) {
//                    return true;
//                }
//                // 被注解的方法
//                if (input.isAnnotatedWith(ResponseBody.class)) {
//                    return true;
//                }
//                return false;
//            }
//        };
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //只扫描api
                .apis(RequestHandlerSelectors.basePackage("com.fruit.api"))
                .paths(
                    //设置需要展示的接口信息
                    PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Fruit APIs").description("后端测试Api").version("0.1版本").build();
    }

}
