package iterativeStatements;

import java.util.Scanner;

public class WhileLoop {
	
	
	public static void main(String [] args)
	
	{
		int num = 1;
		
		Scanner sc = new Scanner(System.in);
		
	 System.out.println("Run the loop following times : ");
	 int a = sc.nextInt();
	 
	 System.out.println("That is " + a + " times");
	 
	 while(num<= a) 
	 {
		 System.out.println(num);
		 
		 if (num ==a) 
		 {
			 System.out.println("We follow your command and run this loop using while loop at " + a + " times");
			 break;
			 
		 }
		 num++;
	 }
		
		sc.close();
	}

}
