package com.example.demo.helloWorld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2HelloWorldSpring 
{

	public static void main(String[] args) 
	{
	//1.launch a Spring context 
		//try with recourses ,this managed all the upcoming errors
		try(
		var context=new AnnotationConfigApplicationContext(HelloWorldConfiguration.class))
		{
        
	//2. Configure the things that we want Spring to manage	
	     //HelloWorldConfiguration-@Configuration	
		 //name - @Bean
	//3.Retrieving Beans managed by Spring	
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address"));
		System.out.println(context.getBean(Address.class));
		System.out.println(context.getBean("person2"));
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}

}
