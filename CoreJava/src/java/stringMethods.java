package java;

public class stringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName = "Ajit";
		System.out.println(firstName);
		
		
		//Methods 
		
		String firstName1 = "Sanket";
		int q1 = firstName1.length();
		System.out.println(q1);
		
		// program 1  -- concat()
		
		String name = "Ajit";
		String name2 = "Amol";
		
		String q2 = name.concat(name2);
		System.out.println(q2);
		System.out.println(name+name2);
		
		
		// program 2 -- obj 
		
		String city = new String("Pune");
		System.out.println(city);

		
		//program 3 -- toUpperCase()
		
		String city1  = "Sangamner";
		String q3 = city1.toUpperCase();
		System.out.println(q3);
		
		
		// program 4 --- toLowerCase()
		
		String city3 = "Nashik";
		String q4 = city3.toLowerCase();
		System.out.println(q4);
		
		
		// Method chaining 
		
		String city4 = "Pune";
		String city5 = "Nashik";
		String city6 = "pune";
		
		System.out.println(city4.equals(city6));
		System.out.println(city4.equals(city5));
		
		
		// ternary operator 
		
		String A = city4.equals(city6) ? "equal":"not equal";
		System.out.println(A);
		
		
		// program 5 -- startWith()
		
		String Address = "Sangamner";
		boolean q11 = Address.startsWith("S");
		boolean q12 = Address.startsWith("San");
		System.out.println(q11);
		System.out.println(q12);
		
		// programs 6 -- endsWith()
		
		String City7 = "Dhule";
		boolean q22 = City7.endsWith("e");
		boolean q23 = City7.endsWith("le");
		System.out.println(q22);
		System.out.println(q23);
		
		// program 7 -- contains()
		
		String j = "I am learning core java";
		boolean q44 = j.contains("am");
		System.out.println(q44);
	}

}
