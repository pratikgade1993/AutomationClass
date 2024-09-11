package iterativeStatements;

import java.util.Scanner;

public class ForLoop {

 public static void main(String[] args) {
	
	 
	 //How to print serial numbers using for loop
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Please Enter the Number upto which you want to print the numbers: ");
	 int lastNum  = sc.nextInt();
	 
	 for (int i=1;i<=lastNum;i++) 
	 {
		 
		 System.out.println(i);
		  
	 }
	 
	 System.out.println("Great!!!");
	 
	 sc.close();
}


}
