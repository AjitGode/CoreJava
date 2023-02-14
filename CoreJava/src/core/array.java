package core;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int num[] = new int[5];
		int []  num2= new int[5];
		
		num[0]= 23;
		num[1]=24;
		num[2]=44;
		num[3]=55;
		num[4]=66;
		
		System.out.println(num);
	
	   String a1 = 	Arrays.toString(num);
	   System.out.println(a1);
	   
	   
	   for(int i =0; i<num.length;i++) {
		   System.out.println(i);
		   System.out.println(num[i]);
	   }
	   
	   
	   int [] num3 = {11,22,33,44,55};
	   
	   for(int i =0; i<num3.length;i++) {
		   System.out.println(i);
		   System.out.println(num3[i]);
	   }
	}

}
