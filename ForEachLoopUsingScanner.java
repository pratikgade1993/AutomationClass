package iterativeStatements;

import java.util.Scanner;

public class ForEachLoopUsingScanner {
	
	
	public  static void main(String [] args) 
	
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter Number of the elements you want in array  : ");
		int totalElement = sc.nextInt();
		
		for(int i=0;i<totalElement;i++)
		{
			System.out.println("Please enter " + i + "st/th Element  :" );
			int a = sc.nextInt();	
			
		}
		
		sc.close();
		
	}

}
