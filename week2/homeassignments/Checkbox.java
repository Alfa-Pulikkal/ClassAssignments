package week2.homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox-box ui-widget')]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]")).click();
		
		String text = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		String expectedText = "Checked";
		if (expectedText.equals(text)) {
			
		
			System.out.println("Notification message displayed = " + text);
		
		}
		Thread.sleep(500);
		
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[3]")).click();
		//driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']//div)[2]")).click();
		
		WebElement triStateCheckbox = driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']//div)[2]"));
        triStateCheckbox.click();
		
        WebElement stateDisplayed = driver.findElement(By.xpath("(//div[@class='ui-growl-message'])/p"));
		System.out.println(stateDisplayed.getText());
		
		driver.findElement(By.xpath("//div[contains(@class,'ui-toggleswitch-slider')]")).click();
		String toggleText = driver.findElement(By.className("ui-growl-title")).getText();
		
		if (toggleText.equals(expectedText)) {
			
			System.out.println("Notification message displayed = " + toggleText);
			
		}
		Boolean isDisabled = driver.findElement(By.xpath("(//span[text()='Disabled']/preceding-sibling::div)[2]")).isEnabled();
		if(isDisabled) {
			
			System.out.println("The Checkbox is disabled ");
	
		} else {
			
			System.out.println("The Checkbox is not disabled ");
		}
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.findElement(By.xpath("//li[@data-item-value='London']/div")).click();
		driver.findElement(By.xpath("//li[@data-item-value='Istanbul']/div")).click();
		
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		
		Boolean isSelectedBasic = driver.findElement(By.className("ui-chkbox-label")).isSelected();
		if (isSelectedBasic) {
			
			System.out.println("Basic checkbox is selected");
			
			
		}
		
		driver.close();
	
	}

}
