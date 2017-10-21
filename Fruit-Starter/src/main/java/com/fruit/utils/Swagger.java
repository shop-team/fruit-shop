package com.fruit.utils;
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
 * ${DESCRIPTION}
 * 
 * @author 张进
 * @create 2017-09-29 15:41
 **/
@Configuration
@EnableSwagger2
public class Swagger {
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.fruit.api"))// 只扫描api
				.paths(
				PathSelectors.any()).build();// 设置需要展示的接口信息
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Fruit APIs").description("后端测试Api").version("0.1版本").build();
	}
}