package com.bee.sample.ch1.control.teat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

 import com.bee.sample.ch1.control.HelloMan;
 
@RestController
public class HellpAutowired {
	public static Logger log = LoggerFactory.getLogger(HellpAutowired.class);
	
	@Autowired
	private HelloMan person;
	
	@GetMapping("/")
	public String hello() {
		log.info(person.toString());
		log.info("111111111111111111111111111111111111111");
		return "hello autowired"+person.toString();
	}
}
