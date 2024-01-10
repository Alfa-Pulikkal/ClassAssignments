package week3.homeassignments;

public class CheckBoxButton extends Button {

	public void clickCheckButton() {
		System.out.println("Checkbox selected --> CheckBoxButton");

	}
	
	public static void main(String[] args) {
		CheckBoxButton check = new CheckBoxButton();
		check.clickCheckButton();
		check.submit();
		
	}

}
