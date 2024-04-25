package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class PageLoadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		//Actions actions=new Actions(driver);
		driver.get("http://uitestingplayground.com/");
		driver.findElement(By.linkText("Load Delay")).click();
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();

	}

}
