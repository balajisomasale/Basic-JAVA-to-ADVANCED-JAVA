


import java.util.Scanner;
abstract class Card{ 
	String holderName;
	String cardNumber;
	String expiryDate;
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Card(String holderName, String cardNumber, String expiryDate) {
		this.holderName = holderName;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
	}
	
	
	
}
class MembershipCard extends Card{
	private int rating;

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public MembershipCard(String holderName, String cardNumber, String expiryDate, int rating) {
		super(holderName, cardNumber, expiryDate);
		this.rating = rating;
	}

		
	}	
class PaybackCard extends Card{
	int pointsEarned;
	double totalAmount;
	public int getPointsEarned() {
		return pointsEarned;
	}
	public void setPointsEarned(int pointsEarned) {
		this.pointsEarned = pointsEarned;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public PaybackCard(String holderName, String cardNumber, String expiryDate, int pointsEarned, double totalAmount) {
		super(holderName, cardNumber, expiryDate);
		this.pointsEarned = pointsEarned;
		this.totalAmount = totalAmount;
	}
	
	
}
public class Main {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t,pe,ra;
		double ta;
		String pc,mc;
		System.out.println("Select the Card");
		System.out.println("1.Payback Card");
		System.out.println("2.Membership Card");
		t=sc.nextInt();
		sc.nextLine();
		if(t==1)
		{
			System.out.println("Enter the Card Details:");
			pc=sc.nextLine();
			System.out.println("Enter points in card");
			pe=sc.nextInt();
			System.out.println("Enter Amount");
			ta=sc.nextInt();
			String[] de=pc.split("\\|",3);
			PaybackCard ob=new PaybackCard(de[0],de[1],de[2],pe,ta);
			System.out.println(ob.getHolderName()+"'s Payback Card Details:");
			System.out.println("Card Number "+ob.getCardNumber());
			System.out.println("Points Earned "+ob.getPointsEarned());
			System.out.println("Total Amount "+ob.getTotalAmount());
				
		}
		if(t==2)
		{
			System.out.println("Enter the Card Details:");
			pc=sc.nextLine();
			System.out.println("Enter rating in card");
			ra=sc.nextInt();
			String[] de=pc.split("\\|",3);
			MembershipCard ob=new MembershipCard(de[0],de[1],de[2],ra);
			System.out.println(ob.getHolderName()+"'s Membership Card Details:");
			System.out.println("Card Number "+ob.getCardNumber());
			System.out.println("Rating "+ob.getRating());
			
			
		}
	}

}
