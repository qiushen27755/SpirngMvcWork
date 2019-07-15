package com.bee.sample.ch1.param;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//get
public class Params3 {
		@GetMapping("param3")						//修改 required =false //可以不传
		public String hello(@RequestParam(value="name",defaultValue="admin")String name) {
			//不传	http://localhost:8080/hello?name=admin 格式 默认admin

			return ""+name;
		}
}
