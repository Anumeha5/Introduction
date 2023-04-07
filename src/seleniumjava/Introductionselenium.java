package seleniumjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introductionselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoking Browser
		//Chrome - ChromeDriver exten->Methods Close get
		////Firefox-FirefoxDriver->methods close get
		//webDriver close get
		//webDriver Methods + class Methods
		
		//Chromedriver.exe-> Chrome browser
		System.setProperty("webderiver.chrome.driver", "C:\\Anumeha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacadmy.com");
		driver.getTitle();
		System.out.println(driver.getTitle());
	}
	

}

