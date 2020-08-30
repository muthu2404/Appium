package pac;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Amazon {
	public static void main(String[] args) throws MalformedURLException {
		
		
		 DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability("deviceName", "OnePlus 5T");
		  cap.setCapability("automationName", "Appium");
		  cap.setCapability("platformName", "Android");
		  cap.setCapability("platformVersion", "10");
		  cap.setCapability("UDID", "73db044e");
		  cap.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		  cap.setCapability("appActivity", "com.amazon.mShop.android.home.HomeActivity");
		  URL url = new URL("http://localhost:4723/wd/hub");
		  AndroidDriver driver =  new AndroidDriver(url,cap);
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		
		
		driver.findElementById("in.amazon.mShop.android.shopping:id/sso_continue").click();
		driver.findElementById("in.amazon.mShop.android.shopping:id/rs_search_src_text").sendKeys("watch");
		
	}
}
