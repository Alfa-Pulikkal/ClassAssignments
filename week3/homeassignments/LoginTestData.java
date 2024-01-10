package week3.homeassignments;

public class LoginTestData  {
	
	public void enterUsername(String username) {
		
		System.out.println("Username is: " +username);

	}

	public void enterPassword(String password) {
		System.out.println("Password is: " +password);

	}
	
	public static void main(String[] args) {
		LoginTestData log = new LoginTestData();
		
		log.enterUsername("testleaf");
		log.enterPassword("123test");
	
	}
}
