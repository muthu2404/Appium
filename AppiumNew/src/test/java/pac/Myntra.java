package pac;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Myntra {
	public static void main(String[] args) throws Throwable
	 {
	  DesiredCapabilities cap = new DesiredCapabilities();
	  cap.setCapability("deviceName", "OnePlus 5T");
	  cap.setCapability("automationName", "Appium");
	  cap.setCapability("platformName", "Android");
	  cap.setCapability("platformVersion", "10");
	  cap.setCapability("UDID", "73db044e");
	  cap.setCapability("appPackage", "com.myntra.android");
	  cap.setCapability("appActivity", ".SplashActivity");
	  URL url = new URL("http://localhost:4723/wd/hub");
	  AndroidDriver driver =  new AndroidDriver(url,cap);
	  
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  driver.findElementByAccessibilityId("search").click();
	  driver.findElementByXPath("//android.widget.EditText[@content-desc=\"search_default_search_text_input\"]").sendKeys("watch");
	  
	  
}
}