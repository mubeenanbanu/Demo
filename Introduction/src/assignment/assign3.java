package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mubeena\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

	}
	public static void AddToCart(WebDriver driver)
	{
		driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("learning");
		
	}

}
