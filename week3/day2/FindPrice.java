package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindPrice {

	private static String text;

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus Mobiles", Keys.ENTER);

		List<WebElement> allprices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		List<String> list = new ArrayList<String>();
		
		for (WebElement each : allprices) {
		String text = each.getText();
		list.add(text);
		
		
		}
		
		Collections.sort(list);
		System.out.println(list.get(0));
		
	}

}
