package core;

public class charAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		
		// charAt 
		
		String city = "pune";
		for(int i=0;i<city.length();i++) {
			System.out.println(i);
			System.out.println(city.charAt(i));
		}
		
		
		String city2 = "Mumbai";
		char q1 = city2.charAt(1);
		System.out.println(q1);
		
		//length()
		
		int le = city.length();
		System.out.println(le);
		
		for(int i=0;i<le;i++) {
			System.out.println(city2.charAt(i));
		}
		
		//reverse the string 
		
		String city3 = "pune";
		String rev = "";
		
		for(int i=0;i<city.length();i++) {
			rev = city3.charAt(i) + rev;
		}
		System.out.println(rev);
		
		
		
		String rev2 = "";
		for(int i=0;i<city3.length();i++) {
			System.out.println(city3.charAt(i));
			rev2 = rev2 + city3.charAt(i);
		}
		System.out.println(rev2);
		
		
		
		String fruits = "Apple mango banana grapes papaya";
		String userinput = "Apple";
		
		if(fruits.contains(userinput)) {
			System.out.println("Fruits Available");
		}else {
			System.out.println("Fruit not Available");
		}
		
		
		/// program 
		
		String name = "Ajit";
		String vowels ="aeiou";
		int count = 0;
		
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u') {
				count ++;
			}
		}
		System.out.println(count);
		
		// program 
		
		String a = "javascript";
		String b = a.substring(1,5);
		String c = a.substring(2);
		String d = a.substring(-8,8);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		revSt("pune");
	}
	
	public static String revSt(String city3) {
		String rev2 = "";
		for(int i=city3.length()-1;i>=0;i--) {
			rev2 = rev2 + city3.charAt(i);
		}
		System.out.println(rev2);
		return rev2;
	}

}
