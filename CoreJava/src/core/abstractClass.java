package core;

public class abstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBIA sbi = new SBIA("Pune","India",41157);
		
		System.out.println(sbi.city);
		System.out.println(sbi.country);
		System.out.println(sbi.pincode);
		
		sbi.Save();
		sbi.Loan();
		
		PNBA pnb = new PNBA("Pune","India");
		pnb.Save();
		pnb.Loan();

	}

}

// Abstraction -- To hide essential data and show functionality
//we cannot create object of abstract class
// In abstract class we just define abstract method we cant provide body to abstract method


abstract class worldBankA{
	
	String city;
	String country;
	
	public worldBankA(String ct,String cn) {
		this.city = ct;
		this.country  = cn;
	}
	
	// abstract method 
	
	abstract public void Save();
	abstract public void Loan();
}

class SBIA extends worldBankA{

	int pincode;
	public SBIA(String ct, String cn,int pin) {
		super(ct, cn);
		this.pincode = pin;
	}

	@Override
	public void Save() {
		System.out.println("Save method from SBI");
		
	}

	@Override
	public void Loan() {
		System.out.println("Loan method from SBI");
		
	}
	
}

class PNBA extends worldBankA{

	public PNBA(String ct, String cn) {
		super(ct, cn);
		
	}

	@Override
	public void Save() {
	System.out.println("Save from PNB");
		
	}

	@Override
	public void Loan() {
		System.out.println("Loan from PNB");
		
	}
	
}