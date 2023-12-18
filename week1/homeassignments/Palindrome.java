package week1.homeassignments;

public class Palindrome {
public static void main(String[] args) {
	

		int input = 1234;
		int reverse;
		int i;
		reverse = input;
		for (i = 0; input > 0; input=input/10) {
			
			int rem = input % 10;
			i = (i * 10) + rem;
			//i = 1, i = 12 , i = 121
			
			
		}
		
			if (i == reverse) {
				System.out.println(reverse + " is palindrome");
				
			}
			
			else {
				System.out.println(reverse + " Not palindrome");
			}
		
		
	
	}

}
