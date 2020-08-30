package pac;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class ZoomIn {
	@Test
	public void zoomIn() throws MalformedURLException, InterruptedException
	{
		  DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability("deviceName", "OnePlus 5T");
		  cap.setCapability("automationName", "Appium");
		  cap.setCapability("platformName", "Android");
		  cap.setCapability("platformVersion", "10");
		  cap.setCapability("UDID", "73db044e");
		  cap.setCapability("appPackage", "com.davemorrissey.labs.subscaleview.sample");
		  cap.setCapability("appActivity", ".MainActivity");
		  cap.setCapability("noReset", true);
		  URL url = new URL("http://localhost:4723/wd/hub");
		  AndroidDriver driver =  new AndroidDriver(url,cap);
		  
		  driver.findElementById("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures").click();
		  int x = driver.manage().window().getSize().getWidth()/2;
		  int y = driver.manage().window().getSize().getHeight()/2;
		  
		  driver.zoom(x, y);
		  Thread.sleep(5000);
		  driver.pinch(x, y);

	}
	
}
