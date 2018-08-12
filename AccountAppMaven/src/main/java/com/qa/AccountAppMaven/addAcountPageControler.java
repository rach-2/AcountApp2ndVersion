package com.qa.AccountAppMaven;
import org.apache.catalina.connector.Request;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
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
@RequestMapping("/api/v1/AddAccountPage")
public class addAcountPageControler() 
{
	 @GetMapping
	  pulbic  ArrayList<AcountAppPage> getAcounts()
	  {
   	     return accounts;
	  }
      @PostMapping
      @ResponseStatus(HttpStatus.CREATED)
     public  void addAccount(@RequestBody AddAcountPage addingAcount){
    	  
    	  addingAcount.getFirstName();
    	  addingAcount.getLastName();
    	  addingAcount.getAccountNamber();
  	 
      }
      
     @
    	    
      

    	        
    }
     
    
     
       
    
     
}
