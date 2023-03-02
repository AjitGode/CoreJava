package core;

public class interfaceClass {

	public static void main(String[] args) {
		
		
		SBID sbi = new SBID();
		sbi.discount();
		sbi.Save();
		sbi.Loan();
	}

}

//Interface -- same as abstract class we cannot create object of interface class

interface WorldBankD{
	
	abstract public void Save();
	abstract public void Loan();
	abstract public void discount();
}

class SBID implements WorldBankD{

	@Override
	public void Save() {
		System.out.println("Save from sbi");
		
	}

	@Override
	public void Loan() {
		System.out.println("Loan from sbi");
		
	}

	@Override
	public void discount() {
		System.out.println("Dsicount from discount");
		
	}
	
}