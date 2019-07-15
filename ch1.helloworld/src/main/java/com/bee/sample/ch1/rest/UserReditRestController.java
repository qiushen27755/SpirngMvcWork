package com.bee.sample.ch1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController //类似于用户的权限功能
public class UserReditRestController {
	@GetMapping("/userredit/{id}")//客户端请求地址 参数传递
	public Integer getCreditLevel(@PathVariable String id) {
		if(id.equals("123")) {
			return 123;
		}
		return 3;
	}
}
