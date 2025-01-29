package testScript;

public class NavigationCommands extends Base{
	
	public void navigationCommands() {
	driver.navigate().to("https://www.amazon.in/");   //use to navigate from one url to another (here from obscura url to amazon)
	driver.navigate().back();  //use to navigate back to previous page
	driver.navigate().forward(); //used to navigate forward
	driver.navigate().refresh(); //used to refresh the current page
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	NavigationCommands navigationcommands = new NavigationCommands();
	navigationcommands.initializeBrowser();
    navigationcommands.navigationCommands();
    navigationcommands.driverQuitAndClose();
	}

}
