package iterativeStatements;

import java.util.Scanner;

public class DoWhileLoop {
	
	
	public static void main (String [] args)
	{
		
		//Run Loop as per user will
		
		int num = 1;
		
		Scanner sc = new Scanner(System.in);
		
	 System.out.println("Run the loop following times : ");
	 int a = sc.nextInt();
	 
	 System.out.println("That is " + a + " times.....");
	 
	 do 
	 {
		 
		 System.out.println(num);
		 num++;
		 
	 }while(num<=a);
	 
	 sc.close();	
	}

}
