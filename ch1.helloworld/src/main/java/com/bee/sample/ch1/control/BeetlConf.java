//package com.bee.sample.ch1.control;
//
//
//import org.beetl.core.resource.ClasspathResourceLoader;
//import org.beetl.ext.spring.BeetlGroupUtilConfiguration;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class BeetlConf {
//	@Value("${beetl.templatesPath}") String templatePath;//模板目录
//	@Bean(name="beetConfig")
//	public BeetlGroupUtilConfiguration  getBeetlGroupUtilConfiguration() {
//		BeetlGroupUtilConfiguration beetlConfiguration=new BeetlGroupUtilConfiguration();
//		//获取Spring Boot 的ClassLoader
//		ClassLoader loader=Thread.currentThread().getContextClassLoader();
//		
//		if(loader==null) {
//			loader= BeetlConf.class.getClassLoader(); //备选方案
//		}
//		
////		beetlConfiguration.setConfigProperties(extProperties);
//						//额外的配置,可以覆盖默认配置，一般不需要
//		
//		ClasspathResourceLoader cploader=new ClasspathResourceLoader(loader,templatespath);
//		
//		 beetlGroupUtilConfiguration.setResourceLoader(cploder);
//	        beetlGroupUtilConfiguration.init();
//	        //如果使用了优化编译器，涉及到字节码操作，需要添加ClassLoader
//	        beetlGroupUtilConfiguration.getGroupTemplate().setClassLoader(loader);
//	        return beetlGroupUtilConfiguration;
//
//	        }
//
//	        @Bean(name = "beetlViewResolver")
//	        public BeetlSpringViewResolver getBeetlSpringViewResolver(@Qualifier("beetlConfig") BeetlGroupUtilConfiguration beetlGroupUtilConfiguration) {
//	                BeetlSpringViewResolver beetlSpringViewResolver = new BeetlSpringViewResolver();
//	                beetlSpringViewResolver.setContentType("text/html;charset=UTF-8");
//	                beetlSpringViewResolver.setOrder(0);
//	                beetlSpringViewResolver.setConfig(beetlGroupUtilConfiguration);
//	                return beetlSpringViewResolver;
//	        }
//	
//}
