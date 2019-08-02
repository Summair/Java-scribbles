/* Java Array application for different Array methods
 M.Brohi
 */

import java.util.Arrays;


public class ArrayManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
 
      Arrays.sort(doubleArray);
      System.out.printf("%n doubleArray: ");
      
      for (double value : doubleArray) {
    	  System.out.printf("%.1f ", value);
      }
 

      int[] filledIntArray = new int[10];
	Arrays.fill(filledIntArray, 7);
	displayArray(filledIntArray, "filledIntArray");
	
	int[] intArray = {1, 2, 3, 4, 5, 6};
	int[] intArrayCopy = new int[intArray.length];
	System.arraycopy(intArray, 0,intArrayCopy, 0, intArray.length);
	displayArray(intArray, "intArray");
	displayArray(intArray, "intArrayCopy");
	
	
	boolean b = Arrays.equals(intArray, intArrayCopy);
	System.out.printf("%n%n intArray %s intArrayCopy%n", (b ? "==" : "!="));
	
	b = Arrays.equals(intArray, filledIntArray); 
	System.out.printf("intArray %s filledIntArray%n", (b ? "==" : "!="));
	
	int location = Arrays.binarySearch(intArray, 5);
	if   (location >= 0) {
		System.out.printf("Found 5 at elemment %d in intArray%n", location);
	}
	else { 
		System.out.println("5 not found in intArray");
	}
	location = Arrays.binarySearch(intArray, 8763);
	
	if (location >= 0) {
		System.out.printf("Found 8763 at element %d in intArray %n", location);
		
	} else { System.out.println("8763 not found in intArray" );
	
	
	}
}

	public static void displayArray(int[] array, String description) {
		System.out.printf("%n%s", description);
		for (int value: array) {
			System.out.printf("%d", value);
		}
	}
}
