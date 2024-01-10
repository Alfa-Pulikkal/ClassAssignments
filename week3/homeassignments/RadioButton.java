package week3.homeassignments;

public class RadioButton extends Button {
	
	public void selectRadioButton() {
		System.out.println("Radio Button Selected --> RadioButton class");

	}

	public static void main(String[] args) {
		RadioButton rd = new RadioButton();
		rd.selectRadioButton();
		rd.submit();
		rd.setText();

	}

}
