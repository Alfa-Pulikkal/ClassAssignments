package week3.day1;


public class Safari extends Browser {
	public void readerMode() {
		System.out.println("Reader mode ON --> Safari class");

	}
	public void fullScreenMode() {
		System.out.println("Full screen Mode ON --> Safari class");

	}
	
	public static void main(String[] args) {
		Safari saf = new Safari();
		saf.readerMode();
		saf.fullScreenMode();
		saf.openURL();
		saf.closeBrowser();
		saf.navigateBack();
	}

}

