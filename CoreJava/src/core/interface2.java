package core;

public class interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SBIE sbi = new SBIE();
		sbi.repo();
		sbi.save();
		sbi.loan();
	}

}

interface worldBankE{
	
	public void loan();
	public void save();
	
}

interface RBI{
	public void repo();
}

class SBIE implements worldBankE,RBI{

	@Override
	public void repo() {
		System.out.println("Repo from SBI");
		
	}

	@Override
	public void loan() {
		System.out.println("loan from sbi");
		
	}

	@Override
	public void save() {
		System.out.println("save from sbi");
		
	}
	
}
