package tema4;

public class FibonacciStructuraFor {

	public static void main(String[] args) {
		
		 int maxNumber = 9; 
		 int previousNumber = 0;
		 int nextNumber = 1;
		 
	        System.out.print("Seria Fibonacci pentru "+maxNumber+" numere:");
	        

	        for (int i = 1; i <= maxNumber; ++i)
	        {
	            System.out.print(previousNumber+" ");
	           
	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	        }

	}

}
