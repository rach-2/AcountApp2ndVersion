package com.qa.AccountAppMaven;

//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.GeneratedValue;
//@JsonIgnoreProrties("hibernateLazzyIntails", "handler")
public class Acount
{
	 //@GenaratedValue(stategy = GenrationType.AUTO),
	private Integer id;
	 private String firstName;
	 private String  lastName;
	 private String accountNamber;
	public Acount(String firstName, String lastName, String accountNamber) {;
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNamber = accountNamber;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public String getAccountNamber() 
	{
		return accountNamber;
	}

	public void setAccountNamber(String accountNamber) 
	{
		this.accountNamber = accountNamber;
	}
	 
	public int getId()
	{
		return id;
	}
	
    public void setId(int id)
    {
    	this.id=id;
    }
    
 
	
	
	
         
}
