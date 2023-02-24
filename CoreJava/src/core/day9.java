package core;

public class day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		FatherA govind = new FatherA();
		System.out.println(govind.firstName);
		govind.DisplayAge();
		
		
		SonA vaibhav = new SonA();
		System.out.println(vaibhav.firstName);
		vaibhav.displaySname();
		System.out.println(vaibhav.lastName);
		
		
		
		SonB Ajit = new SonB("Govind","Gode",55,"Ajit");
		System.out.println(Ajit.firstName);
		Ajit.displaySname();
		
	}

}

class FatherA{
	String firstName = "Govind";
	String lastName = "Gode";
	int age = 55;
	
	private void displayName(String fn,String ln) {
		this.firstName =fn;
		this.lastName = ln;
	}
	
	public void DisplayAge() {
		System.out.println(this.age);
		this.displayName("Govind", "Gode");
	}
}

class FatherB{
	String firstName ="Govind" ;
	String lastName ="Gode";
	int age ;
	
	public void displayName() {
		System.out.println(this.firstName+" "+this.lastName);
	}
}

class SonA extends FatherB{
	String sName= "Ajit";
	
	public void displaySname() {
		System.out.println(this.sName+" "+this.lastName);
	}
}

// using constructor 

class FatherC {
	String firstName;
	String lastName;
	int age;
	
	public FatherC(String fn,String ln,int ag) {
		this.firstName = fn;
		this.lastName = ln;
		this.age=ag;
	}
	
	public void displayName() {
		System.out.println(this.firstName+ " "+this.lastName);
	}
}


class SonB extends FatherC{
	String Sname;
	
	public SonB(String fn,String ln,int ag,String sn) {
		super(fn,ln,ag);
		this.Sname =sn;
	}
	
	public void displaySname() {
		System.out.println(this.Sname+" "+this.lastName);
	}
}