package com.bee.sample.ch1.param;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsl.json.txt.MyJosnWork;

@RestController
//get
public class Params2 {
	@GetMapping("/param2")
	//http://localhost:8080/hello?name=admin  没有就报错
	public String hello(@RequestParam("name")String name) {
		return "param2"+name;
	}
	@GetMapping("/movies2")
	public String heMovie() {
		
		try {
			return MyJosnWork.getJson();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return "空空";
		}
	}
}
