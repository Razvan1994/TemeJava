package tema6;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		int number, sum = 0;
        Scanner scan = new Scanner(System.in);
        number = 10;
        int userInputNumber[] = new int[number];
        System.out.println("Introdu 10 numere:");
        for(int i = 0; i < number; i++)
        {
        	userInputNumber[i] = scan.nextInt();
            sum = sum + userInputNumber[i];
        }
        System.out.println("Suma numerelor din array este :"+sum);

	}

}
