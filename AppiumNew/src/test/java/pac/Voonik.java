package pac;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Voonik {
	@Test
	public void voonik() throws MalformedURLException, InterruptedException
	{	/*Setting the Desired capabilities*/
		DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability("deviceName", "OnePlus 5T");
		  cap.setCapability("automationName", "Appium");
		  cap.setCapability("platformName", "Android");
		  cap.setCapability("platformVersion", "10");
		  cap.setCapability("UDID", "73db044e");
		  cap.setCapability("noReset", true);
		  cap.setCapability("appPackage", "com.mrvoonik.android");
		  cap.setCapability("appActivity", ".splashsection.Splash");
		  URL url = new URL("http://localhost:4723/wd/hub");
		  /*launching the app in mobile*/
		  AndroidDriver driver =  new AndroidDriver(url,cap); 
		  Thread.sleep(2000);
		  /*open categories*/
		  driver.findElementByAccessibilityId("Drawer Open").click();
		  Thread.sleep(2000);
		  /*tap on t shirts*/
		  driver.findElementByXPath("//android.widget.TextView[@text='T-shirts']").click();
		  Thread.sleep(2000);
		  /*Select the t shirt*/
		  driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"image\"])[1]").click();
		  Thread.sleep(2000);
		  /*Select the size*/
		  driver.findElementByXPath("//android.widget.TextView[@text='Size : M']").click();
		  Thread.sleep(2000);
		  /*tap on  add to cart*/
		  driver.findElementByXPath("//android.widget.TextView[@resource-id='com.mrvoonik.android:id/addtocart']").click();
		  Thread.sleep(2000);
		  /*Open cart*/
		 driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"image\"])[1]").click();
	}
}
