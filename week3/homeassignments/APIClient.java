package week3.homeassignments;

public class APIClient {

	public void sendRequest(String endpoint) {
		System.out.println("Sending request to endpoint: " +endpoint);

	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
	
		System.out.println("Sending request to endpoint: " +endpoint);
		System.out.println("Request body: " +requestBody);
		System.out.println("Request Status: " +requestStatus);
	
	}
	public static void main(String[] args) {
		APIClient API =new APIClient();
		API.sendRequest("api/endpoint01");
		API.sendRequest("api/endpoint02", "t/value/", true);

	}

}
