package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://ecommerce-playground.lambdatest.io/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		String strTitle=(String)js.executeScript("return document.titile");
		System.out.println(strTitle);
		WebElement searchBox=(WebElement)js.executeScript("return document.getElementsByName('search')[0]");
		searchBox.sendKeys("Phone");
		driver.findElement(By.cssSelector("button.type-text")).click();
		js.executeScript("histor.go(-1)");
		js.executeScript("wndow.scrollBy(10, 700)");
		js.executeScript("wndow.scrollBy(10, document.body.scrollHeight)");
	}

}
