package tema4;

public class FibonacciStructuraWhile {

	public static void main(String[] args) {
		
		int maxNumber = 9;
	    int previousNumber = 0;
	    int nextNumber = 1;
	    
        System.out.print("Seria Fibonacci pentru "+maxNumber+" numere:");

        int i=1;
        while(i <= maxNumber)
        {
            System.out.print(previousNumber+" ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            i++;
        }

	}

}
