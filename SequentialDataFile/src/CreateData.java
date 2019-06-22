/* Following Application prompts user at a CLI for data that it will pass to a file sequentially
 * followed by a seperate application that will read.
 * you may add many more prompts for the user. This is a basic Java template
 * M.Brohi
 */
import java.io.FileNotFoundException;
import java.lang.*;
import java.util.*;



public class CreateData {

	public static void main(String[] args) {
	
		try(Formatter output = new Formatter("data.txt")) {
			Scanner input = new Scanner(System.in);
			System.out.printf("%s%n%s%n? "," Enter a reference number:, A Name or Attribute, Department,"
					+ "Enter end of file inditcator (Win <CTRL + z> Mac <Enter + Ctrl + Z)");
			while (input.hasNext()) {
				try {
					output.format("%d %s %s %.2f%n", input.nextInt(), input.hasNext(), input.hasNext(), input.nextDouble() );
					}
			catch (NoSuchElementException elementException) {
				System.err.println("Invalid input. Please try again.");
				input.nextLine();
			}
			System.out.print(" : ?");
			}
			
		}
			catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
				e.printStackTrace();
			}
	
	}
	

}
