package week1.day2;

public class Browser {
	
	String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return browserName;	
	}

	void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
	
	public static void main(String[] args) {
		Browser brow = new Browser();
		String launchBrowser = brow.launchBrowser("Chrome");
		System.out.println(launchBrowser);
		brow.loadUrl();
		
	}
	

}
