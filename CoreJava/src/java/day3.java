package java;

public class day3 {

	public static void main(String[] args) {
		
        //HardCoded values 
		Person Ajit = new Person();
		System.out.println(Ajit.firstName);
		System.out.println(Ajit.lastName);
		Ajit.displayName();
		
		
		// objectcrreation value
		
		PersonB amol = new PersonB("Amol","Vetal");
		amol.displayName();
		
		// using set method
		
		PersonC sanket = new PersonC();
		sanket.setName("Ajit");
		sanket.setLastName("Gode");
		sanket.displayName();
		
		
	}
	

}
class Person {
	String firstName = "Ajit";
	String lastName = "Gode";
	
	public void displayName() {
		System.out.println(this.firstName + " "+this.lastName);
	}
	
}

class PersonB{
	String firstName;
	String lastName;
	
	// constructor name is same as class name
	public PersonB(String fn,String ln) {
		this.firstName=fn;
		this.lastName = ln;
	}
	public void displayName() {
		System.out.println(this.firstName+" "+this.lastName);
	}
}

// using set method 

class PersonC{
	String firstName;
	String lastName;
	
	public void setName(String fn) {
		this.firstName = fn;
	}
	
	public void setLastName(String ln) {
		this.lastName = ln;
	}
	
	public void displayName() {
		System.out.println(this.firstName+" "+this.lastName);
	}
}
