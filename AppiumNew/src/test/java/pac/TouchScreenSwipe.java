package pac;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TouchScreenSwipe {

	public static void main(String[] args) throws MalformedURLException {
		 DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability("deviceName", "OnePlus 5T");
		  cap.setCapability("automationName", "Appium");
		  cap.setCapability("platformName", "Android");
		  cap.setCapability("platformVersion", "10");
		  cap.setCapability("UDID", "73db044e");
		  cap.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
		  cap.setCapability("appActivity", ".TouchScreenTestActivity");
		  URL url = new URL("http://localhost:4723/wd/hub");
		  AndroidDriver driver =  new AndroidDriver(url,cap);
		  
		  Dimension size = driver.manage().window().getSize();
		  int width = size.getWidth();
		  int height = size.getHeight();
		  
		  
		 // driver.swipe((size.getWidth()*0.2), size.getHeight()*0.4, size.getWidth()*0.8,size.getHeight()*0.9 ,500);
		  
	}
	
}
