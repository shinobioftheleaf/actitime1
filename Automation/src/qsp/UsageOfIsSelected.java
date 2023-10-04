package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsSelected {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		WebElement ele=driver.findElement(By.id("keepLoggedInCheckBox"));
		ele.click();
		boolean res=ele.isSelected();
		if(res)
		{
			System.out.println("check box is selected");
		}
		else
		{
			System.out.println("check box is selected"); 
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
