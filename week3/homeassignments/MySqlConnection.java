package week3.homeassignments;

public abstract class  MySqlConnection implements DatabaseConnection {

	public void connect() {
		System.out.println("Connected");
		
	}


	public void executeUpdate() {
		System.out.println("Execution updating");
		
	}

	public abstract void executeQuery();
		
	
}
