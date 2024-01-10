package week3.homeassignments;

public class TextField extends WebElement {

	public void getText() {
		System.out.println("Testleaf --> TextField class");
	}
	
	public static void main(String[] args) {
		TextField text = new TextField();
		text.getText();
		text.setText();
		text.click();
	}
}
