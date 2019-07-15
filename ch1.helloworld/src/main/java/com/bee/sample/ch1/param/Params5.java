package com.bee.sample.ch1.param;

import java.io.IOException;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//Post字符文本
public class Params5 {
	public static Logger log = LoggerFactory.getLogger(Params4.class);

	@PostMapping("/param5")
	public String postString(HttpServletRequest request) {
		ServletInputStream is = null;
		StringBuffer sb=null;
	    try {
	        is = request.getInputStream();
	         sb=new StringBuffer();//
	        byte[] buf = new byte[1024];
	        int len = 0;
	        while ((len = is.read(buf)) != -1) {
	            sb.append(new String(buf, 0, len));
	        }
	        System.out.println(sb.toString());
	        return sb.toString();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (is != null) {
	                is.close();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    log.info(sb.toString());
	    return null;
	}
}
