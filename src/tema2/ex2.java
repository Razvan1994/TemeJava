package tema2;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
	 int varsta;
	 
	 System.out.println("Care este varsta ta?");
	 Scanner scan = new Scanner(System.in);
	 varsta = scan.nextInt();
	 scan.close();
	 
	 if(varsta < 18) {
		 System.out.println("Esti minor");
	 }
	 
	 else if(varsta >= 18 && varsta <= 65) {
		 System.out.println("Esti adult");
	 }
	 
	 else {
		 System.out.println("Esti batran");
	 }
	 
	 
	}
}
