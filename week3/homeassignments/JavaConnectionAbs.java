package week3.homeassignments;

public class JavaConnectionAbs extends MySqlConnection{

	@Override
	public void executeQuery() {
		System.out.println("Query Executed");
		
	}
	public void disconnect() {
		System.out.println("Connecting completed");
		
	}

	public static void main(String[] args) {
		JavaConnectionAbs abs = new JavaConnectionAbs();
		abs.executeQuery();
		abs.connect();
		abs.disconnect();
	}


	
}
