package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class execute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automation by Ashish\\chromedriver_win32\\chromedriver.exe");

		WebDriver  clear = new ChromeDriver();
         // clear.get("https://www.cleartrip.com/");
		clear.get("https://www.makemytrip.com/");
		String a= clear.getCurrentUrl();
		System.out.println(a);
		
	}

}
