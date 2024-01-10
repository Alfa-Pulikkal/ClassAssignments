package week2.homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("accountName")).sendKeys("Alfa");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement industryDD = driver.findElement(By.name("industryEnumId"));
		Select sec = new Select(industryDD);
		sec.selectByIndex(3);
		
		WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
		Select sec1 = new Select(ownershipDD);
		sec1.selectByVisibleText("S-Corporation");
		
		WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
		Select sec2 = new Select(sourceDD);
		sec2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement markCampDD = driver.findElement(By.id("marketingCampaignId"));
		Select sec3 = new Select(markCampDD);
		sec3.selectByIndex(6);
		
		WebElement stateDD = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sec4 = new Select(stateDD);
		sec4.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String displayedName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		String actualName = "Alfa";
		
		if (displayedName.contains(actualName)) {
			System.out.println("Verification passed");
			
		}
			else {
				System.out.println("Verification failed");
				
			
			}
			
		}
		
		
		
		
		
		
		
		}


