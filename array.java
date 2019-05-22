/* Java 141 CIS
 * Mohammed Brohi
 * 
 * Array Lab
 */
import java.util.*;

public class Array {
	
	static int i;
	static int Number;
	
	
	public static void main(String[] args) {
 
		int[] Number = new int[50];
		
		for (int i = 0; i < Number.length/2; i++ ) {
		 if(i < 25) {
			
			Number[i] = i * i;
			System.out.printf(" %d", Number[i]);
			
			if (i %10 == 0)
				System.out.print("\n");
		 }
	
		}
		for (int i = 25; i < Number.length; i ++ ) {
			if (i >23)
				Number[i] = i * 3;
			System.out.printf(" %d",  Number[i] + 3);
			
			if (i %10 == 0)
				System.out.print( "\n");
				
			
		}
	}


}// end of class body

