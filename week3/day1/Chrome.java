package week3.day1;

public class Chrome extends Browser {
	
	public void openIncognito() {
		System.out.println("Open incognito window --> chrome class");

	}
	public void clearCache() {
		System.out.println("Cache cleared --> chrome class");

	}

	public static void main(String[] args) {
		Chrome ch = new Chrome();
		ch.openIncognito();
		ch.clearCache();
		ch.closeBrowser();
		ch.navigateBack();
		ch.openURL();

	}

}
