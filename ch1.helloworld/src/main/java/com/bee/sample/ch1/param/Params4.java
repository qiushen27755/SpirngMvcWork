package com.bee.sample.ch1.param;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//post
public class Params4 {
	public static Logger log = LoggerFactory.getLogger(Params4.class);
	@PostMapping("/param4")
	public String hello(String name,String age) {
		log.info(name+age);
		return "name"+name+":"+age;
	}
 }
