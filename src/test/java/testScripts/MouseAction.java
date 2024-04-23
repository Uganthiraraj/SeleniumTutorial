package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		options.addArguments("--blink-settings=imagesEnable=False");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		driver.get("https://demo.opencart.com/");
		
		WebElement srcBox=driver.findElement(By.name("search"));
		
		WebElement menu=driver.findElement(By.cssSelector("ul.nav.navbar-nav > li:nth-child(3)"));
		
		WebElement menuItem=driver.findElement(By.xpath("//ul[@class='list-unstyled']//a[contains(text(),'Monitors (2)')]"));
		
		actions.moveToElement(menu).click(menuItem).build().perform();
		
		driver.get("https://www.stqatools.com/demo/DoubleClick.php");
		WebElement btn=driver.findElement(By.xpath("//button[text()='Click Me / Double Click Me!']"));
		actions.doubleClick(btn).doubleClick(btn).build().perform();
	}

}
