package myseltest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//  Class definitions
public class SeleniumClass {

	public static void main(String[] args) {

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
	
	
	System.out.println(message.contains("You logged into a secure area!") ?  "Test Pass" : "❌ Test Fail");
		
	driver.quit ();
}
}