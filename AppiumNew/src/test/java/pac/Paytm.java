package pac;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Paytm {

	@Test
	public void paytm() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability("deviceName", "OnePlus 5T");
		  cap.setCapability("automationName", "Appium");
		  cap.setCapability("platformName", "Android");
		  cap.setCapability("platformVersion", "10");
		  cap.setCapability("UDID", "73db044e");
		  cap.setCapability("noReset", true);
		  cap.setCapability("appPackage", "net.one97.paytm");
		  cap.setCapability("appActivity", ".AJRJarvisSplash");
		  URL url = new URL("http://localhost:4723/wd/hub");
		  AndroidDriver driver =  new AndroidDriver(url,cap);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  driver.findElementById("android:id/button2").click();
		  String beforeclick = driver.findElementById("net.one97.paytm:id/radio_postpaid").getAttribute("checked");
		  System.out.println(beforeclick);
		  driver.findElementById("net.one97.paytm:id/radio_postpaid").click();
		  String Afterclick = driver.findElementById("net.one97.paytm:id/radio_postpaid").getAttribute("checked");
		  System.out.println(Afterclick);
		  driver.findElementById("net.one97.paytm:id/radio_fast_forward").click();
		  
	}
}
