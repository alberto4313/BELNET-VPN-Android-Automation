package basics;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
public class TestInvalidExitNode {
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
		for(int i=0;i<=10;i++) {
	    Thread.sleep(5000);
		WebElement seven10=driver.findElement(By.xpath("//android.view.View[@index='4']")); 
	    seven10.click();
	    Thread.sleep(21000);
	    WebElement seven3131=driver.findElement(By.xpath("//android.widget.ImageView[@index='5']")); 
	    seven3131.click();
	    Thread.sleep(2000);
	    WebElement seven101=driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Add Exit Node']")); 
	    seven101.click();
	    Thread.sleep(2000);
	    WebElement seven1010=driver.findElement(By.className("android.widget.EditText")); 
	    seven1010.click();
	    seven1010.sendKeys("cf4dijjhw7nf94qrjbtwgub7yb4o6xu4ecyc1jsaaf84mqpnyhwy.bdx");
	    WebElement seven11010=driver.findElement(By.xpath("//android.view.View[@content-desc='OK']"));
	    seven11010.click();
	    y++;
	    System.out.println("   "+"Test Run"+" "+y+" "+"Times  ");
	    Thread.sleep(21000);
	    WebElement seven2101=driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Add Exit Node']"));
	    seven2101.click();
	    Thread.sleep(2000);
	    WebElement seven12010=driver.findElement(By.className("android.widget.EditText"));
	    seven12010.click();
	    seven12010.sendKeys("eskk7ejpfhk11onsai1k4x739u6c7kz1yc1pq5aj5spjdszigany.bdx");
	    WebElement seven112010=driver.findElement(By.xpath("//android.view.View[@content-desc='OK']"));
	    seven112010.click();
	    y++;
	    System.out.println("   "+"Test Run"+" "+y+" "+"Times  ");
	    Thread.sleep(21000);
	    WebElement seven21301=driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Add Exit Node']")); 
	    seven21301.click();
	    Thread.sleep(2000);
	    WebElement seven120310=driver.findElement(By.className("android.widget.EditText")); 
	    seven120310.click();
	    seven120310.sendKeys("aihi9ydibijfzswkhxtnjg56bibxhxq3byjkk14dq7jsg6jz7h8y.bdx");
	    WebElement seven1120310=driver.findElement(By.xpath("//android.view.View[@content-desc='OK']")); 
	    seven1120310.click();
	    y++;
	    System.out.println("   "+"Test Run"+" "+y+" "+"Times  ");
	    Thread.sleep(21000);
	    WebElement seven1301=driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Add Exit Node']")); 
	    seven1301.click();
	    Thread.sleep(2000);
	    WebElement seven31010=driver.findElement(By.className("android.widget.EditText")); 
	    seven31010.click();
	    seven31010.sendKeys("15zon57jwncxhcb9afuqhydpk8cojdz5cikadedd5y37kaufcaoo.bdx");
	    WebElement seven110103=driver.findElement(By.xpath("//android.view.View[@content-desc='OK']")); 
	    seven110103.click();
	    y++;
	    System.out.println("   "+"Test Run"+" "+y+" "+"Times  ");
	    Thread.sleep(21000);
	    WebElement seven21031=driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Add Exit Node']")); 
	    seven21031.click();
	    Thread.sleep(2000);
	    WebElement seven1201330=driver.findElement(By.className("android.widget.EditText")); 
	    seven1201330.click();
	    seven1201330.sendKeys("b7kdac7zx951zkbycpxedjmsb1ebt716zkhpfeqzq7ci1kq54f9o.bdx");
	    WebElement seven11122010=driver.findElement(By.xpath("//android.view.View[@content-desc='OK']")); 
	    seven11122010.click();
	    y++;
	    System.out.println("   "+"Test Run"+" "+y+" "+"Times  ");
	    Thread.sleep(21000);
	    WebElement seven213201=driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Add Exit Node']")); 
	    seven213201.click();
	    Thread.sleep(2000);
	    WebElement seven1203210=driver.findElement(By.className("android.widget.EditText")); 
	    seven1203210.click();
	    seven1203210.sendKeys("axyc58bjjdz8idbk7ztumxxd14aidqh3dno1rptwwc3psbmq6wpy.bdx");
	    WebElement seven21120310=driver.findElement(By.xpath("//android.view.View[@content-desc='OK']")); 
	    seven21120310.click();
	    y++;
	    System.out.println("   "+"Test Run"+" "+y+" "+"Times  ");
	    Thread.sleep(21000);
	    WebElement seven2132071=driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Add Exit Node']")); 
	    seven2132071.click();
	    Thread.sleep(2000);
	    WebElement seven12032710=driver.findElement(By.className("android.widget.EditText")); 
	    seven12032710.click();
	    seven12032710.sendKeys("kzqbkoxtsj7mkge86nsdobkt4nfqu1o6po38wpm6a66f738iin7o.bdx");
	    WebElement seven211207310=driver.findElement(By.xpath("//android.view.View[@content-desc='OK']")); 
	    seven211207310.click();
	    y++;
	    System.out.println("   "+"Test Run"+" "+y+" "+"Times  ");
	    Thread.sleep(21000);
	    
	
		
		
	
		}}}		  
		     
		     
		     
			 
		 
		 
			 
		 
	


