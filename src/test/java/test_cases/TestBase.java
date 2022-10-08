package test_cases;

import org.example.capabilities.Capabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.example.pages.PageBase;

import java.io.IOException;

public class TestBase extends Capabilities{

	// declare class properties
	static AndroidDriver<AndroidElement> driver;


	@BeforeTest
	public static void prepare() throws IOException {
		// TODO start application with appium
		driver = baseCapabilities("AppName");
		PageBase.captureScreenshot(driver, "loginPage");// take screenshot for app when start
	}

	@AfterClass
	public static void TearDown() {
		driver.quit();
	}

	// Assertion to object exists after specific action with getText() method
	public static void assertToObjectExistWithGetText(WebElement element, String expected) {
		Assert.assertEquals(element.getText().toString(), expected);
	}

	// Assertion to object exists after specific action with getAttribute() method
	public static void assertToObjectExistWithGetAttribute(WebElement element, String attributeName, String expected) {
		Assert.assertEquals(element.getAttribute(attributeName).toString(), expected);
	}
}
