package seleniumPracticeAssignments;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC2_LoginPage {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pradeepG\\Downloads\\Trainings\\Automation Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String baseURLLogin, baseURLLogout;
		
		baseURLLogin = "https://demoqa.com/login";

		driver.get(baseURLLogin);	
		driver.manage().window().maximize();

		driver.findElement(By.id("userName")).sendKeys("abcxyz@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Password@123");
		driver.findElement(By.id("login")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));				//Not Working
		
		baseURLLogout = driver.getCurrentUrl().toString();
		System.out.println(baseURLLogout);
		
	
	}
}