package pac;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class InstallApk {
	public static void main(String[] args) throws MalformedURLException {
		 DesiredCapabilities cap = new DesiredCapabilities();
		  cap.setCapability("deviceName", "OnePlus 5T");
		  cap.setCapability("automationName", "Appium");
		  cap.setCapability("platformName", "Android");
		  cap.setCapability("platformVersion", "10");
		  cap.setCapability("UDID", "73db044e");
		 // cap.setCapability("app", "D:\\Appium\\DragAndDrop.apk");
		 //cap.setCapability("app", "D:\\Appium\\ApiDemos-debug.apk");
		 cap.setCapability("app", "D:\\Appium\\com.davemorrissey.labs.subscaleview.sample.apk");
		  //cap.setCapability("noReset", true);
		  URL url = new URL("http://localhost:4723/wd/hub");
		  AndroidDriver driver =  new AndroidDriver(url,cap);
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
	}
}
