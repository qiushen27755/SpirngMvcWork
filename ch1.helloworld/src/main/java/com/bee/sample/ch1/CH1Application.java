package com.bee.sample.ch1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;


 
@SpringBootApplication
@EnableCaching //缓存
@Configuration //
public class CH1Application {
	
    public static void main( String... args )
    {
       SpringApplication.run(CH1Application.class, args);
    }
}	
