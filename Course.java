package ie.nuigalway.hughcaulfield.Assignment1;

import java.util.ArrayList;

import org.joda.time.LocalDate;


public class Course {
	
	private LocalDate start;
	private LocalDate end;
	private String name;
	private ArrayList<Module> modules;

	
	
	public Course (String name, LocalDate start, LocalDate end, ArrayList<Module> modules)
	{
		this.name = name;
		this.modules = modules;
		this.start = start;
		this.end = end;
		
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setStart(LocalDate start) {
		this.start = start;
	}

	public LocalDate getStart() {
		return start;
	}

	public void setEnd(LocalDate end) {
		this.end = end;
	}

	public LocalDate getEnd() {
		return end;
	}
	
	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}

	public ArrayList<Module> getModuleList() {
		return modules;
	}
}

	
	