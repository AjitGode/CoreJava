package core;

public class stringMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "I";
        String str2 = "learning";
        String str3 = "java";
        String q1 = String.join(" ",str,str2,str3);
        
        System.out.println(q1);
        
        
        // program 2 
        
        String city = "Pune";
        int q2 = city.indexOf("u");
        int q3 = city.indexOf("P");
        System.out.println(q2);
        System.out.println(q3);
        
        
        //program 3 
        
        String firstName = "Ajite Gode";
        int q4 = firstName.indexOf("e",5);
        System.out.println(q4);
        
        
        for(int i=0;i<firstName.length();i++) {
        	if(firstName.charAt(i) =='e') {
        		System.out.println(i);
        	}
        }
        
        // program 4 
        
        String city1 = " Pune ";
        System.out.println(city1.length());
        String q11 = city1.trim();
        System.out.println(q11.length());
        
        
        // program 5 
        
        String city2 = "Nashik";
        String q22 = city2.replace('a', 'A');
        System.out.println(q22);
        
        
        // program 6 
        String city3 = "";
        String city4 = "Mumbai";
        
        boolean em = city3.isEmpty();
        System.out.println(em);
        
        boolean em2 = city4.isEmpty();
        System.out.println(em2);
        
   
	}

}
