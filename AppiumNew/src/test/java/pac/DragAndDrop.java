package pac;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class DragAndDrop {
	
	@Test
	public void DragAndDrop() throws MalformedURLException, InterruptedException
	{
		 DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability("deviceName", "OnePlus 5T");
		  cap.setCapability("automationName", "Appium");
		  cap.setCapability("platformName", "Android");
		  cap.setCapability("platformVersion", "10");
		  cap.setCapability("UDID", "73db044e");
		  cap.setCapability("appPackage", "com.mobeta.android.demodslv");
		  cap.setCapability("appActivity", ".Launcher");
		
		  cap.setCapability("noReset", true);
		  URL url = new URL("http://localhost:4723/wd/hub");
		  AndroidDriver driver =  new AndroidDriver(url,cap);
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.TextView[2]").click();
		 Thread.sleep(3000);
		 WebElement src = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.ImageView");
		  WebElement dest = driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.view.ViewGroup[6]/android.widget.LinearLayout/android.widget.ImageView");
		  Thread.sleep(2000);
		  
		   TouchAction ta = new TouchAction(driver);
		   ta.longPress(src).waitAction(3000).moveTo(dest).release().perform();
		   
	}
}
