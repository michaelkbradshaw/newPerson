package Persons.person;

import junit.framework.TestCase;

public class TestPerson extends TestCase
{

	Person A;
	Person B;
	
	protected void setUp() throws Exception
	{
		A = new Person("billy","Smith",9);
		B = new Person("sally","Fildes",69);
		
	}

	public void testPerson()
	{
		assertEquals("Billy",A.getfName());
		assertEquals("Smith",A.getlName());
		assertEquals(9,A.getAge());
	
	
	}
	
	public void testSetNames()
	{
		Person p = new Person("Alice","Frog",5);
		assertEquals(p.getfName(),"Alice");
		assertEquals("Frog",p.getlName());
		
		p.setfName("radish");
		assertEquals(p.getfName(),"Radish");
		
		p.setlName("spoon");
		assertEquals("Spoon",p.getlName());
		
		
		
	}
	
	
	
	

}
