package week3.day1;

public class Java {
	public void reportStep() {
		String msg = "Hi";
		String status = "Good";
		System.out.println("Message: " + msg + " Status:" + status);

	}
	public void reportStep(String msg, String status, boolean snap) {
		
		System.out.println("Message: " + msg + " Status:" + status + " Taken snap: " + snap);

}
	public static void main(String[] args) {
		Java jv = new Java();
		jv.reportStep();
		jv.reportStep("Hello", "Excellent", true);
	}
}