package project;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;

public class Pro {
	

	
	  public  WebDriver driver;

	    @BeforeClass
	    public void setup() throws Exception {
	    	WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
	        
	    }

	    @Test(priority=1)
	    public void testLoginAndAddToCart() throws InterruptedException, IOException {
	        driver.get("https://www.saucedemo.com");

	        // Login
	        WebElement usernameInput = driver.findElement(By.id("user-name"));
	        WebElement passwordInput = driver.findElement(By.id("password"));
	        WebElement loginButton = driver.findElement(By.id("login-button"));

	        usernameInput.sendKeys("standard_user");
	        passwordInput.sendKeys("secret_sauce");
	        Thread.sleep(2000);
	        TakesScreenshot screenshot=(TakesScreenshot)driver;
	    	File source=screenshot.getScreenshotAs(OutputType.FILE);
	    	FileUtils.copyFile(source, new File("./SeleniumScreenshots/Screen.png"));
	    	System.out.println("Screenshot is captured");
	       
	    	loginButton.click();
	        Thread.sleep(2000);
	        
	        TakesScreenshot screenshot1=(TakesScreenshot)driver;
	    	File source1=screenshot1.getScreenshotAs(OutputType.FILE);
	    	FileUtils.copyFile(source1, new File("./SeleniumScreenshots/Screen1.png"));
	    	System.out.println("Screenshot is captured");
	    	Thread.sleep(3000);
	    	
	    	driver.navigate().back();
	    	
	    	Thread.sleep(2000);
	    	
	    	  WebElement usernameInput1 = driver.findElement(By.id("user-name"));
		        WebElement passwordInput1 = driver.findElement(By.id("password"));
		        WebElement loginButton1 = driver.findElement(By.id("login-button"));
	    	
	    	//usernameInput.clear();
	    	//Thread.sleep(2000);
	    	 usernameInput1.sendKeys("locked_out_user");
		        passwordInput1.sendKeys("secret_sauce");
		        Thread.sleep(2000);
		        TakesScreenshot screenshot2=(TakesScreenshot)driver;
		    	File source2=screenshot2.getScreenshotAs(OutputType.FILE);
		    	FileUtils.copyFile(source2, new File("./SeleniumScreenshots/Screen2.png"));
		    	System.out.println("Screenshot is captured");
		       
		    	loginButton1.click();
		        Thread.sleep(2000);
		        
		        TakesScreenshot screenshot3=(TakesScreenshot)driver;
		    	File source3=screenshot3.getScreenshotAs(OutputType.FILE);
		    	FileUtils.copyFile(source3, new File("./SeleniumScreenshots/Screen3.png"));
		    	System.out.println("Screenshot is captured");

		    	
		    	
		    	driver.navigate().refresh();
		    	
		    	
		    	  WebElement usernameInput2 = driver.findElement(By.id("user-name"));
			        WebElement passwordInput2 = driver.findElement(By.id("password"));
			        WebElement loginButton2 = driver.findElement(By.id("login-button"));
		    	
		    	
		    
		    	//Thread.sleep(2000);
		    	 usernameInput2.sendKeys("problem_user");
			        passwordInput2.sendKeys("secret_sauce");
			        Thread.sleep(2000);
			        TakesScreenshot screenshot5=(TakesScreenshot)driver;
			    	File source5=screenshot5.getScreenshotAs(OutputType.FILE);
			    	FileUtils.copyFile(source5, new File("./SeleniumScreenshots/Screen5.png"));
			    	System.out.println("Screenshot is captured");
			       
			    	loginButton2.click();
			        Thread.sleep(2000);
			        
			        TakesScreenshot screenshot4=(TakesScreenshot)driver;
			    	File source4=screenshot4.getScreenshotAs(OutputType.FILE);
			    	FileUtils.copyFile(source4, new File("./SeleniumScreenshots/Screen4.png"));
			    	System.out.println("Screenshot is captured");
			    	
			    	
			    	driver.navigate().back();
			    	Thread.sleep(2000);
			    	  WebElement usernameInput3 = driver.findElement(By.id("user-name"));
				        WebElement passwordInput3 = driver.findElement(By.id("password"));
				        WebElement loginButton3 = driver.findElement(By.id("login-button"));
			    	
			    	
			    
			    	//Thread.sleep(2000);
			    	 usernameInput3.sendKeys("performance_glitch_user");
				        passwordInput3.sendKeys("secret_sauce");
				        Thread.sleep(2000);
				        TakesScreenshot screenshot6=(TakesScreenshot)driver;
				    	File source6=screenshot6.getScreenshotAs(OutputType.FILE);
				    	FileUtils.copyFile(source6, new File("./SeleniumScreenshots/Screen6.png"));
				    	System.out.println("Screenshot is captured");
				       
				    	loginButton3.click();
				        Thread.sleep(2000);
				        
				        TakesScreenshot screenshot7=(TakesScreenshot)driver;
				    	File source7=screenshot7.getScreenshotAs(OutputType.FILE);
				    	FileUtils.copyFile(source7, new File("./SeleniumScreenshots/Screen7.png"));
				    	System.out.println("Screenshot is captured");
				    	
	        
	       
	    }
	    
	
	    @AfterClass
	    public void teardown() {
	         
	            driver.quit();
	        
	    }
	}



