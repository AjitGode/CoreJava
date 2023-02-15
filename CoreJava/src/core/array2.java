package core;

import java.util.Arrays;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		String names [] = new String[6];
		
		// array store the value by index number
		
		names[0] = "Ajit";
		names[1]="Sanket";
		names[2]="Amol";
		names[3]="Suyog";
		names[4]="Akash";
		names[5]="jahid";
		
		
		for(int i=0;i<names.length;i++) {
//			System.out.println(names[i]);
		}
		
		
		// program 2 
		
		String [] cities = {"pune","nashik","mumbai","bangalore","chennai"};
		
		for(int i = cities.length-1;i>=0;i--) {
			System.out.println(cities[i]);
		}
		
		
		//program 3  
		
		String info = "I am learning java";
		String [] sy = info.split(" ");
		String [] sy2 = info.split("a");
		
		System.out.println(Arrays.toString(sy));
		System.out.println(Arrays.toString(sy2));
		System.out.println("............................................");
		
		
		// program 4 
		
		String [] namesi = {"Ajit","Akash","Amol","Sanket","Suyog"};
		
		for(int i=0;i<namesi.length;i++) {
			//System.out.println(namesi[i]);
		}
		
		for(String n:namesi) {
			System.out.println(n);
		}
		
		// program 5 
		
		char [] nn = {'a','j','i','t'};
		
		String rev = "";
		for(char s:nn) {
			rev = s + rev;
		}
		System.out.println(rev);
		
		
		// program 6 
		
		int [] numbers = {111,23,45,43,67,89};
		
		float avg = 0;
		int sum = 0;
		
		for(int j:numbers) {
			sum = sum + j;
		}
		
		 avg = sum/numbers.length;
		 System.out.println(avg);
	}

}
