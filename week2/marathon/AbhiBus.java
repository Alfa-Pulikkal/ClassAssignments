package week2.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
		driver.findElement(By.xpath("//span[@data-date='21']")).click();
		driver.findElement(By.xpath("//a[contains(@class,'btn btn-search')]")).click();
		WebElement theatre = driver.findElement(By.xpath("//h5[@class='title']"));
		System.out.println(theatre.getText());
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		driver.findElement(By.xpath("//div[@class='text-grey']//small")).getText();
		driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
		driver.findElement(By.xpath("(//div[@class='Tooltip-Wrapper ']/button)[2]")).click();
		driver.findElement(By.xpath("(//input[@class='primary  'and @type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@class='primary  'and @type='checkbox'])[2]")).click();
		String seat = driver.findElement(By.xpath("//span[@class='text-primary']")).getText();
		System.out.println(seat);
		String fare = driver.findElement(By.xpath("(//span[@class='text-primary'])[2]")).getText();
		System.out.println(fare);
		driver.close();
		
	}

}
