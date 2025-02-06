package testScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testScript.Base;

public class TestSample extends Base {
	
	public void test1() {
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	//WebElement messagefield = driver.findElement(By.id("single-input-field"));
	WebElement messagefield = driver.findElement(By.xpath("//input[@id='single-input-field']")); //element using xpath
	messagefield.sendKeys("abc");
	//WebElement buttonclick = driver.findElement(By.id("button-one"));
	//WebElement buttonclick = driver.findElement(By.cssSelector("button#button-one")); //element using css selector
	WebElement buttonclick = driver.findElement(By.cssSelector("button#button-one"));
	buttonclick.click();
	}
	
	public void testcalculate() {
	WebElement valueofa = driver.findElement(By.id("value-a"));
	valueofa.sendKeys("1");
	WebElement valueofb = driver.findElement(By.id("value-b"));
	valueofb.sendKeys("10");
	WebElement getTotal = driver.findElement(By.id("button-two"));
	getTotal.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    TestSample testSample = new TestSample();
    testSample.initializeBrowser();
    testSample.test1();
    testSample.testcalculate();
    //obj.driverQuitAndClose();
	}

}
