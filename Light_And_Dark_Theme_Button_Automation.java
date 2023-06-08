package basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
public class Light_And_Dark_Theme_Button_Automation {
	 static int y=0;
		public static void main(String[] args) throws InterruptedException, MalformedURLException {
		    DesiredCapabilities dc= new DesiredCapabilities();
	        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME , "Appium");
	        dc.setCapability(MobileCapabilityType.PLATFORM_NAME , "Android");
	        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION , "12");
	        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "ceaae327");// This value is device specific open CMD and type adb.exe devices 
	        dc.setCapability("udid","ceaae327");
	        dc.setCapability("appPackage" , "io.beldex.belnet");//appPackage can be found using APKInfo application
	        dc.setCapability("appActivity" , "io.beldex.belnet.MainActivity");//appActivity can be found using APKInfo application
		     URL d =new URL("http://localhost:4723/wd/hub");
		    AndroidDriver driver =new AndroidDriver(d,dc);
		    Thread.sleep(3000);
			for(int i=0;i<=10;i++) {
			WebElement seven10=driver.findElement(By.xpath("//android.widget.ImageView[@index='2']")); // Click on Light Theme button
		    seven10.click();
		    WebElement seven311=driver.findElement(By.xpath("//android.widget.ImageView[@index='2']")); // Click on Dark Theme button
		    seven311.click();
		    }
	}}

