package com.example.demo.helloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name,int age,Address address) {};
record Address(String state,String city) {};
@Configuration
public class HelloWorldConfiguration 
{
	
	@Bean
    public String name()
    {
		return "Prakhar";
    }
	@Bean
    public int age()
    {
		return 20;
    }
	@Bean
	public Person person()
	{
		var person=new Person("Prakhar",20,add());
		return person;
	}
	@Bean(name="address")
    public Address add()
    {
    	var add=new Address("Up","Budaun");
    	return add;
    }
	@Bean(name="person2")
	public Person person2methodcall()
	{
		var person2methodcall=new Person(name(),age(),add());
		return person2methodcall;
	}
    
    
}
