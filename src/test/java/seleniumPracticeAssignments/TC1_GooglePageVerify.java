package seleniumPracticeAssignments;

//import java.util.concurrent.TimeUnit;

//import the required packages
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_GooglePageVerify {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();						//Create object of class ChromeDriver
		
		String baseUrl, title, currentUrl;							//Declare the variables
		
		baseUrl = "https://www.google.co.in";						//Initialize the "baseUrl" variable
		
		driver.get(baseUrl);										//
		
		title = driver.getTitle();									//
		currentUrl = driver.getCurrentUrl();						//
		
		if(title.equals("Google"))
		{
			System.out.println("Title check: Passed! "+title);
		}
		else
		{
			System.out.println("Title check: Failed! "+title);
		}
		
		if(currentUrl.contains("google.co.in"))
		{
			System.out.println("URL Check: Passed! "+currentUrl);
		}
		else
		{
			System.out.println("URL Check: Failed! "+currentUrl);
		}
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.close();												//Close the driver to release the memory
	}
}
