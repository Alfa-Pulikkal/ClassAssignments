package week1.homeassignments;

public class Car {
	
	void applyBreak(){
		System.out.println("Applied break");
		
	}

	void soundHorn(){
		System.out.println("Sound horn");
	}
	public static void main(String[] args) {
		Car data = new Car();
		data.applyBreak();
		data.soundHorn();
	}
}
