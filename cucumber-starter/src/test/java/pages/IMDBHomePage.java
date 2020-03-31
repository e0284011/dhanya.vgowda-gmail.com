package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;

public class IMDBHomePage extends PageObject {
	
	WebDriver driver;
	
	
	public void enterToSearch() {
		$(By.id("suggestion-search")).type("Game of Thrones The last watch");
		}
	
	
	public void clickOnResult() throws InterruptedException {
		$(By.xpath("//*[@id=\"react-autowhatever-1--item-0\"]/a/div[2]/div[2]")).click();
		Thread.sleep(2000);
	}
	
	public void clickOnSignIn() {
		$(By.partialLinkText("Sign In")).click();
	}
	 
	public void clikOnCreateNewAcc() {
		$(By.partialLinkText("Create a New Account")).click();
	}
	
	public void enterYourName() {
		$(By.id("ap_customer_name")).type("Dhanya");
	}
	
	public void enterEmail() {
		$(By.id("ap_email")).type("dhanya.vgowda@gmail.com");
	}
	
	public void enterPass() {
		
		$(By.name("password")).type("QaTest123");
		//$(By.xpath("//*[@id=\"ap_password_check\']")).sendKeys("");
	}
	
	public void reEnterPass() throws InterruptedException {
		$(By.name("passwordCheck")).type("QaTest123");
		Thread.sleep(2000);
		
	}
	public void clickOnComplete() throws InterruptedException {
		$(By.id("continue")).click();
		Thread.sleep(2000);
		driver.get("https://www.imdb.com");
	}

}
