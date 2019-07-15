package com.bee.sample.ch1.param;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bee.sample.ch1.vo.User;
import com.qsl.json.txt.MyJosnWork;

@RestController
public class Params6 {
	public static Logger log = LoggerFactory.getLogger(Params4.class);

	@PostMapping("/param6")
	public Map<String,Object> save(@RequestBody User user){
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("user", user);
		log.info(map.toString());
		return map;
	}
	@PostMapping("/movie")
	public String movies(@RequestBody User user) throws IOException {
		if(user.getName().equals("rn")) {
			log.info(MyJosnWork.getJson().substring(0,80));
			return  MyJosnWork.getJson();
		}
		return "空空如也";
	}
	@PostMapping("/user")
	public String user(@RequestBody String user) {
		log.info(user.toString());
		return null;
	}
}
