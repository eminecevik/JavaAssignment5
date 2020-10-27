package Assignment_05;

public class Question_13 {

	public static void main(String[] args) {

		for (int row = 1; row <= 8; row++) {

			if (row % 2 == 1) {
				for (int col = 1; col <= 8; col++) {

					if (col % 2 == 1) {
						System.out.print("W");
					} else {
						System.out.print("B");
					}
					System.out.print(" ");
				}
			} else {
				for (int col = 1; col <= 8; col++) {

					if (col % 2 == 1) {
						System.out.print("B");
					} else {
						System.out.print("W");
					}

					System.out.print(" ");

				}
			}
			System.out.println();
		}
	}

}
