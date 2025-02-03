package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelector extends Base{  
	
	public void tagandid() {   //CSS selector combinations
	//syntax : tag#id
	WebElement tagandid1 = driver.findElement(By.cssSelector("input#single-input-field"));  //enter message
	WebElement tagandid2 = driver.findElement(By.cssSelector("button#button-one"));   //show message
	WebElement tagandid3 = driver.findElement(By.cssSelector("input#value-a"));   //entervaluea
	}
	//Note:By is considered as a class
	
	public void tagandclass() {
	//syntax : tag.class	
	WebElement tagandclass1 = driver.findElement(By.cssSelector("input.form-control")); //under ajax form submit
	WebElement tagandclass2 = driver.findElement(By.cssSelector("textarea.form-control")); //under ajax form submit
	}
	
	public void tagandattribute() {
	//syntax : tag[attribute=value]	
	WebElement tagandatt1 = driver.findElement(By.cssSelector("button[id='button-one']"));
	WebElement tagandatt2 = driver.findElement(By.cssSelector("input[id='single-input-field']"));	
	WebElement tagandatt3 = driver.findElement(By.cssSelector("input[id='single-input-field']"));
	WebElement tagandatt4 = driver.findElement(By.cssSelector("button[fdprocessedid='6opitd']"));
	}
   
    public void tagclassandattribute() {
	//syntax : tag.classname[attribute=value]
    	// or
    //syntax : tag.classattributename[attribute=value] -> can choose this combination only when the element tag having class attribute
    	 
    WebElement tagclassatt1 = driver.findElement(By.cssSelector("input.form-control[id='single-input-field']"));
    WebElement tagclassatt2 = driver.findElement(By.cssSelector("button.btn btn-primary[id='button-one']")); // invalid since space in class shown in attribute value
	}
	
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
