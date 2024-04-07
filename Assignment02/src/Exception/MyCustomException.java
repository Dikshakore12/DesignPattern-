package Exception;

public class MyCustomException extends Exception {
	    public MyCustomException(String message) {
	        super(message);
	    }
	}

	 class CustomExceptionDemo {
	    public static void testCustomException(int value) throws MyCustomException {
	        if (value < 0) {
	            // Throw custom exception if value is negative
	            throw new MyCustomException("Negative value not allowed");
	        } else {
	            System.out.println("Value is: " + value);
	        }
	    }
	    
	    public static void main(String[] args) {
	        try {
	            testCustomException(-5); 
	        } catch (MyCustomException e) {
	            System.out.println("Caught custom exception: " + e.getMessage());
	        }
	    }
	}



