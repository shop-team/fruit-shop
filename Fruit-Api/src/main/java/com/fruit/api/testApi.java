package com.fruit.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ${DESCRIPTION}
 * @author 张进
 * @create 2017-09-29 17:04
 **/

@RestController
@RequestMapping("/api/test")
@Api(value = "测试swagger")
public class testApi {
    @GetMapping(value = "/test1")
    @ApiOperation(value = "测试接口1",notes = "测试说明1")
    public String test1(){
        return null;
    }
}

