package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	
	public WebDriver driver;  // created interface object reference variable as a global variable to access in all methods 
	
	public void initializeBrowser() {
	//WebDriver driver = new ChromeDriver();	//driver loading in chrome browser	
	//WebDriver driver = new EdgeDriver();	//driver loading in edge browser
	driver = new ChromeDriver();	//driver as object reference variable loading in chrome browser 
	
	driver.get("https://selenium.qabible.in/"); //url launch 
	driver.manage().window().maximize(); //window maximize
	}
	
	public void driverQuitAndClose() {
	driver.quit();	// all window close
	//driver.close(); //current first window(parent) close
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Base base = new Base();
    base.initializeBrowser();
    base.driverQuitAndClose();
	}

}
