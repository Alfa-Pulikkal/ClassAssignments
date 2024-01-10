package week3.homeassignments;

public class BasePage {
	
	public void findElement() {
		
		String element = "Username";
		System.out.println("Finding Element: " +element);
		
	}
	
	public void clickElement() {
		String element = "NextButton";
		System.out.println("Clicking element: " +element );
		
	}
	
	public void enterText() {
		String element= "123pass";
		System.out.println("Entering password: " +element);

	}

	public void performCommonTask() {
        System.out.println("Performing common task in Basepage");		

	}
	
	public static void main(String[] args) {
		BasePage base = new BasePage();
		base.clickElement();
		base.performCommonTask();
		base.enterText();
	}
	
}
