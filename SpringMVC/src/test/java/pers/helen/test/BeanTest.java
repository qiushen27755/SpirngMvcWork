package pers.helen.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.helen.ioc.pojo.Hello;

import pers.helen.ioc.service.UserServiceImpl;

public class BeanTest {
	public static void main(String[] args) {
		//获取applicationContext 容器
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Hello hello= (Hello) context.getBean("hello");
		System.out.println(hello.toString());
		
	 UserServiceImpl userService=(UserServiceImpl) context.getBean("service");
	 //此处方法的引用是根据getUser()的在XML的 ref属性
	 userService.getUser();
	}
}
