package pac;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;



public class OpenCalculator {
	public static void main(String[] args) throws Throwable
	 {
	  DesiredCapabilities cap = new DesiredCapabilities();
	  cap.setCapability("deviceName", "OnePlus 5T");
	  cap.setCapability("automationName", "Appium");
	  cap.setCapability("platformName", "Android");
	  cap.setCapability("platformVersion", "10");
	  cap.setCapability("UDID", "73db044e");
	  cap.setCapability("appPackage", "com.oneplus.calculator");
	  cap.setCapability("appActivity", ".Calculator");
	  URL url = new URL("http://localhost:4723/wd/hub");
	  AndroidDriver driver =  new AndroidDriver(url,cap);
	  
	 /* driver.findElementById("com.oneplus.calculator:id/digit_4").click();
	  driver.findElementByAccessibilityId("plus").click();
	  driver.findElementById("com.oneplus.calculator:id/digit_5").click();
	  driver.findElementById("com.oneplus.calculator:id/eq").click();
	  */
	  driver.findElementById("com.oneplus.calculator:id/digit_5").click();
	  driver.findElementById("com.oneplus.calculator:id/op_sub").click();
	  driver.findElementById("com.oneplus.calculator:id/digit_4").click(); 
	  driver.findElementById("com.oneplus.calculator:id/eq").click();
	  
	  driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
	  
	  driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
	  
	  
	 }
}
