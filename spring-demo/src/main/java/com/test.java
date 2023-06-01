package com;

import com.config.AppConfig;
import com.domain.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		User user = context.getBean(User.class);
		System.out.println("name: "+ user.getName());
		System.out.println("age: "+ user.getAge());
	}
}
