package pac;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Camera {
	@Test
	public void cam() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability("deviceName", "OnePlus 5T");
		  cap.setCapability("automationName", "Appium");
		  cap.setCapability("platformName", "Android");
		  cap.setCapability("platformVersion", "10");
		  cap.setCapability("UDID", "73db044e");
		  cap.setCapability("appPackage", "com.oneplus.camera");
		  cap.setCapability("appActivity", ".MainActivity");
		  cap.setCapability("noReset", true);
		  URL url = new URL("http://localhost:4723/wd/hub");
		  AndroidDriver driver =  new AndroidDriver(url,cap);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		  Thread.sleep(2000);
		  
		  driver.findElementByAccessibilityId("Switch camera").click();
		  
		  Thread.sleep(2000);
		  
		  driver.findElementByAccessibilityId("Capture").click();
		  
		  
		  
	}
	
}
