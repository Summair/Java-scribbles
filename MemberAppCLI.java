// Membership card application interface; Java practice.
//Author: M.Brohi
/* Simple command line Membership program */




public class Member {

	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private int membershipNumber;
	private String noOfCards;
	private MembershipCard card;

	//Constructor 
	
	public Member( String fName, String lName, String uName, String pWord) {
		
		firstName = fName;
		lastName = lName;
		userName = uName;
		password = pWord;
		
	} 

/* method accessor for variables
 * 
 */

public String getFirstName() {
	return firstName;
}
public String getLastName() {

	return lastName;

}

public String getUserName() {
	return userName;
	
}
public String getPassword() {
	return password;
}

public int setCard() {
	return membershipNumber;
	}

public String getNoOfCards() {
	return noOfCards;
}

public MembershipCard getCard() {
	return card;
}

public void setCard(MembershipCard card) {
	this.card = card;
}



}

//Method to collect MembershipCard attribute

public class MembershipCard {
	
	private int noOnLoan;
	private int maxOnLoan;
	
	
public MembershipCard(int max) {
		maxOnLoan = max;
}

public int getNoOnLoan() {
	return noOnLoan;
}

public int getMaxOnLoan() {
	return maxOnLoan;
}


}

//Main where your objects extend

public class MainInterface {

	private static final Member[] Members = null;

	private int noOfMembers;
	
		public void addMember(String fName, String lName, String uName, String pWord) {
			if (noOfMembers < 6)
			{	Members[noOfMembers] = new Member(fName, lName, uName, pWord);
			
			System.out.println("The member has been added.");
			
			noOfMembers++;
		}
	}

}
