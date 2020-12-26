package Selenium.SignInSignOut;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginTest {
	
	
	List<String> abc=new ArrayList<String>();
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\all programs\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		driver.manage().window().maximize();
		
        driver.findElement(By.name("firstName")).sendKeys("subhashi");
		
		driver.findElement(By.name("lastName")).sendKeys("Gupta");
		
		driver.findElement(By.name("Username")).sendKeys("subhashi5555");
		
		driver.findElement(By.name("Passwd")).sendKeys("subhashi@1234");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("subhashi@1234");
		
		driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/div[3]/div/div[1]/div/div/div[1]/div/div/input")).click();
		
		driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/div[2]")).click();
		
		
		
	}

}
