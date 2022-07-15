package myExercise;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  {

	
	
	@FindBy(xpath="//*[@placeholder='Email']")
	public static WebElement username;
	
	@FindBy(xpath="//*[@placeholder='Password']")
	public static WebElement password;
	
	@FindBy(id="cookie_stop")
	public static WebElement cookies;
	
	@FindBy(xpath="//*[@class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']")
	public static WebElement submit;
}	
	
	
	
	
	
	
	
	
	
	
	
	

