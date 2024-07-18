package Testing.Infinite_Analytics_QA_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Electoral_Rolls {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();


		String downloadFilePath = "C:\\path\\to\\your\\download\\directory";
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("download.default_directory", downloadFilePath);
		prefs.put("plugins.always_open_pdf_externally", true); // Automatically download PDFs
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--remote-allow-origins=*");
		// Open the webpage

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://ceotserms2.telangana.gov.in/ts_erolls/rolls.aspx");


		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement DistrictName = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_ContentPlaceHolder1_ddlDist"))); 
		Select DistrictName_dropdown = new Select(DistrictName);
		DistrictName_dropdown.selectByIndex(17);


		WebElement AssemblyConstituency = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_ContentPlaceHolder1_ddlAC"))); 
		Select AssemblyConstituency_dropdown = new Select(AssemblyConstituency);
		AssemblyConstituency_dropdown.selectByVisibleText("61-Jubilee Hills");

		driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnlogin")).click();

		driver.findElement(By.id("ctl00_ContentPlaceHolder1_GridView2_ctl07_lnkEnglish")).click();



		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;


		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()) {
			subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window

		JOptionPane.showMessageDialog(null, "Please solve the CAPTCHA manually and click SUBMIT to continue...");

		//		System.out.println("Please solve the captcha...");
		Thread.sleep(30000); // Sleep for  (30,000 milliseconds)
		//		System.out.println("Continuing with the script...");


		WebElement ClickButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSubmit")));
		ClickButton.click();


		 // Wait for the embedded PDF element to be present and visible
        WebDriverWait wait1 = new WebDriverWait(driver, 30);
        WebElement pdfElement = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.name("54A30000E89353340EA9839608EE0C5D")));

        // If the download icon is inside an iframe, switch to it
        driver.switchTo().frame(pdfElement);

        // Find the download icon using XPath
        WebElement downloadIcon = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("maskedImage")));

        // Use JavaScript to click the download icon
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", downloadIcon);

        // Wait for the download to complete (adjust time as needed)
        Thread.sleep(5000);
        
        driver.quit();


	}


}
