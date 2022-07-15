package myExercise;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageTest {

	@Test
	public void login() throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\My\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.phptravels.net/login");
	Thread.sleep(3000);
	
	PageFactory.initElements(driver, LoginPage.class);
	
	LoginPage.username.sendKeys("enochabishek0@gmail.com");
	LoginPage.password.sendKeys("8056234509");
	LoginPage.cookies.click();
	LoginPage.submit.click();
	
	
	
	}	}
	
	
	
	
	
	
	
	
	

