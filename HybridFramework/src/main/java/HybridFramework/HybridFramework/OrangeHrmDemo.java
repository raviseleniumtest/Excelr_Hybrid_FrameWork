package HybridFramework.HybridFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmDemo {
	
public static void main(String[] args) throws Exception  {
	ChromeDriver driver;
	
	System.setProperty("webdriver.chrome.driver","D://selenium files//chromedriver.exe");
	 driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	
	 FileInputStream fis = new 	 FileInputStream("D:\\softwarechanna\\HybridFramework\\datfiles\\com.properties");
	 
	 Properties p = new Properties();
	 p.load(fis);
	 
	String url_data = p.getProperty("url");
	String userName_data = p.getProperty("userName");
	String password_data = p.getProperty("password");
	String userName_xpath = p.getProperty("userName_xpath");
	String password_xpath = p.getProperty("password_xpath");
	String login_data = p.getProperty("login");
	
	driver.get(url_data);
	driver.findElement(By.xpath(userName_xpath)).sendKeys(userName_data);
	

}
}
