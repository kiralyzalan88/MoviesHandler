package movies;

public class Person {

	private String firstName;
	private String lastName;
	private Gender gender;
	private boolean hasOscar;
	private boolean hasGoldeGlobe;
	
	public Person(String firstName, String lastName, Gender gender, boolean hasOscar, boolean hasGoldenGlobe)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.hasOscar = hasOscar;
		this.hasGoldeGlobe = hasGoldenGlobe;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public boolean isHasOscar() {
		return hasOscar;
	}

	public void setHasOscar(boolean hasOscar) {
		this.hasOscar = hasOscar;
	}

	public boolean isHasGoldeGlobe() {
		return hasGoldeGlobe;
	}

	public void setHasGoldeGlobe(boolean hasGoldeGlobe) {
		this.hasGoldeGlobe = hasGoldeGlobe;
	}
	
	public String toXMLString()
	{
		return "";
	}
}


