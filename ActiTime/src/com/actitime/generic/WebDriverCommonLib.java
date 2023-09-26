package com.actitime.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * This is generic class for web driver element
 * @author Kiran 
 */
public class WebDriverCommonLib {
	/**
	 * This is generic method for implicit wait
	 * @param driver
	 * @param i
	 */
	public void waitForPageLoad(WebDriver driver,int i) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(i));
	}

	/**
	 * This is generic method for explicit wait
	 * @param driver
	 * @param i
	 * @param element
	 */
	public void waitForElement(WebDriver driver,int i,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(i));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This is generic method for custom wait
	 * @param element
	 */
	public void customWaitForElement(WebElement element) {
		int i = 100;
		while(i<=100) {
			try {
				element.isDisplayed();
				break;
			}catch(Exception e) {
				i++;
			}
		}
	}
	/**
	 * This is generic method for selecting the option from listbox using index
	 * @param element
	 * @param i
	 */
	public void selectOption(WebElement element,int i) {
		Select s = new Select(element);
		s.selectByIndex(i);
	}

	/**
	 * This is generic method for selecting the option from listbox using visible text
	 * @param element
	 * @param text
	 */
	public void selectOption(WebElement element,String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	/**
	 * This is generic method for right click or context click
	 * @param driver
	 * @param element
	 */
	public void rightClick(WebDriver driver,WebElement target) {
		Actions a = new Actions(driver);
		a.contextClick(target).perform();
	}

	/**
	 * This is generic method for right click or context click
	 * @param driver
	 */
	public void rightClick(WebDriver driver) {
		Actions a = new Actions(driver);
		a.contextClick().perform();
	}
    
	/**
      * This is generic method for mouse hover
      * @param driver
      * @param target
      */
	public void mouseHover(WebDriver driver,WebElement target) {
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();
	}
}
