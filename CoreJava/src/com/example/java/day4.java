package com.example.java;

public class day4 {

	public static void main(String[] args) {
		
       PersonF Ajit = new PersonF("Ajit","Gode");
       Ajit.DisplayName();
	}

}

class PersonF {
	String firstName;
	String lastName;
	
	public PersonF(String fn, String ln) {
		this.firstName = fn;
		this.lastName =ln;
	}
	
	public void DisplayName() {
		System.out.println(this.firstName+" "+this.lastName);
	}
}