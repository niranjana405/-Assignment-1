package Assignment1;

public class Question4 {



	    public static void main(String[] args) {
	        int rows = 14;
	        int columns = 14;

	        for (int i = rows; i >= 1; i--) {
	            // Print left asterisks
	            for (int j = 1; j <= (15 - i); j++) {
	                System.out.print("*");
	            }

	            // Print spaces
	            for (int k = 1; k <= 2 * (i - 1); k++) {
	                System.out.print(" ");
	            }

	            // Print right asterisks
	            for (int l = 1; l <= (15 - i); l++) {
	                System.out.print("*");
	            }

	            System.out.println(); // Move to the next line
	        }
	    }
	}
