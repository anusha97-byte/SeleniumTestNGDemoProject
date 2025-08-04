package demoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends Base
{
	@Test
	public void loginBothCorrect()
	{
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		String user="admin";
		username.sendKeys(user);
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		String pass="admin";
		password.sendKeys(pass);
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
	}
	@Test
	public void loginBothInCorrect()
	{
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		String user="adm";
		username.sendKeys(user);
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		String pass="123";
		password.sendKeys(pass);
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
	}
	@Test
	public void loginUsernameCorrectPasswordIncorrect()
	{
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		String user="admin";
		username.sendKeys(user);
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		String pass="123";
		password.sendKeys(pass);
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
	}
	@Test
	public void loginUsernameIncorrectPasswordCorrect()
	{
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		String user="1234";
		username.sendKeys(user);
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		String pass="admin";
		password.sendKeys(pass);
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
	}
}
