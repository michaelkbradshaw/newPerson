package Persons.person;

public class Person
{
	String fName;
	String lName;
	int age;
	/**
	 * @param fName
	 * @param lName
	 * @param age
	 */
	public Person(String fName, String lName, int age)
	{
		setfName(fName);
		setlName(lName);
		this.age = age;
	}
	
	
	/**
	 * @return the fName
	 */
	public String getfName()
	{
		return fName;
	}
	
	
	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName)
	{
		this.fName = capitalize(fName);
	}
	
	
	/**
	 * @return the lName
	 */
	public String getlName()
	{
		return lName;
	}
	
	
	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName)
	{
		this.lName = this.capitalize(lName);
	}
	/**
	 * @return the age
	 */
	public int getAge()
	{
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age)
	{
		this.age = age;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Persons ["+fName + "," + lName + ", " + age + "]";
	}
	
	
	private String capitalize(String s)
	{
		return s.substring(0, 1).toUpperCase() + 
				s.substring(1).toLowerCase();
		
	}

	
	
	
	
	
}
