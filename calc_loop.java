/* Java CIS 141 
Mohammed Brohi
LOOP LAB */


import java.util.*;

public class Calc {

public static void main(String[] args) {
	double number1;
	 double number2;
	 char selection;
	 char choice;
	
	System.out.printf(" A.Addition%n B.Subtraction%n C.Multiplication%n D.Divison%n E.Exit%n");
 
	 number1 = 0;
	 number2= 0;
	Scanner console = new Scanner(System.in);
	System.out.println("Please Enter selection: ");
	selection = console.next().charAt(0);
	choice = Character.toUpperCase(selection);
	
	while ( choice != 'E')
	{
		if(choice == 'A') 
		{ 
			System.out.println("Please Enter 1st number: ");
		    number1=console.nextDouble();
		    System.out.println("Please Enter 2nd number: ");
		    number2=console.nextDouble();
		    
		    System.out.printf("%.2f   +   %.2f = %.2f", number1, number2, (number1 + number2));
	
		}else if(choice == 'B') {
				System.out.println("Please Enter 1st number: ");
			    number1=console.nextDouble();
			    System.out.println("Please Enter 2nd number: ");
			    number2=console.nextDouble();
			   
			    System.out.printf("%.2f   +   %.2f = %.2f", number1, number2,(number1 - number2 ));
				}
		else if(choice == 'C') {
			System.out.println("Please Enter 1st number: ");
		    number1=console.nextDouble();
		    System.out.println("Please Enter 2nd number: ");
		    number2=console.nextDouble();
		   
		   System.out.printf("%.2f   *   %.2f = %.2f", number1, number2, (number1 * number2));
	
	}else if(choice == 'D') {
		System.out.println("Please Enter 1st number: ");
	    number1=console.nextDouble();
	    System.out.println("Please Enter 2nd number: ");
	    number2=console.nextDouble();
	   
	   System.out.printf("%.2f   *   %.2f = %.2f", number1, number2, (number1 / number2));
	}
	else
		System.out.println("Wrong Selection Please Try again: ");
	
		System.out.println("\n\nPlease Enter selection: ");
		selection = console.next().charAt(0);
		choice = Character.toUpperCase(selection);
	
		
	}//end of while
	System.out.println("Good-Bye! ");
}//end of main
}//end of class
	

	






