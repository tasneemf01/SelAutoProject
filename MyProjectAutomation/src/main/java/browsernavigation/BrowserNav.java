package browsernavigation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserNav {

	@Test
	public void TestNavigation() {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://the-internet.herokuapp.com/");
		
	WebElement formAuthenticationLink=driver.findElement(By.xpath("//*[@id='content']/ul/li[21]/a"));
	formAuthenticationLink.click() ;	
	
	driver.navigate(). back();
	WebElement pageheading1= driver.findElement(By.xpath("//*[@id='content']/h1"));
	String heading=pageheading1.getText();	
	Assert.assertEquals(heading, "Welcome to the-internet");
	
	driver.navigate(). refresh();
	WebElement pageheading2=driver.findElement(By.xpath("//*[@id='content']/h1"));
	String heading2= pageheading2.getText();
	Assert.assertEquals(heading2, "Welcome to the-internet");
	
	driver.navigate(). forward();
	WebElement pageheading=driver.findElement(By.xpath("//*[@id='content']/div/h2"));
	String Loginpageheading=pageheading.getText();
	Assert.assertEquals(Loginpageheading, "Login Page");
	
	
	//Remove CheckboxA Code Starts-Assignment
	driver.navigate(). back(); // now i am on the home page 

	WebElement dynamicControlLink=driver.findElement(By.xpath("//*[@id='content']/ul/li[13]/a"));
	dynamicControlLink.click() ;	
	
	WebElement checkBoxA=driver.findElement(By.xpath("//*[@id=\'checkbox\']"));
	checkBoxA.click(); //click check box
	
	WebElement removeButton=driver.findElement(By.xpath("//*[@id=\'checkbox-example\']/button"));
	removeButton.click(); // click remove button
	
	WebElement messageElement=driver.findElement(By.xpath("//*[@id='message']"));
	String message=messageElement.getText();
	Assert.assertEquals(message, "It's gone!");
	
	driver.navigate(). refresh();
	

	WebElement enableButton=driver.findElement(By.xpath("//*[@id='input-example']/button"));
	enableButton.click();
	
	
	
	WebElement messageElement3=driver.findElement(By.xpath("//*[@id='message']"));
	String message3=messageElement3.getText();
	Assert.assertEquals(message3, "It's enabled!");
	

	
	WebElement messageElement2=driver.findElement(By.xpath("//*[@id='loading']"));
	String message2=messageElement2.getText();
	Assert.assertEquals(message2, "Wait for it... ");
	
	
	
	if(message3 =="It's enabled!" && message2 == "Wait for it...") {
		System.out.println("Test Case Failed.");
	}
	
	driver.quit();

	}

}
