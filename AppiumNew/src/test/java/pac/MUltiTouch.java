package pac;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.internal.MultiAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class MUltiTouch {
	@Test
	public void multitouch() throws MalformedURLException, InterruptedException
	{	/*Setting the Desired capabilities*/
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
		  /*launching the app in mobile*/
		  AndroidDriver driver =  new AndroidDriver(url,cap);
		  /*getting dimensions*/
		  driver.findElementById("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures").click();
		  int x = driver.manage().window().getSize().getWidth()/2;
		  int y = driver.manage().window().getSize().getHeight()/2;
		  /*performing zoomin*/
		  TouchAction finger1 = new TouchAction(driver);
		  finger1.press(x, y-20).moveTo(x,y-100);
		  TouchAction finger2 = new TouchAction(driver);
		  finger2.press(x, y+20).moveTo(x,y+100);
		  Thread.sleep(2000);
		  MultiTouchAction zoomin = new MultiTouchAction(driver);
		  zoomin.add(finger1).add(finger2).perform();
		  Thread.sleep(2000);
			/*performing zoomin*/
		  TouchAction finger3 = new TouchAction(driver);
		  finger3.press(x, y-150).moveTo(x,y-20);	
		  Thread.sleep(2000);
		  TouchAction finger4 = new TouchAction(driver);
		  finger4.press(x, y+150).moveTo(x,y+20);
		  Thread.sleep(2000);
		  MultiTouchAction zoomout = new MultiTouchAction(driver);
		  zoomout.add(finger3).add(finger4).perform();
			
	}
}
