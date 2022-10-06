package tema4;

import java.util.Scanner;

public class LoginPagina {
	public static void main(String[] args) {
		
         String testUsername = "TestUser";
         int testPassword = 1234;

        
        String username;
        int password;

		int counter = 0;

		do { 
			Scanner scan = new Scanner(System.in);
            System.out.println("Enter a user: ");
            username = scan.next();
            System.out.println("Enter a password: ");
            password = scan.nextInt();

            
            if(!username.equals(testUsername) || password != testPassword)
            {
                counter ++;
                
                if(counter == 3){
                    System.out.println("Maximum attempts reached. User blocked.");
                    break; 
                }

                System.out.println("Login Error");
            }
            else if(username.equals(testUsername) && password == testPassword)
            {
                System.out.println("Login successful");
                break;
            }

		}while(true);
	}
}