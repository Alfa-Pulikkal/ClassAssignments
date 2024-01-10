package week2.homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Find")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("7907907907");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(500);
		//get lead ID
		WebElement firstLead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a"));
        System.out.println(firstLead.getText());
        String id = firstLead.getText();
		
        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		driver.findElement(By.partialLinkText("Find")).click();
		driver.findElement(By.name("id")).sendKeys(id);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(1000);
		
		WebElement noRecordsMessage = driver.findElement(By.xpath("//div[@class='x-paging-info']"));
        if (noRecordsMessage.isDisplayed()) {
            System.out.println("Lead deletion successful.");
        } else {
            System.out.println("Lead deletion failed.");
        }
        
        driver.close();
		
		
		
	}
	

}
