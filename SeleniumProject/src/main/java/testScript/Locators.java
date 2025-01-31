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
	
	public void classname() {
	WebElement c1 = driver.findElement(By.className("header-top"));	//practicing with unique class attribute
	WebElement c2 = driver.findElement(By.className("clearfix"));   
	WebElement c3 = driver.findElement(By.className("container page"));  
	WebElement c4 = driver.findElement(By.className("col-lg-3 col-md-3 col-sm-12 col-xs-12")); 
	}
	
	public void name() {
	WebElement n1 = driver.findElement(By.name("viewport")); //practicing with name attribute
	WebElement n2 = driver.findElement(By.name("description"));
	WebElement n3 = driver.findElement(By.name("keywords"));
	WebElement n4 = driver.findElement(By.name("author"));
	}

	public void linktext() {
	WebElement l1 = driver.findElement(By.linkText("Simple Form Demo"));  //practicing with linktext attribute.
	WebElement l3 = driver.findElement(By.linkText("Radio Buttons Demo")); //Linktext attribute used to identify webelement in code
	WebElement l2 = driver.findElement(By.linkText("Checkbox Demo")); //Eg '<a href="jquery-select.php">Jquery Select2</a>' starts with <a href
	WebElement l4 = driver.findElement(By.linkText("Select Input"));
	WebElement l5 = driver.findElement(By.linkText("Jquery Select2"));
	
	
	}
	
    public void partialLinkText() {
		
	}
		
    
    public static void main(String[] args) {
	
		// TODO Auto-generated method stub

	}

}
