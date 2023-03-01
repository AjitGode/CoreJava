package core;

public class day10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		calculator cal = new calculator();
		cal.addition(12,2);
		int a = cal.addition(12,2,4);
		System.out.println(a);
		cal.addition(12,2,4,5);
		
		
		PersonY constr = new PersonY();
		PersonY constrr = new PersonY(12,3);
		PersonY constrrr = new PersonY(12,3,3);
		
		
		//overriding 
		
		SBI sbi = new SBI("India","Pune",422605);
		System.out.println(sbi.city);
		System.out.println(sbi.country);
		System.out.println(sbi.pincodde);
		
		sbi.Save(12);
		sbi.Loan(13);
		
	}

}

// overloading 

// same class , same method name, different signature


class calculator{
	public void addition(int x, int y) {
		System.out.println(x+y);
	}
	public int addition(int x,int y,int z) {
		return x+y+z;
	}
	
	public void addition(int x,int y,int z,int a) {
		System.out.println(x+y+z+a);
	}
}


class PersonY{
	
	// default constructor 
	
	public PersonY() {
		System.out.println("Default constructor called!!");
	}
	
	public PersonY(int x, int y) {
		System.out.println("Default constructor called  2!!");
		System.out.println(x+y);
	}
	
	public PersonY(int x, int y,int z) {
		System.out.println("Default constructor called  3!!");
		System.out.println(x+y+z);
	}
}


// overriding 

// different class , same method , same signature ---- inheritance


class worldBank{
	
	String country;
	String city;
	
	
	public worldBank(String cn, String ct) {
		this.country = cn;
		this.city=ct;
	}
	
	public void Loan(int x) {
		System.out.println("WB loan"+x);
	}
	public void Save(int y) {
		System.out.println("WB save"+ y);
	}
}

class SBI extends worldBank{
	int pincodde;
	
	public SBI(String cn, String ct,int pin) {
		super(cn,ct);
		this.pincodde = pin;
	}
}