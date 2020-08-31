package pac;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class HandleDropDown {

	@Test
	public void handleDropdown() throws MalformedURLException, InterruptedException
	{
		 DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability("deviceName", "OnePlus 5T");
		  cap.setCapability("automationName", "Appium");
		  cap.setCapability("platformName", "Android");
		  cap.setCapability("platformVersion", "10");
		  cap.setCapability("UDID", "73db044e");
		  cap.setCapability("noReset", true);
		  cap.setCapability("appPackage", "io.appium.android.apis");
		  cap.setCapability("appActivity", "ApiDemos");
		  URL url = new URL("http://localhost:4723/wd/hub");
		  AndroidDriver driver =  new AndroidDriver(url,cap);
		  
		  driver.findElementByAccessibilityId("Views").click();
		  Thread.sleep(4000);
		  driver.findElementByAccessibilityId("Controls").click();
		  Thread.sleep(4000);

		  driver.findElementByXPath("//android.widget.TextView[@content-desc=\"2. Dark Theme\"]").click();
		  Thread.sleep(4000);

		  driver.hideKeyboard();
		  Thread.sleep(4000);

		  driver.findElementById("io.appium.android.apis:id/spinner1").click();
		  Thread.sleep(4000);
		  
		  List<WebElement> list = driver.findElementsByClassName("android.widget.CheckedTextView");
		  
		  for(WebElement wb: list)
		  {
			  String actText = wb.getText();
			  if(actText.equalsIgnoreCase("Saturn"))
			  {
				  wb.click();
				  break;
			  }
		  }
		  
		  
	}
}
