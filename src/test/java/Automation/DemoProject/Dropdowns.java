package Automation.DemoProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Lunch the browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://52.220.108.233/financialmarketdata/company");
		WebElement mail =  driver.findElement(By.xpath("//input[@type='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		driver.manage().window().maximize();
		
		//Send the key values
		
		mail.sendKeys("intizar.malik100@televisory.com");
		password.sendKeys("malik123");
		
		// Find the button position and click by click method
		
		WebElement login_button = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		login_button.click();
		Thread.sleep(3000);
		
		//dropdown
//		WebElement dropdown =  driver.findElement(By.xpath("//span[@id='select2-companyStep6-container']"));
//		Select select = new Select(dropdown);
		
		//select the text from the dropdown
		// obj.method
//		select.selectByVisibleText("JPY");
		
		WebElement financial = driver.findElement(By.xpath("//button[contains(text(),' Financials ')]"));
		financial.click();
		Thread.sleep(1000);
		System.out.println("Successfully Click the Financial Tap");
		
		WebElement quaterly = driver.findElement(By.xpath("//button[contains(text(),' Quarterly ')]"));
		quaterly.click();
		System.out.println("Successfully Click the Quaterly button");
		
		//Dropdown
		WebElement dropdown = driver.findElement(By.xpath("//span[@id='select2-companyStep6-container']"));
		dropdown.click();
		Thread.sleep(1000);
		System.out.println("Successfully CLick the dropdown selection");
		
		//Search by currency value functionality.
		System.out.println("Click the input fields");
		WebElement dp = driver.findElement(By.xpath("//input[@aria-label='Search']"));
		dp.sendKeys("USD",Keys.ENTER);
		System.out.println("USD is selected sucessfully");
		
		
		 driver.findElement(By.id("select2-companyStep6-container")).click();
		System.out.println("Select by dropdwon is completed");
		 //driver.findElement(By.id("select2-companyStep6-results")).click();
//		driver.findElement(By.xpath("//li[@id='select2-companyStep6-result-wnoj-AED']"));
		
		
//		Select objSelect = new Select(driver.findElement(By.xpath("//span[@id='select2-companyStep6-container']")));
//		objSelect.deselectByVisibleText("IRR");
		
								
	}
		
	
	

	
}
