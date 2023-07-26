package seleniumPracticeAssignments;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_RegistrationPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pradeepG\\Downloads\\Trainings\\Automation Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String baseURL;
		
		baseURL = "https://demoqa.com/register";

		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		/*
		 * driver.findElement(By.id("firstname")).sendKeys("Test");
		 * driver.findElement(By.id("lastname")).sendKeys("User");
		 * driver.findElement(By.id("userName")).sendKeys("testUser765");
		 * driver.findElement(By.id("password")).sendKeys("Password@1");
		 * driver.findElement(By.id("recaptcha-anchor")).isSelected();
		 * driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[3]")).isEnabled();
		 * driver.findElement(By.id("register")).click(); */
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.close();

	}

}
