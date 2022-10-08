package org.example.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P01_LoginPage {

	public P01_LoginPage(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// xpath to number from 0 : 9
	@AndroidFindBy(xpath = "//android.widget.Button[@index='18']")
	public WebElement number0;

}
