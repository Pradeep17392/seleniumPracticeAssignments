package seleniumPracticeAssignments;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC3_SearchParticularOptionListbox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pradeepG\\Downloads\\Trainings\\Automation Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String baseUrl;
		
		baseUrl = "https://www.letskodeit.com/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));	
		driver.get(baseUrl);
		
		//driver.findElement(By.xpath("//*[@id=\"zen_all_courses_dynamic\"]/div[2]/div[1]/select"));
		//WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"carselect\"]"));
		
		//WebElement dropdown = driver.findElement(By.id("multiple-select-example"));
		//WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"zen_all_courses_dynamic\"]"));
		/*Select select = new Select(dropdown);
		List<WebElement> allOptions = select.getOptions();
		for(int i=0;i<allOptions.size();i++)
		{
	        String lsValue = allOptions.get(i).getText();
	        System.out.println(lsValue);
		}*/
				
		driver.close();
	}

}
