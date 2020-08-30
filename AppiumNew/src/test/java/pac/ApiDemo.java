package pac;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class ApiDemo {
	@Test
	public void ApiDemo() throws MalformedURLException, InterruptedException
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
		  
		/*  System.out.println(driver.getOrientation());
		  driver.rotate(ScreenOrientation.LANDSCAPE);
		  System.out.println(driver.getOrientation());
		  driver.rotate(ScreenOrientation.PORTRAIT);*/
		  
		  WebElement views = driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]");
		  driver.tap(1, views, 500);
		  Thread.sleep(2000);
		  scrollToElement(driver, "text", "Lists");
		   driver.findElementByAccessibilityId("Lists").click();
		  
		/*  WebElement buttons = driver.findElementByAccessibilityId("Buttons");
		  driver.tap(1,buttons, 500); 
		  WebElement toggle = driver.findElementByAccessibilityId("Toggle");
		   System.out.println(toggle.getText());
		   Thread.sleep(2000);
		    driver.tap(1, toggle, 500);
*/		   
	}
	
	  public static void scrollToElement(AndroidDriver driver, String key, String value) {
		  try {
		   Thread.sleep(3000);
		   driver.findElementByAndroidUIAutomator(
		     "new UiScrollable(new UiSelector()).scrollIntoView(" + key + "(\"" + value + "\"))");
		  } catch (InterruptedException ie) {

		  }
		 }
	
}
