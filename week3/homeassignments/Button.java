package week3.homeassignments;

public class Button extends WebElement {

	public void submit() {
		System.out.println("Submit Button clicked --> Button class");
	}
	
	public static void main(String[] args) {
		Button bu = new Button();
		bu.submit();
		bu.click();
		bu.setText();
	}
}


