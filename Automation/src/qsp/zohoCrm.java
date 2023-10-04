package qsp;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zohoCrm {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.183.128:8080/crm/HomePage.do");
	     String title = driver.getTitle();
	     driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		 driver.findElement(By.id("passWord")).sendKeys("123456");
		 driver.findElement(By.xpath("//input[@title='Sign In']")).click();
		 driver.findElement(By.xpath("//a[6][@class='topLink']")).click();
         System.out.println(title);
	}

}
