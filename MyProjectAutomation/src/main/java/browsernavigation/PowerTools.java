package browsernavigation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PowerTools {

	@Test
	public void getPowerTools() {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://with-bugs.practicesoftwaretesting.com/#/");

		driver.findElement(By.xpath("//li[@class='nav-item dropdown']")).click();

		driver.findElement(By.xpath("//a[@href='#/category/power-tools']")).click();

		driver.manage().window().maximize();

		WebElement sortList = driver.findElement(By.className("form-select"));
		System.out.println(sortList);

		Select s = new Select(sortList);
		String text = "Price (Low - High)";
		s.selectByVisibleText(text);

		String tooltext = driver.findElement(By.xpath("//a[@data-test='product-20']/div[2]/h5")).getText();
		System.out.println(tooltext);
		Assert.assertEquals(tooltext, "Belt Sander");
		driver.quit();
	}

}

//Plier	
// div/a[2]
// div[@class='container']/a[2]
// div[@class='col-md-9']/div/a[2]
// a[@data-test='product-2']
// a[@href='#/product/2']

//Thor Hammer
// div/a[9]
// div[@class='container']/a[9]
// div[@class='col-md-9']/div/a[9]
// a[@data-test='product-9'] 
// a[@href='#/product/9']

// Absolute xpath for UnsplashElement
/*
 * /html/body/app-root/app-footer/div/p/a[4]
 */
