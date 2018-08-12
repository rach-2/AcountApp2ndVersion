package com.qa.AccountAppMaven;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
public class Main 
{

	public static void main(String[] args) 
	{
		 SpringApplication.run(AppControler.class, args);

	}
	



}
