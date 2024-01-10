package week3.homeassignments;

public class JavaConnection implements DatabaseConnection {

	public void connect() {
		System.out.println("Connecting to the Database");
		
	}

	public void disconnect() {
		System.out.println("Disconnecting from the Database");
		
	}

	public void executeUpdate() {
		System.out.println("Executing updates");
		
	}
	
	public static void main(String[] args) {
		JavaConnection java = new JavaConnection();
		java.connect();
		java.disconnect();
		java.executeUpdate();
	}

}
