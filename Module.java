package ie.nuigalway.hughcaulfield.Assignment1;

import java.util.ArrayList;

public class Module {
	
	
	private String Name;
	private String ID;
	private ArrayList<Student> noStudents;	
	
	public Module(String Name, String ID, ArrayList<Student> noStudents){
		this.Name = Name;
		this.ID = ID;
		this.noStudents = noStudents;
	}
	
	public void setName (String Name){
		this.Name = Name;
	}

	public String getName() {
		return Name;
	}
	
	public void setID (String ID){
		this.ID = ID;
	}
	
	public String getID(){
		return ID;
	}
	
	public void setnoStudents(ArrayList<Student> noStudents){
		this.noStudents = noStudents;
	}
	
	public ArrayList<Student> getnoStudents(){
		return noStudents;
	}
	}
	
	
