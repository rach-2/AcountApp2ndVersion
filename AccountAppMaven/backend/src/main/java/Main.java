package com.qa.AccountAppMaven;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
//@EnableAutoConfiguration(exclude={DataSourceConfiguration.class})
@SpringBootApplication
//@EnableConfigurationProperties(Main.class)
public class Main 
{
	public static void main(String[] args) 
	{
		
		SpringApplication.run(Main.class, args);
	}	
	
	
	
}