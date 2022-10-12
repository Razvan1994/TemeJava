package tema5;

import java.util.Scanner;

public class SwitchHomework {

		
		public static void main(String[] args) {
			Scanner scan = new Scanner (System.in);
			System.out.println("Te rog sa introduci anul de vechime in firma :");
			int an = scan.nextInt();
			System.out.println("Te rog sa introduci valoarea vanzarilor efectuate :");
			int vanzari = scan.nextInt();
			System.out.println("Te rog sa introduci luna in care ai efectuat vanzarile :");
			int luna = scan.nextInt();
			
			int bonus = 0; 
			
			switch (an) {
			
			case 1: bonus = 100;
			System.out.println(bonus);
				break;
			case 2: bonus = 200;
				System.out.println(bonus);
				break;
			case 3: 
				if(vanzari <= 5000) {
					bonus = 600;
					System.out.println(bonus);
					break;
				}
				if ((vanzari <= 10000)&&(luna>=1 && luna<=6)) {
					bonus = 800;
					System.out.println(bonus);	
				break;
				} 
				if ((vanzari <= 10000)&&(luna>=7 && luna<=11)) {
					bonus = 1000;
					System.out.println(bonus);	
				break;
				}
				if ((vanzari <= 10000)&&(luna == 12)) {
					bonus = 900;
					System.out.println(bonus + " In decembrie se vand singure!");	
				break;
				}
				if (vanzari > 10000) {
					bonus = 1200;
					System.out.println(bonus);	
				break;
				}
		   }
		}
	

	}


