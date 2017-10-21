package com.fruit.api;

import com.fruit.permission.model.Permission;
import com.fruit.permission.service.PermissionService;
import com.fruit.utils.ResponseVO;
import com.fruit.utils.SysConstants;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * ${DESCRIPTION}
 * 
 * @author 张进
 * @create 2017-09-29 17:04
 **/
@RestController
@RequestMapping("/api/test")
@Api(value = "测试swagger")
public class testApi {
	@Autowired
	PermissionService service;

	@GetMapping(value = "/test1")
	@ApiOperation(value = "测试接口1", notes = "测试说明1")
	public String test1() {
		int a = 100 / 0;
		return String.valueOf(a);
	}

	@GetMapping(value = "/testError")
	@ApiOperation(value = "测试错误", notes = "测试全局异常")
	public ResponseVO testError() {
		Permission permission = new Permission();
		permission.setCreateTime(new Date());
		permission.setPermissionName("测试");
		permission.setPermissionRemark("秒杀");
		permission.setPermissionUrl("/rul");
		int a = service.insertPermission(permission);
		return new ResponseVO(SysConstants.STATUS_NORMAL, "插入成功", a);
	}
}