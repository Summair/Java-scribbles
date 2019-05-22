
package javaScribbles;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;




public class ioReader {

		
	public static void main(String[] args) {
	
		int grade;
		 String name;
		int counter = 0;
		double average=0;
		
		
		try {
			
			File datafile = new File("data.txt");
			
		Scanner input = new Scanner("data.txt"); // Scanner object to read file
		
	
		
		System.out.printf("Name \t Grade \n");
		
		
		while(input.hasNext()) {
			
		name	= input.next();
		grade = input.nextInt();
		counter++; 	
		average = grade / counter; 
		
			System.out.printf(" Average Grade : %2f", average );
			
		
		
		}
	}
			
catch (FileNotFoundException ex) {
	
	System.out.println("data.txt : oops, FileNotFoundException caught");
	
	ex.printStackTrace();
	
} 
	
		
		
	}
}		
		
	

//end of class
