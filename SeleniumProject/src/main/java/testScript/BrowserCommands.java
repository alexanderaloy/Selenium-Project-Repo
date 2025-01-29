package testScript;

public class BrowserCommands extends Base{
	
	public void browserCommands() {   //created instance method
	String Title = driver.getTitle();    //assigned to string variable "Title" since output is string data. getTitle method is used to get title
	System.out.println(Title);
	String Url =driver.getCurrentUrl(); //getCurrentUrl() string out command to get site current url
	System.out.println(Url);
	String PageSource =driver.getPageSource(); //getPageSource() to get html code of the current page
	System.out.println(PageSource); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands browsercommands = new BrowserCommands();
        browsercommands.initializeBrowser();
        browsercommands.browserCommands();
        browsercommands.driverQuitAndClose();
	}

}
