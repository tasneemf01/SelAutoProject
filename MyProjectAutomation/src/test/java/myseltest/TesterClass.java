package myseltest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TesterClass {
	@Test
	
public void ValidateLoginStatus() {
	
			WebDriver driver = new ChromeDriver();

			driver.get("https:/the-internet.herokuapp.com/");

			WebElement formAuthenticationlink = driver.findElement(By.xpath("//*[@id='content']/ul/li[21]/a"));
			formAuthenticationlink.click();

			WebElement usernameTxtfeild = driver.findElement(By.xpath("//*[@id='username']"));
			usernameTxtfeild.sendKeys("tomsmith");

			WebElement passwordTextfeild=driver.findElement(By.xpath("//*[@id='password']"));
			passwordTextfeild.sendKeys("SuperSecretPassword!");
			
			WebElement	Loginbutton=driver.findElement(By.xpath("//*[@id='login']/button/i"));
			Loginbutton.click()	;
		
			WebElement confirmationmessageelement=driver.findElement(By.xpath("*[@id='content']/div/h4"));
			String message= confirmationmessageelement.getText();
		
		if(message.equals("Welcome to the Secure Area. When you are done click logout below."))
		{
			System.out.println("Test Pass");}
		
			else {
				System.out.println("Test Fail");
			}
		driver.quit();
	}
		}
