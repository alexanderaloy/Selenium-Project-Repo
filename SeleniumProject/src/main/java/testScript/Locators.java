package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	
	//WebElement elementname=driver.findElement(By.Locator("locator value"));
	
	public void id() {   //locator id 
		//Enter and show Message code
		WebElement id1 = driver.findElement(By.id("single-input-field"));
		id1.sendKeys("abc");
		WebElement id2 = driver.findElement(By.id("button-one"));
		id2.click();
		//Calculate Total of Two Input Fields 
		WebElement id3 = driver.findElement(By.id("value-a"));
		id3.sendKeys("1");
		WebElement id4 = driver.findElement(By.id("value-b"));
		id4.sendKeys("2");
		WebElement id5 = driver.findElement(By.id("button-two"));
		id5.click();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
