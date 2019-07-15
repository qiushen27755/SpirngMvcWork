package com.bee.sample.ch1.param;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//get
@RestController
public class Params1 {
	@GetMapping("/param1/{name}")
	//http://localhost:8080/hello/lisi
	public String param(@PathVariable("name")String name) {
		return ""+name;
	}
}
