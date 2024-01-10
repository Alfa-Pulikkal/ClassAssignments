package week3.day1;

public class Override extends Java {
	

		public void reportStep() {
			String msg = "Hi";
			String status = "Very Good";
			System.out.println("Message: " + msg + " Status:" + status);


}
		public static void main(String[] args) {
			Override over = new Override();
			over.reportStep();
			Java j = new Java();
			j.reportStep();
			
		}
}