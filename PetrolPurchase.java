/*CIS Java Mohammed Brohi
 * Petrol Class
 */



public class PetrolPurchase {

	public String stationLocation;
	public String typeOfPetrol;
	public int		quantity;
	public double 	pricePerLitre;
	public double percentageDiscount;
	
	
	//initialize variables

public PetrolPurchase(String stationLocation, String typeOfPetrol , double pricePerLitre, double percentageDiscount, int quantity) {
			
	this.stationLocation = stationLocation;
	this.typeOfPetrol = typeOfPetrol;
	
	if(quantity > 0.0)
	this.quantity = quantity;
	
	if(pricePerLitre > 0.0)
	this.pricePerLitre = pricePerLitre;
	
	this.percentageDiscount = percentageDiscount;
	}
	
// set and get methods for each instance variable 

public String getStation() {
	return stationLocation;
}

public void setStation(String stationLocation) {
	this.stationLocation = stationLocation;
}
public String getPetrol() {
	return typeOfPetrol;
}

public void setPetrol(String typeOfPetrol) {
	this.typeOfPetrol= typeOfPetrol;
}

public double getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public double getPricePerLitre() {
	return pricePerLitre;
}

public void setPricePerLitre(double pricePerLitre) {
	this.pricePerLitre = pricePerLitre; 
}
public double getDiscount() {
	return percentageDiscount;
}

public void setDiscount(double percentageDiscount) {
	this.percentageDiscount = percentageDiscount;
}

public void getPurchaseAmount(int quantity, double pricePerLitre){
			if (quantity > 0.0) 
			if(pricePerLitre > 0.0)
			 quantity = (int) ((int)(quantity * pricePerLitre) - (percentageDiscount));
}

public void printObjdiscount() {
			
	System.out.printf("Current discount is %.d", getDiscount());
			
		}
}
import java.util.Scanner;

public class PetrolPurchaseTest {

	public static void main(String[] arg) {
		
		PetrolPurchase 	customer1 = new PetrolPurchase("Devon Station", "Regular Fuel", 2 , 2.35 , 3);
		PetrolPurchase customer2 =  new PetrolPurchase("Clybourn Station", "Special", 3 , 3.65 , 0);
		
		System.out.printf("Gas station at %s\n", customer1.getStation());
		System.out.printf("Fuel Type was %s\n" , customer1.getPetrol());
		System.out.printf("You bought %.2f gallons at the rate of $ %.2f\n ", customer1.getPricePerLitre(), customer1.getDiscount());
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}



	

