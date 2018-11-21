package framework;

import org.openqa.selenium.By;

public class LoginPageDarkSky3 extends BasePageDarkSky3 {

	private By pageHeader = By.xpath("//*[@id='content']/div/div/div[1]/span");
	
	public String getPageHeader() {
		
		return getTextFromElement(pageHeader);
	}
}
