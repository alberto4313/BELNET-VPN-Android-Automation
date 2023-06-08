package basics;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
public class AddExiteNode {
static int y;
public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc= new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME , "Appium");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME , "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION , "12");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "ceaae327");
        dc.setCapability("udid","ceaae327");
        dc.setCapability("appPackage" , "io.beldex.belnet");
        dc.setCapability("appActivity" , "io.beldex.belnet.MainActivity");
	    URL d =new URL("http://localhost:4723/wd/hub");
	    AndroidDriver driver =new AndroidDriver(d,dc);
		Thread.sleep(5000);
		for(int i=0;i<=20;i++) {
	    Thread.sleep(5000);
		WebElement seven10=driver.findElement(By.xpath("//android.view.View[@index='4']")); // Click on start button
	    seven10.click();
	    WebElement seven101=driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Add Exit Node']")); // Click on start button
	    seven101.click();
	    Thread.sleep(2000);
	    WebElement seven1010=driver.findElement(By.className("android.widget.EditText")); // Click on start button
	    seven1010.click();
	    seven1010.sendKeys("cf4dijjhw7nf94qrjbtwgub7yb4o6xu4ecyc1jsaaf84mqpnyhwy.bdx");
	    WebElement seven11010=driver.findElement(By.xpath("//android.view.View[@content-desc='OK']")); // Click on start button
	    seven11010.click();
	    System.out.println("   "+"Test Run"+" "+y+" "+"Times  ");
	    Thread.sleep(2000);
	    WebElement seven2101=driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Add Exit Node']")); // Click on start button
	    seven2101.click();
	    Thread.sleep(2000);
	    WebElement seven12010=driver.findElement(By.className("android.widget.EditText")); // Click on start button
	    seven12010.click();
	    seven12010.sendKeys("kzqbkoxtsj7mkge86nsdobkt4nfqu1o6po38wpm6a66f738iin7o.bdx");
	    WebElement seven112010=driver.findElement(By.xpath("//android.view.View[@content-desc='OK']")); // Click on start button
	    seven112010.click();
	    System.out.println("   "+"Test Run"+" "+y+" "+"Times  ");
	    Thread.sleep(12000);
	    Thread.sleep(10000);
	    WebElement seven21301=driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Add Exit Node']")); // Click on start button
	    seven21301.click();
	    Thread.sleep(2000);
	    WebElement seven120310=driver.findElement(By.className("android.widget.EditText")); // Click on start button
	    seven120310.click();
	    seven120310.sendKeys("axyc58bjjdz8idbk7ztumxxd14aidqh3dno1rptwwc3psbmq6wpy.bdx");
	    WebElement seven1120310=driver.findElement(By.xpath("//android.view.View[@content-desc='OK']")); // Click on start button
	    seven1120310.click();
	    System.out.println("   "+"Test Run"+" "+y+" "+"Times  ");
	    Thread.sleep(12000);
	    for(int j=0;j<=10;j++) {
	    	Thread.sleep(12000);
	    	WebElement seven212301=driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Add Exit Node']")); // Click on start button
		    seven212301.click();
		    Thread.sleep(2000);
		    WebElement seven1020310=driver.findElement(By.className("android.widget.EditText")); // Click on start button
		    seven1020310.click();
		    seven1020310.sendKeys("axyc58bjjdz8idbk7ztumxxd14aidqh3dno1rptwwc3psbmq6wpy.bdx");
		    WebElement seven11203010=driver.findElement(By.xpath("//android.view.View[@content-desc='OK']")); // Click on start button
		    seven11203010.click();
		    Thread.sleep(12000);
	    }
	    Thread.sleep(81000);
	    WebElement seven3131=driver.findElement(By.xpath("//android.widget.ImageView[@index='5']")); // Click on start button
	    seven3131.click();
	    Thread.sleep(7000);
	    y++;
	    System.out.println("   "+"Test Run"+" "+y+" "+"Times  ");
		
		
		//WebElement  seven31120 = driver.findElement(By.xpath("//android.view.View[@index='1']"));
		//seven31120.click();
		//Thread.sleep(5000);

		//WebElement seven311001=driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='snoq7arak4d5mkpfsg69saj7bp1ikxyzqjkhzb96keywn6iyhc5y.bdxFrance']")); // Click on start button
		//seven311001.click();
		//WebElement seven311101=driver.findElement(By.xpath("//android.widget.ImageView[@index='9']")); // Click on start button
		//seven311101.click();    
		//Thread.sleep(5000);
	    //WebElement seven3201=driver.findElement(By.xpath("//android.widget.EditText[@index='1']")); // Click on start button
		//seven3201.click();
	    //seven3201.sendKeys("jh631jgtxot7p9dkucwezjabh9g9ort1yrbikcwpxyf7wcfcw5wo.bdx");		     
		//Thread.sleep(5000);
		//WebElement seven3211=driver.findElement(By.xpath("//android.view.View[@index='3']")); // Click on start button
	    //seven3211.click();		     
		//Thread.sleep(21000);
         //y++;
		 //System.out.println("           "+y+"Times");
	     //for(int j=0;j<=6;j++) {
	    	 // Thread.sleep(5000);
	    	 //WebElement seven3181=driver.findElement(By.xpath("//android.widget.ImageView[@index='5']")); // Click on start button
	 	    //seven3181.click();
	 	    //Thread.sleep(5000);
	     //WebElement seven31021=driver.findElement(By.xpath("//android.widget.ImageView[@index='9']")); // Click on start button
		 //seven31021.click();     
	     //Thread.sleep(1000);
		 //WebElement seven32031=driver.findElement(By.xpath("//android.widget.EditText[@index='1']")); // Click on start button
		// seven32031.click();
		 //seven32031.sendKeys("jh631jgtxot7p9dkucwezjabh9g9ort1yrbikcwpxyf7wcfcw5wo.bdx");
		 //Thread.sleep(1000);
		 //WebElement seven32311=driver.findElement(By.xpath("//android.view.View[@index='3']")); // Click on start button
		// seven32311.click();
		 //Thread.sleep(10000);
		 
	    // y++;
	     //System.out.println("           "+y+"Times");
	     //Thread.sleep(20000);
		}
		}}
		  
		     
		     
		     
			 
		 
		 
			 
		 
	


