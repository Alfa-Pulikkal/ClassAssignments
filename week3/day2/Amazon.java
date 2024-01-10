package week3.day2;

public class Amazon extends CanaraBank {

	public void cardPayments() {
		System.out.println("Card Payment Selected");
	}

public void cashOnDelivery() {
	System.out.println("Cash on Delivery Selected");
}
public void upiPayments() {
	System.out.println("UPI Payments Selected");
	
}
public void internetBanking() {
	System.out.println("Internet Banking Selected");
	
}
public static void main(String[] args) {
	Amazon am = new Amazon();
	
	am.internetBanking();
	am.recordPaymentsDetails();
}
}
