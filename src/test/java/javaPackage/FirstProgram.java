package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) {
		//Setting the path of chromedriver latest version
		
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\nikhi\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
				
		        //Using chrome driver to launch chrome 
				//Syantax if you wish to launch chrome browser
				WebDriver driver = new ChromeDriver();
				
				//Webdriver method
				
				driver.get("https://www.flipkart.com/");
				
				
				

	}

}
