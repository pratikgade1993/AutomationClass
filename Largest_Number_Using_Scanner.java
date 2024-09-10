package addition_of_two_variables;

import java.util.Scanner;

public class Largest_Number_Using_Scanner {

	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Please Enter First Number : ");
		int a=   sc.nextInt();
		
		System.out.println("Please Enter Second Number : ");
		int b=   sc.nextInt();
		
		System.out.println("Please Enter Third Number : ");
		int c=   sc.nextInt();
		
		if (a>=b) 
		{
			if (a>=c) 
			{
				
			System.out.println(a + " is the Highest Number");
				
			}
			else 
			{

			System.out.println(c + " is the Highest Number");

			}
			
			
		}
		else
		{
			if (b>=c) 
			{
				
			System.out.println(b + " is the Highest Number");
			
			}
			else 
			{
				
			System.out.println(c + " is the Highest Number");
				
			}
			
			
			
		}	
		
		
		sc.close();
		
	}
	
	
}
