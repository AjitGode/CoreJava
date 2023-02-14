package core;

public class day2 {

	public static void main(String[] args) {
		//for loop 
		
		//print 1 to5
		
		for(int i=1;i<=5;i++) {
			//System.out.println(i);
		}
		
		System.out.println("// print 5 to 1");
		// print 5 to 1
		
		for(int i=5;i>=1;i--) {
			//System.out.println(i);
		}
		
		//table of 2 
		
		for(int i=2;i<=20;i=i+2) {
			//System.out.println(i);
		}
		
		// reverse of 2 table 
		
		for(int i=20;i>=2;i=i-2) {
			System.out.println(i);
		}
		
		// break with for loop 
		
		for(int i=1;i<=5;i++) {
			System.out.println(i);//1 2 3
			if(i==2) {
				break;
			}
		}
	}
	
}
