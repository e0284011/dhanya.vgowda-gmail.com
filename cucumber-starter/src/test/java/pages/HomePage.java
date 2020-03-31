package pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class HomePage {
	@Steps
	IMDBHomePage homePage;
	
	@Step
	public void openApplication() {
		homePage.open();
		
	}
    
	@Step
	public void enterToSearch() {
		homePage.enterToSearch();
	}
	@Step
	public void clickOnSearchResult() throws InterruptedException  {
		homePage.clickOnResult();
	}
	
	@Step
	public void clickOnSignIn() {
		homePage.clickOnSignIn();
	}
	@Step
	public void clickOnCreateNewAcc() {
		homePage.clikOnCreateNewAcc();
	}
	@Step
	public void enterYourName() {
		homePage.enterYourName();
	}
	@Step
	public void enterEmail() {
		homePage.enterEmail();
	}
	@Step
	public void enterPass() {
		homePage.enterPass();
	}
	@Step
	public void reEnterPass() throws InterruptedException {
	homePage.reEnterPass();	
	}
	@Step
	public void clickOnComplete() throws InterruptedException {
		homePage.clickOnComplete();
	}
}
