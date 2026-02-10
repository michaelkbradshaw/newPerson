package Persons.person;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest 
{
	
	Person r;
	Person j;
	Person d;
	Person y;
	
	@BeforeEach
	public void setup()
	{
		r = new Person("Romeo","Monty",15);
		j = new Person("juliet","Capulet",13);
		d = new Person("Duko","Count",55);
		y = new Person("Yoda","Gree",894);
		
	}
	
	@Test
	public void testPerson()
	{
		
		assertEquals(r.getfName(),"Romeo");
		assertEquals(r.getlName(),"Monty");
		assertEquals(r.getAge(),15);
		
		
		
		
		
	}
	
}
