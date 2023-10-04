package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnamePrint {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement link = driver.findElement(By.tagName("a"));
		String tag = link.getTagName();
		System.out.println(tag);
		driver.quit();
		
	}

}
