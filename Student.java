package ie.nuigalway.hughcaulfield.Assignment1;

import org.joda.time.DateTime;

public class Student {
	
	 	private String name;     // student name
	 	private String DOB;     // Date of birth
	 	private int age;      // student age
	 	private double ID;		//Student ID
	    private String username; //student username
	    
	    public Student(String name, int age, String DOB, double ID, String username) {
	        this.name   = name;
	        this.age    = age;
	        this.ID		= ID;
	        this.DOB = DOB;
	        this.username = username;
	    }

		public Student(String string, int i, DateTime dateTime) {
		}

		public String getUsername (){
	    	this.username = name + age;
	    	return username;
	    }
	    
	    public void setname (String name){
	    	this.name = name;
	    }
	    
	    public String getname(){
	    	return name;
	    }
	    
	    public void setage (int age){
	    	this.age = age;
	    }
	    
	    public 	int getage(){
	    	return age;
	    }
	    
	    public void setID (double ID){
	    	this.ID = ID;
	    }
	    
	    public double getID(){
	    	return ID;
	    }
	    
	    public void setDOB (String DOB){
	    	this.DOB = DOB;
	    }
	    
	    public String DOB(){
	    	return DOB;
	    }
	    
	    public String getusername(){
	    	this.username = (String)(name + age);
	    	return username;
	    }	    
}
