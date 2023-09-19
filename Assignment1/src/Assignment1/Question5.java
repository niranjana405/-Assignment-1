package Assignment1;

public class Question5 {

	

	    public static void main(String[] args) {
	        int rows = 14;
	        int columns = 14;

	        for (int i = 1; i <= rows; i++) {
	            // Print left spaces
	            for (int j = 1; j <= (i - 1); j++) {
	                System.out.print("  "); // Two spaces for each position
	            }

	            // Print left asterisks
	            for (int k = 1; k <= (15 - i); k++) {
	                System.out.print("*");
	            }

	            // Print right asterisks
	            for (int l = 1; l <= (15 - i); l++) {
	                System.out.print("*");
	            }

	            System.out.println(); // Move to the next line
	        }
	    }
	}
