package week3.homeassignments;

public class TestData extends LoginTestData{

	public void enterCredentials() {
		
		System.out.println("Entering Credentials");

	}
	
	public void navigateToHomePage() {
		System.out.println("Navigating to Home page");

	}
	
	public static void main(String[] args) {
		TestData test = new TestData();
		test.enterCredentials();
		test.enterUsername("selenium");
		test.enterPassword("123testing");
		test.navigateToHomePage();
	}
}
