package core;
import java.util.Arrays;
public class day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		
		//progrma --1 
		int [] numbers = new int[5];
		
		numbers[0] = 1;
		numbers[1]=2;
		numbers[2]=3;
		numbers[3]=4;
		numbers[4]=5;
		
		for(int i=0;i<numbers.length;i++) {
			//System.out.println(numbers[i]);
		}
		
		
		for(int s:numbers) {
			//System.out.println(s);
		}
		
		// program 2
		
		int [][] numberB = new int[3][4];
		
		numberB[0][0] = 11;
		numberB[0][1] = 22;
		numberB[0][2]=33;
		numberB[0][3]=44;
		
		
		numberB[1][0] =11;
		numberB[1][1]=22;
		numberB[1][2]=33;
		numberB[1][3]=44;
		
		
		numberB[2][0]=55;
		numberB[2][1]=66;
		numberB[2][2]=33;
		numberB[2][3]=77;
		
		
		int [] [] numberD = {
				{11,22,33,44},
				{34,56,78,45,},
				{23,21,43,54}
		};
		
//		for(int i =0; i<numberD.length;i++) {
//			//System.out.println(Arrays.toString(numberD[i]));
//			int [] row = numberD[i];
//			
//			for(int j=0;i<row.length;j++) {
//				//System.out.println(row[j]);
//			}
//		}
//		
//		for(int i=0;i<numberB.length;i++) {
//			int r []= numberB[i];
//			
//			for(int j=0;j<r.length;j++) {
//			System.out.println(r[j]);
//			}
//		}
		
		
		//for Each 
		
		for(int [] row:numberD) {
			for(int col:row) {
				System.out.println(col);
			}
		}
		
		for(int [] row:numberB) {
			for(int col2:row) {
				System.out.println(col2);
			}
		}
	}

}
