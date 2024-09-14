package com.pncbank.qa.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class EnrollmentPage extends BasePage {

	// Locators :
	private By selectSSNRadioBtn = By.xpath("//input[@id='test-wod-radio-button-0-input']");
	private By ssnInputField = By.cssSelector("#test-required-id");
	private By pncOnlineVoiceBankingUserIdRadioBtn = By.cssSelector("#test-wod-radio-button-3-input");
	private By acntInfoPanNumField = By.cssSelector("input[id='test-required-accountnumber-password-id']");
	private By pncDebPinRadioBtn = By.cssSelector("#test-multiple-label-radio-button2-0-input");
	private By onlineAccessPinRadioBtn = By.cssSelector("#test-multiple-label-radio-button2-1-input");

	private By pncAcctNumOrPanNum = By.cssSelector("input[id='test-required-accountnumber-password-id']");
	private By debitCardPinField = By.cssSelector("#test-required-debit-card-pin-password-id");
	private By onlineAccessPin = By.cssSelector("#test-required-online-access-pin-password-id");

	private By nextBtn = By.cssSelector("#next-button-id");
	private By warningMsg = By.cssSelector("div[class='wbb-notification-body-wrapper']");
	private By pncOnlineBanking = By.xpath("//h1[text()='Enroll in PNC Online and Mobile Banking']");

	public EnrollmentPage(WebDriver driver) {
		super(driver);

	}

	public void checkSSNChkBox() {

		selectRadioButton(selectSSNRadioBtn);

	}

	public void checkpncOnlineVoiceBankingUserIdRadioBtn() {

		selectRadioButton(pncOnlineVoiceBankingUserIdRadioBtn);

	}

	public void checkpncDebPinRadioBtn() {

		selectRadioButton(pncDebPinRadioBtn);

	}

	public void checkOnlineAccessPinRadioBtn() {

		selectRadioButton(onlineAccessPinRadioBtn);

	}

	public void inputDataSSNField(String ssn) {

		enterText(ssnInputField, ssn);

	}

	public void inputDataPanNum(String panNum) {

		enterText(acntInfoPanNumField, panNum);

	}

	public void inputPncAccntNumOrPanNumber(String panNumOrPan) {

		enterText(pncAcctNumOrPanNum, panNumOrPan);

	}

	public void inputOnlineAccessPin(String panNumOrPan) {

		enterText(onlineAccessPin, panNumOrPan);

	}

	public String getTitleForEnrollement() {
		return fetchTitle(pncOnlineBanking);

	}

	public void clicknextBtn() {
		click(nextBtn);
	}

	public String getWarningMsg() {

		return getText(warningMsg);

	}

}
