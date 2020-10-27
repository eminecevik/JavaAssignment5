package Assignment_05;

import java.util.Scanner;

public class Question_06 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int num1=0;
		int num2=1;
		int sum=1;
		
		for (int i = 1; i <num; i++) {
			
			System.out.print(num2 + " ");
			
			sum=num1+num2;
			num1=num2;
			num2=sum;
		}	
			
			
		
	}

}
