package week3.homeassignments;

public class LoginPage extends BasePage {
	
	public void performCommonTask() {
        System.out.println("Performing common task in Loginpage");		

	}

	public static void main(String[] args) {
		LoginPage Log = new LoginPage();
		Log.performCommonTask();
		Log.clickElement();
		Log.enterText();
	}
}
