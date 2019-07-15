package com.bee.sample.ch1.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//RestController  等同于 @Controller+@ResponseBody
@Controller //mvc注解 负责处理web请求
public class HelloworldController {
	@RequestMapping(value= "/home/{html}",method=RequestMethod.GET)
 	@ResponseBody
	public String home(@PathVariable("html") String name) { //@RequestBody 表示返回文本
		if(name.equals("章三")) {
			return "张三";
		}
		return "Hell good night!";
	}
}
