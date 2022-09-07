package Automation.DemoProject;

import java.io.File;
import java.io.IOException;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.TakesScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		
		//call the chrome driver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//navigate to the URL
		
		
		driver.get("https://financialmarketdata.televisory.com/login");
		
		// Find the fields position
		WebElement mail =  driver.findElement(By.xpath("//input[@type='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		
		//Send the key values
		
		mail.sendKeys("intizar.malik100@televisory.com");
		password.sendKeys("malik123");
		
		// Find the button position and click by click method
		
		WebElement login_button = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		login_button.click();
		
		//Maximize the window
		
		
		driver.manage().window().maximize();
		//System.out.println("Comment not exceutes for dropdowns!!");
		
//		String current_URL = driver.getCurrentUrl();	
//		System.out.println("Currennt page URL:" +current_URL);
		
//		driver.navigate().to("https://dataanalytics.televisory.com/login");
//		
//		String After_navigation = driver.getCurrentUrl();	
//		System.out.println("After navigation currect page URL:" +After_navigation);
		
//		Thread.sleep(4000);
//		driver.navigate().back();
//		
//		String back_URL2 = driver.getCurrentUrl();	
//		System.out.println("After Back navigation Currennt page URL:" +back_URL2);
//		driver.navigate().refresh();
//		driver.navigate().forward();
//		
//	
//		String forward_URL = driver.getCurrentUrl();	
//		System.out.println("After format Currennt page URL:" +forward_URL);
		
		
		//take  Screen short whole page;
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//Create folder 
	    File destination = new File("Screenshorts/img1.png");
	    FileHandler.copy(scrFile, destination);
	    System.out.println("Screenshort is taken");
		
		//close the browser
		//driver.quit();
	}

}
