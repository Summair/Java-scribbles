/*
 * Class file that will read your data and display
 * enjoy!
 */


import java.io.*;
import java.nio.*;
import java.nio.file.Paths;
import java.lang.*;
import java.util.*;


public class Data_Reader_Display {

	public static void main(String[] args) {
		
		try(Scanner input = new Scanner(Paths.get("Data.txt"))){
			System.out.printf("%-10s%-12s%-12s%%10%n", "Attribute Number:", "First Name", "Last Name", "Account");
			while (input.hasNext()) {
				System.out.printf("%-10d%-12s%-12s%10.2f%n", input.nextInt(), input.hasNext(), input.hasNext(), input.nextDouble());
			}
		}
		catch (IOException | NoSuchElementException | IllegalStateException e) {
			e.printStackTrace();
		}
	}

}
