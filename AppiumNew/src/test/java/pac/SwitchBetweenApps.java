package pac;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class SwitchBetweenApps {

	String AppPackage1 = "com.oneplus.calculator";
	String AppActivity1 = ".Calculator";
	String AppPackage2 = "com.myntra.android";
	String AppActivity2 = ".SplashActivity";
	@Test
	public void switchApps() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability("deviceName", "OnePlus 5T");
		  cap.setCapability("automationName", "Appium");
		  cap.setCapability("platformName", "Android");
		  cap.setCapability("platformVersion", "10");
		  cap.setCapability("UDID", "73db044e");
		  cap.setCapability("noReset", true);
		  cap.setCapability("appPackage", AppPackage2);
		  cap.setCapability("appActivity", AppActivity2);
		  URL url = new URL("http://localhost:4723/wd/hub");
		  AndroidDriver driver =  new AndroidDriver(url,cap);
		  Thread.sleep(5000);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  driver.startActivity(AppPackage1, AppActivity1);
		  
		  Thread.sleep(5000);
		  
		  driver.launchApp();
	}
	
	
}
