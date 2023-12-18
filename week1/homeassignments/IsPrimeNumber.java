package week1.homeassignments;

public class IsPrimeNumber {

	public static void main(String[] args) {
		boolean isPrime = false;
		int num = 13;
		
		for (int i = 2; i<=num/2 ; i++) {
			if(num%i==0) { 
				System.out.println(num+ " is non prime");
				isPrime = true;
				break;
			}
			
			
		}
			if (!isPrime) 
				System.out.println(num+ " is prime");
				
			
		
				
		
		
	}

}
