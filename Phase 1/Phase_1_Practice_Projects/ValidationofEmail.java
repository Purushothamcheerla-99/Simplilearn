package projects;
import java.util.Scanner;
public class ValidationofEmail {
	

	
		
		public static void main(String[] args) {
			String n;
			String array[]= {"porus@gmail.com","purush@gmail.com","ABC@gmail.com"};
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your correct Email ID:");
			n=sc.next();
			if(array[0].equals(n)){
				System.out.println("User Authenticated");	
			}
			else if(array[1].equals(n))
			{
				System.out.println("User Authenticated");
			}
			else if(array[2].equals(n))
			{
				System.out.println("User Authenticated");
			}
			else
			{
				System.out.println("User is not Authenticated");
			}sc.close();
		
		}		
}
	

