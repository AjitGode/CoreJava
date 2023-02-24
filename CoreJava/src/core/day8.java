package core;

public class day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonM ajit = new PersonM();
		 String q1 = ajit.fullName;
		 System.out.println(q1);
		 
		 //object create using constructor 
		 
		 PersonL Ajit = new PersonL("Ajit Gode",24,83);
		 Ajit.displayName();
		 
		 PersonL[] students = {
				 new PersonL("Sanket Modhe",24,55),
				 new PersonL("Amol Vetal",23,45),
				 
				 
		 };
		 students[1].displayName();
		 
		 for(PersonL a:students) {
			 System.out.println(a.adharCard);
			 System.out.println(a.fullname);
		 }
		 
		 //getter setter
		 
		 PersonE Amol = new PersonE();
		 System.out.println(Amol.fullname);// null- beacause whenever we set the name using set method
		 
		 
		 Amol.setFullName("Amol vetal");
		 Amol.setAge(23);
		 Amol.setAdhar(89);
		 System.out.println(Amol.fullname);
		 System.out.println(Amol.age);
		 System.out.println(Amol.adharCard);
	}

}
 class PersonM {
	 String fullName = "Ajit Gode";
	 int age =24;
	 int adhar = 83;
	 
	 public void displayName() {
		 System.out.println(this.fullName);
	 }
 }
 
 class PersonL {
	 String fullname;
	 int age;
	 int adharCard;
	 
	 public PersonL(String fn,int ag,int adhr) {
		 this.fullname = fn;
		 this.age=ag;
		 this.adharCard =adhr;
	 }
	
	public void displayName() {
		 System.out.println(this.fullname);
	 }
 }
 
 
 // setter and getter method
 
 class PersonE{
	 String fullname;
	 int age;
	 int adharCard;
	 
	 public void setFullName(String fn) {
		 this.fullname=fn;
	 }
	 
	 public void setAge(int ag) {
		 this.age = ag;
	 }
	 
	 public void setAdhar(int ad) {
		 this.adharCard = ad;
	 }
 }