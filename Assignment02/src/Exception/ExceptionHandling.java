package Exception;

public class ExceptionHandling {
	    public static void main(String[] args) {
	        try {
	            // ArithmeticException
	            int result = divideByZero();
	            System.out.println("Result of division: " + result);
	            
	        } catch (ArithmeticException e) {
	            System.out.println("ArithmeticException caught: Division by zero is not allowed.");
	        }
	        
	        try {
	            // ArrayIndexOutOfBoundsException
	            accessArrayOutOfBounds();
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexOutOfBoundsException caught: Array index is out of bounds.");
	        }
	        
	        try {
	            // StringIndexOutOfBoundsException
	            accessStringOutOfBounds();
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("StringIndexOutOfBoundsException caught: String index is out of bounds.");
	        }
	    }
	    
	    // Method to demonstrate Exceptions
	    
	    public static int divideByZero() {
	        return 5 / 0; // Division by zero
	    }
	    
	    public static void accessArrayOutOfBounds() {
	        int[] arr = {1, 2, 3};
	        System.out.println("Value at index 3: " + arr[3]); // Accessing index out of bounds
	    }
	    
	    public static void accessStringOutOfBounds() {
	        String str = "Hello";
	        System.out.println("Character at index 10: " + str.charAt(10)); // Accessing index out of bounds
	    }
	}



