package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base{
	
	//uses Relative Xpath .following are the relative xpath methods 
	
	public void xpath() {
	// syntax: //tag[@attribute='value']
	WebElement elementname = driver.findElement(By.xpath("//button[@id='button-one']"));
	WebElement elementname2 = driver.findElement(By.xpath("//input[@id='value-a']"));
	WebElement elementname3 = driver.findElement(By.xpath("//input[@fdprocessedid='j1j16o']"));
	}
    public void contains() {
	// syntax:  //tag[contains(@attribute,'value')]	
    //note value can be given partial data either from beginning or ending or any where of the text 
    WebElement elementcontains = driver.findElement(By.xpath("//input[contains(@id,'value-a')]"));
    WebElement elementcontains2 = driver.findElement(By.xpath("//input[contains(@fdprocessedid,'jycfxl')]"));
    WebElement elementcontains3 = driver.findElement(By.xpath("//button[contains(@fdprocessedid,'0bpfey')]"));
	}
    public void startswith() {
	// syntax : //tag[starts-with(@id,'value')]	
    //note value can be given partial data but should be from the beginning of the text
    WebElement elementstarts = driver.findElement(By.xpath("//input[starts-with(@id,'value-a')]"));
    WebElement elementstarts1 = driver.findElement(By.xpath("//input[starts-with(@id,'subject')]"));
    }
    public void text() {
	// syntax : //tag[text()='text']
    //@ is required only when attribute is included . In this syntax method text() is passed . 
    WebElement elementtext = driver.findElement(By.xpath("//button[text()='Show Message']"));
    }
    public void and() {
    // syntax : //tag[@attribute='value' and @attribute='value']	
    WebElement elementwithand1 = driver.findElement(By.xpath("//input[@id='value-a' and @class='form-control']"));
    WebElement elementwithand2 = driver.findElement(By.xpath("//button[@type='button' and @id='button-two']"));
    }
    public void or() {
	// syntax : //tag[@attribute='value' or @attribute='value']	
    WebElement elementwithor1 = driver.findElement(By.xpath("//input[@id='value----' or @fdprocessedid='08r58d']"));
    WebElement elementwithor2 = driver.findElement(By.xpath("//button[@data-toggle='collapsewwwwwww' or @data-target='#collapsibleNavbar']"));
    //note : In the above codes one of the attribute is given incorrect 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}
