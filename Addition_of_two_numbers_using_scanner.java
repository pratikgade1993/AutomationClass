package addition_of_two_variables;

import java.util.Scanner;

public class Addition_of_two_numbers_using_scanner {
	
	
	
	public static void main(String[] args) {
		
		
		int sum;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Please Enter First Number : ");
		int n1 = sc.nextInt();
		
		System.out.println("Please Enter Second Number : ");
		int n2=sc.nextInt();
			
		sum = n1+n2;
		System.out.println("Sum of the entered two numbers is : " + sum);
		
		
		sc.close();
		
		
	}

}
