




import java.util.Scanner; // using Scanner

public class TempConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create Scanner to obtain input values from command window
		
		Scanner input = new Scanner(System.in);
		
		String name;
		double F_number;
		double Celsius;
				
	System.out.print("Please enter your name : ");
	    name= input.nextLine(); //Read name here
	
	System.out.print("Enter temprature in Farenheit:");
	F_number = input.nextDouble();  //line for Farenheit input
	
	Celsius =  5.0/9.0 * (F_number - 32.0); //Celsius formula
	
	System.out.println ("This program is authored by" + name );
	System.out.printf ("For a Fahrenehit temprature of %.2f Degrees the equivalent in Celsius temprature is %.2f degree" , F_number,Celsius);
	
	}
	

}
