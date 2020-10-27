package Assignment_05;

public class Question_09 {

	public static void main(String[] args) {
	
		
		
		int lastNumber=10;
		
		for (int number = 1; number <=lastNumber; number++) {
			
			if(number%2!=0) {
				
				System.out.print(number);
				
				if(lastNumber%2!=0 && number!=lastNumber) {
					System.out.print(",");
				
				}else if(lastNumber%2==0 && number !=lastNumber-1){
					System.out.print(",");
					
				}
			}
		}
			
			
		

	}

}
