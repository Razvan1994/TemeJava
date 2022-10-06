package tema3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		int punctaj;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Va rugam sa scrieti punctajul:");
		punctaj = scan.nextInt();
		
		/*String calificativ = "";
		if (punctaj>=90) {
			 calificativ = "FB";
		}
		else if(punctaj>=80) {
			 calificativ = "B";
		}
		else {
			 calificativ = "S";
		}
		
		if(calificativ.equals("FB")) {
			System.out.println("Ai primit : FoarteBine");
		}
		else if(calificativ.equals("B")) {
			System.out.println("Ai primti : Bine");
		}
		else {
			System.out.println("Ai primit : Insuficient");
		}*/
		
		
		 String califactiv = punctaj>=90 ? "FB" : punctaj>=80 ? "B" : "S";
		 System.out.println(califactiv.equals("FB")?"Ai primit : FoarteBine":califactiv.equals("B")?"Ai primit : Bine": "Ai primit S");   
		
			
	}

}
