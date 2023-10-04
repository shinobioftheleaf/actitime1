package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user%20pc/Documents/CV.html");
		
		Thread.sleep(3000);
		driver.findElement(By.id("CV")).sendKeys("‪C:\\Users\\user pc\\Desktop\\Resume.docx");

	}

}
