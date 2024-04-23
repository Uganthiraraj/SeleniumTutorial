package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		//driver.get("https://the-internet.herokuapp.com/login");
		//driver.findElement(By.id("username")).sendKeys("tomsmith");
		//driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
		//driver.findElement(By.className("radius")).click();
		//driver.findElement(By.partialLinkText("Elemental")).click();
		//driver.findElement(By.xpath("//*[@id='login']/button/i")).click();
		driver.get("https://www.lambdatest.com/blog/");
		driver.findElement(By.cssSelector("div.header__menu__items > div:nth-child(3)")).click();
		driver.findElement(By.cssSelector("div.header__menu__items div[class*='rs-dropdown']")).click();
	}

}
//div.header__menu__items div[class*='rs-dropdown']
	//	div.header__menu__items > div:nth-child(3)
		