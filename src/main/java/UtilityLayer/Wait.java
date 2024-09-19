package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseApiLayer.BaseClass;



public class Wait extends BaseClass{
	
	public static void sendKeys(WebElement wb, String value)
	{
		WebDriverWait Wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		Wait.until(ExpectedConditions.visibilityOf(wb)).sendKeys(value);
	}
	
	public static void click(WebElement wb)
	{
		WebDriverWait Wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		Wait.until(ExpectedConditions.elementToBeClickable(wb)).click();
	}
	
	

}
