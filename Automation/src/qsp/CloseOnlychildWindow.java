package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlychildWindow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		String pwh =driver.getWindowHandle();
		Set<String> allwh=driver.getWindowHandles();
			for(String wh:allwh)
			{
				driver.switchTo().window(wh);
				if(pwh.equals(wh))
				{}
				else
				{
					driver.close();
				}
				}
				}

		

	}


