package Bank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
 
	public static void main(String[] args) throws Exception {
		test();
	}
	
public static void test() throws Exception {
	System.setProperty("webdriver.chrome.driver", "D:\\Venkat\\Softwares\\Selenium_Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String baseurl = "http://www.tinyupload.com/";
	driver.get(baseurl);
	driver.findElement(By.name("uploaded_file")).click();
	Thread.sleep(6000);
	Runtime.getRuntime().exec("D:\\Venkat\\Software_Testing\\AutoIT\\Fileupload.exe");
	Thread.sleep(6000);
	driver.findElement(By.name("file_description")).sendKeys("Test entry");
	Thread.sleep(6000);
	driver.findElement(By.xpath("//img[@alt='Upload']")).click();
	driver.quit();
	System.out.println("Test passed");
	
}
}

