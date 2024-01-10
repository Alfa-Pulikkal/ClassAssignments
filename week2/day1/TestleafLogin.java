package week2.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestleafLogin {

	public static void main(String[] args) {

				ChromeDriver driver = new ChromeDriver();
				
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.manage().window().maximize();
				System.out.println(driver.getTitle());
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
				driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Lead']")).click();
				driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
				
			
		
	}

}
