package testScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisplayTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://automationbookstore.dev/");
		driver.findElement(By.id("searchBar")).sendKeys("Test");
		
		TakesScreenshot screen=(TakesScreenshot)driver;
		File srcImg=screen.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"/screenshots/"+System.currentTimeMillis()+".png";
		FileUtils.copyFile(srcImg, new File(path));
		
		String strPlaceholder = driver.findElement(By.id("searchBar")).getAttribute("placeholder");
		System.out.println(strPlaceholder);
		WebElement closeIcon = driver.findElement(By.cssSelector("a[title='Clear text']"));
		
		
		System.out.println(closeIcon.isDisplayed());
		if(closeIcon.isDisplayed()) {
			closeIcon.click();
		}
		File srcImg1=screen.getScreenshotAs(OutputType.FILE);
		String path1 = System.getProperty("user.dir")+"/screenshots/"+System.currentTimeMillis()+".png";
		FileUtils.copyFile(srcImg1, new File(path1));
	}

}
