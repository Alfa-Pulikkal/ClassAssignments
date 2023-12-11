package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		
	
	Browser edge = new Browser();
	String launchBrowser = edge.launchBrowser("Chrome");
	System.out.println(launchBrowser);
	edge.loadUrl();
	
}
}