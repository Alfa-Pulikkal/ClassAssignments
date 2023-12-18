package week1.homeassignments;


public class Fibonacci {
	public static void main(String[] args) {
		
	int n = 8, n1 = 0, n2 = 1, n3;

		for (int i = 1; i <=8; i++) {
			System.out.print(n1+ ",");
			n3= n1+n2;
			n1=n2;
			n2=n3;
					
		}
	}

}

