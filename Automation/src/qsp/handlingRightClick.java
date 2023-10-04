package qsp;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingRightClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/");
		WebElement src=driver.findElement(By.xpath(""));
		WebElement target=driver.findElement(null);
		Actions a=new Actions(driver);
		a.dragAndDrop(src, target).perform();
		

	}

}
