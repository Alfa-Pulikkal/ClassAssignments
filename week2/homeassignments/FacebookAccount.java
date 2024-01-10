package week2.homeassignments;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAccount {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//cannot do this assignment as facebook comes up with cookie pop up and its an application issue
		//as adviced by the mentors

	}

}
