//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginFeature {

	//String UserName = "batchautomation";
	//String Password = "Test@12345";
	@Test(dataProvider="dataSet")
	public void Login_feature(String UserName,String Password ) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SEP21\\TestNGFramework\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/login.cfm");

		 WebElement userName =   driver.findElement(By.xpath("//input[@name='username']"));
		  userName.sendKeys(UserName);
		  WebElement password =   driver.findElement(By.xpath("//input[@name='password']"));
		  password.sendKeys(Password);
		  WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
		    button.click();
		   
		   String title=driver.getTitle(); System.out.println(title);
		//org.testng.Assert.assertEquals(title, "CRMPRO");
		 	}
	
	@DataProvider(name= "dataSet")
	public Object[][] set1(){
		return new Object[][] {
			{"batchautomation","Test@12345"},
			{"tom","sdvchgsv"}
			
		};
		}
		
	
}
