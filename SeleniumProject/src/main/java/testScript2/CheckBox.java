package testScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testScript.Base;

public class CheckBox extends Base{
	
	public void checkBoxHandling() {
	driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
	WebElement checkboxelement = driver.findElement(By.xpath("//input[@id='gridCheck']"));
	checkboxelement.click();
	}
	
	public void checkBoxEnabledCheck() {
	driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
	WebElement checkboxelementdisplay = driver.findElement(By.xpath("//input[@id='gridCheck']"));
	if(checkboxelementdisplay.isEnabled()) {
	System.out.println("The checkbox is enabled and will be selected");
	checkboxelementdisplay.click();
	}else
	System.out.println("The Checkbox is disabled");
	}
 
	public void checkBoxSelectionCheck() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkboxelementselection = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		if(checkboxelementselection.isSelected()){
		System.out.println("The Checkbox field is already selected");	
		}else
		System.out.println("The Checkbox field needs to be selected");
		checkboxelementselection.click();
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	CheckBox checkboxobj = new CheckBox();
	checkboxobj.initializeBrowser();
	//checkboxobj.checkBoxHandling();
	checkboxobj.checkBoxEnabledCheck();
	//checkboxobj.checkBoxSelectionCheck();
	}

}
