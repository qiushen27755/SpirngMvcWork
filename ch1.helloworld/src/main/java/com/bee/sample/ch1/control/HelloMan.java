package com.bee.sample.ch1.control;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import lombok.Data;

@ConfigurationProperties(prefix = "person")
@Component
@Data //偷懒神器
@Validated //数据校验
	public class HelloMan {
		@Email
	    private String lastName;    //校验方前面即可，这个是必须email格式
		@Max(value=100,message="年龄不能超过100")
		private Integer age;
	    private Boolean boss;
	    private Date birth;
	    private Map<String,Object> maps;
	    private List<String> lists;
 }
