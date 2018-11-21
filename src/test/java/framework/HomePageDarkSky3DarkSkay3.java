package framework;

import org.openqa.selenium.By;

public class HomePageDarkSky3DarkSkay3 extends BasePageDarkSky3 {

	private By emailTextField = By.id("email");
	private By passwordTextField = By.id("pass");
	private By loginButton = By.id("loginbutton");
	private By firstNameTextField = By.id("firstName");
	private By lastNameTextField = By.id("lastName");
	private By mobileNumberTextField = By.id("mobileNumber");
	private By newPasswordTextField = By.id("newPwd");
	private By errorMessage = By.id("errorMessage");
    private By timeLineisDesplaed= By.xpath ("//span[contains(text(),'Clear')]");



    public void clickOnLoginButton() {
		clickOn(loginButton);
	}

	public void enterEmail(String enterEmail) {
		sendText(emailTextField, enterEmail);
	}
	
	public void enterPassword(String enterPassword) {
		sendText(passwordTextField, enterPassword);
	}

	public void enterFirstName(String firstName) {
		sendText(firstNameTextField, firstName);
	}

	public void enterLastName(String lastName) {
		sendText(lastNameTextField, lastName);
	}

	public void enterMobileNumber(String mobileNum) {
		sendText(mobileNumberTextField, mobileNum);
	}

	public void enterNewPassword(String password) {
		sendText(newPasswordTextField, password);
	}

	public String getErrorMessage() {
		return getTextFromElement(errorMessage);
	}

	public static void timeLineisDisplayed(){TimeLineisDisplayed ();}

    public static void TimeLineisDisplayed() {
    }


}



