package week1.homeassignments;

public class Mobile {
	
	void makeCall(String mobileModel,float mobileWeight) {
		System.out.println("Mobile model is " + mobileModel);
		System.out.println("Mobile weight is " + mobileWeight);
	
	}
	boolean sendMsg(boolean isFullyCharged,int mobileCost) {
		System.out.println("Mobile is fully charged " +isFullyCharged);
		System.out.println("Mobile cost is " +mobileCost);
		
		return isFullyCharged;
		
	}
	public static void main(String[] args) {
		Mobile data = new Mobile();
		data.makeCall("S23", 3.1f);
		data.sendMsg(false, 1000);
		System.out.println("This is my mobile");
		
		
	}

}
