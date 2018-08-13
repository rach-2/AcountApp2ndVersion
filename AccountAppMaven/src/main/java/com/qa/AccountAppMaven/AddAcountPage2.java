package com.qa.AccountAppMaven;

public class AddAcountPage2 
{
	
	 private String firstName ;
	 private String  lastName;
	 private String accountNamber;
	 


	public AddAcountPage2(String firstName, String lastName, String accountNamber) {;
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
	 
	
	
         
}
