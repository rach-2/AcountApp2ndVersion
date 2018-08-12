package com.qa.AccountAppMaven;
import java.util.HashMap;
import org.apache.catalina.connector.Request;
import org.aspectj.weaver.loadtime.Agent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus; 
@RestController
@RequestMapping("/api/")
public class AcountControler
	{

        
	   
 
	    @Autowired    
       private HashMap<Integer, Acount> accounts;
	    private int count =0;
	    
	   @GetMapping("/api/v1/Accounts")
	   @RepsoneSatus(HttpStatus.OK)
       public HashMap<Integer,Acount> getAcounts(){
  	          return accounts;
	  } 
	   
        @PostMapping("/api/v1/Accounts")
        @ResponseStatus(HttpStatus.CREATED)
        public void addAccount(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String AccountNumber )
      {
    	       count++;
    	       Acount acccountToAdd = new Acount(firstName, lastName, AccountNumber);
    	       accounts.put(count, acccountToAdd);
    	       
    	       
      } 
      
      @DeleteMapping("/api/v1/Accounts{id}")
      @ResposneSatus(HttpStatus.NO_CONTENT)
      public void  deteleAccount(Acount accountToDetelte)
      {.
               accounts.remove(accountToDetelte);
      }
      
      @PutMapping("/api/v1/Account{id}")
      @ResposneStatus(HttpStatus.CREATED)
      public void addAccount(Acount acountToChage())
      {
    	 
      }
      
      


   
    	  
    	  
      
     
    }
