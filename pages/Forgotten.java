package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Forgotten {

	WebDriver driver;
	By forgot =By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/a[1]");
	By text=By.id("identify_email");
	By button=By.name("did_submit");
	public Forgotten(WebDriver driver)
	{
		this.driver=driver;	
		}
	
public void click()
{
	driver.findElement(forgot).click();
}
public void valuepass(String mob)
{
	driver.findElement(text).sendKeys("95399156963");
	
}
public void buttonclick()
{
	driver.findElement(button).click();
}
}
