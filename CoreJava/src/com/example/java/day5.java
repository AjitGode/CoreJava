package com.example.java;

public class day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Father  Govind = new Father("Shankar","Gode","Govind");
       Govind.displayFname();
       Govind.DisplayName();
	}

}

class GrandFather {
	String firstName;
	String lastName;
	
	GrandFather(String fn,String ln){
		this.firstName=fn;
		this.lastName =ln;
	}
	public void DisplayName() {
		System.out.println(this.firstName+" "+this.lastName);
	}
}

class Father extends GrandFather{
	String FName;
	
	Father(String fn,String ln,String ffn){
		super(fn,ln);
		this.FName=ffn;
	}
	public void displayFname() {
		System.out.println(this.FName+" "+this.lastName);
	}
}