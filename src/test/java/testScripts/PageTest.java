package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageTest {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.setBrowserVersion("115");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		System.out.println("Page Title : ..."+driver.getTitle());
		WebElement srcBox=driver.findElement(By.tagName("textarea"));
		srcBox.sendKeys("Java Tutorial");
		List<WebElement> listItems=driver.findElements(By.xpath("ul[@role='listbox']//li//descendant::div[@class='pcTkSc']"));
		System.out.println("total items : "+listItems.size());
		//srcBox.sendKeys(Keys.ENTER);
		

	}

}
