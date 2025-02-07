package testScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testScript.Base; //need to import since 'Base' class in different package 

public class RadioButton extends Base{
	
	public void radioButtonHandling() {
	driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");	
	WebElement radiobuttonmale = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
	radiobuttonmale.click();
	WebElement showmessagebutton = driver.findElement(By.xpath("//button[@id='button-one']"));
	//WebElement showmessagebutton = driver.findElement(By.cssSelector("button.btn btn-primary[id='button-one']"));  // not shown since class name has space
	showmessagebutton.click();
	//showmessagebutton.isSelected(); //button is checked
	//showmessagebutton.isEnabled(); //button is active mode to select
	}
    public void radiobuttonmaleselectioncheck() {
    driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
    WebElement radiobuttonmale = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
    if(radiobuttonmale.isSelected()) {
    System.out.println("radio button male is already selected");
    }
    else
    {
    System.out.println("radio button male is not selected");
    radiobuttonmale.click();
    }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    RadioButton radiobuttonobj = new RadioButton();
    radiobuttonobj.initializeBrowser();
    //radiobuttonobj.radioButtonHandling();
    radiobuttonobj.radiobuttonmaleselectioncheck();
	}

}
