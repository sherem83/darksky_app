package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

import stepdefinition.SharedSDDarkSky3;

import java.awt.*;

/**
 * Created by Irina on 11/20/19.
 */
public class BasePageDarkSky3 {

	public void clickOn(By locator) {
		try {
			SharedSDDarkSky3.getDriver().findElement(locator).click();
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}
	}

	public void sendText(By locator, String text) {
		try {
			SharedSDDarkSky3.getDriver().findElement(locator).sendKeys(text);
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}
	}

	public String getTextFromElement(By locator) {
		String text = null;
		try {
			text = SharedSDDarkSky3.getDriver().findElement(locator).getText();
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}

		return text;
	}

	public void clickOnBrowserBackArrow() {
		SharedSDDarkSky3.getDriver().navigate().back();
	}

	public void clickOnBrowserForwardArrow() {
		SharedSDDarkSky3.getDriver().navigate().forward();
	}

	public void refreshBrowser() {
		SharedSDDarkSky3.getDriver().navigate().refresh();
	}


}
