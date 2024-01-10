package week3.day1;

public class Edge extends Browser {
	
	public void takeSnap() {
		System.out.println("Taken a snap --> Edge class");

	}
	public void clearCookies() {
		System.out.println("Cleared cookies --> Edge class");

	}
	
	public static void main(String[] args) {
		Edge ed = new Edge();
		ed.takeSnap();
		ed.clearCookies();
		ed.closeBrowser();
		ed.openURL();
		ed.navigateBack();
	}

}
