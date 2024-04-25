package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpWaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		//Actions actions=new Actions(driver);
		driver.get("http://uitestingplayground.com/ajax");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.findElement(By.id("ajaxButton")).click();
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector("div#content")), "Data loaded with AJAX get request."));
		String strTxt=driver.findElement(By.cssSelector("div#content")).getText();
		System.out.println(strTxt);

	}

}
