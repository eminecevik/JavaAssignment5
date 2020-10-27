package Assignment_05;

import java.util.Scanner;

public class Question_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number=scan.nextInt();
		
		do {
		System.out.println(number);	
		
		number=number*10;

			
		}while(number<100);
		
		

	}

}
