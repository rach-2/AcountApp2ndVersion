package com.qa.AccountAppMaven;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus; 
import org.springframework.stereotype.Controller;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/")
public class AcountControler
	{

     
	   
	   // @Autowired 
	    //private HashMap<Integer,Acount> accounts;
	    //private int count=0;
//        Acount account1 = new  Acount("booby", "booby", "0098908");
//	    accounts.put(1,account1);
	    
	    
	    @Autowired
	    AcccountResponisity acountRepsosiity;
	 
//       public HashMap<Integer,Acount> getAcounts(){
//  	          return accounts;
//	  } 
	    @GetMapping("/api/v1/Accounts")
		@ResponseStatus(HttpStatus.OK)
	    public void getAccounts()
	    {
	    	acountRepsosiity.findAll();
	    }
        @PostMapping("/api/v1/Accounts")
        @ResponseStatus(HttpStatus.CREATED)
        public void addAccount(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String AccountNumber )
      {
//    	       count++;
	          Acount acccountToAdd = new Acount(firstName, lastName, AccountNumber);
//    	       accounts.put(count, acccountToAdd);
        	   acountRepsosiity.save(acccountToAdd);
    	       
      } 
      
//      @DeleteMapping("/api/v1/Accounts{id}")
//      @ResponseStatus(HttpStatus.NO_CONTENT)
//      public void  deteleAccount(@RequestBody Acount accountToDetelte)
//      {
//    	  acountRepsosiity.removeOne();
//      }
      
      @PutMapping("/api/v1/Account{id}")
      @ResponseStatus(HttpStatus.CREATED)
      public void addAccount(@RequestBody Acount acountToChage)
      {
    	      h
      }
      
}
