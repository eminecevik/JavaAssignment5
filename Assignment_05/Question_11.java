package Assignment_05;

public class Question_11 {

	public static void main(String[] args) {

		for (int start = 4; start >= 1; start--) {

			for (int space = 0; space <4-start; space++) {
				System.out.print(" ");
				
			}
			for (int i = start; i >= 1; i--) {
				System.out.print(i + " ");

			}
			System.out.println();

		}

	}

}
