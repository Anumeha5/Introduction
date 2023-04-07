package seleniumjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webderiver.chrome.driver", "C:\\Anumeha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
      	driver.manage().window().maximize();
      	driver.get("http://google.com");
      	driver.navigate().to("http://rahulshettyacademy.com");
      	driver.navigate().back();
      	driver.navigate().forward();
		
		
		

	}

}
