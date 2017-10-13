package ie.nuigalway.hughcaulfield.Assignment1;

import junit.framework.*;
import org.joda.time.*;

public class studentRegTest extends TestCase {
	
	Student a;
	
	public void Student(){
		a = new Student("Hugh", 22, new DateTime("1995-10-06"));
	}
	
	public void Username(){
		
		String username = a.getusername();
		assertEquals(a.getusername(), "Hugh22"); //username is tested correctly
	}
}
	
	
