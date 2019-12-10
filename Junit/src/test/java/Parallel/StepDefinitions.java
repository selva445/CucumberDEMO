package Parallel;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;


public class StepDefinitions {

	WebDriver driver;
    @Given("open solera in chrome")
    public void step() throws InterruptedException {
        //System.out.format("Thread ID - %2d - %s from %s feature file.\n",
       // Thread.currentThread().getId(), scenario,file);
        System.out.println("Hello");
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\selvakumar.c\\Downloads\\Fram6\\Fram6 - Copy\\src\\main\\java\\Jar\\chromedriver.exe");				 			
		ChromeOptions options = new ChromeOptions();				 			
		options.addArguments("--lang=en-AU");	
		options.setExperimentalOption("useAutomationExtension", false);
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("intl.accept_languages", "en-AU");
		options.setExperimentalOption("prefs", prefs);
	
		prefs.put("plugins.plugins_disabled", new String[] {
            "Chrome PDF Viewer"
        });
		prefs.put("plugins.always_open_pdf_externally", true);
		//String downloadFilepath = Constant.PDF_Download;
		//prefs.put("download.default_directory", downloadFilepath);
		options.setExperimentalOption("prefs", prefs);
		options.setCapability("requireWindowFocus", true);
		driver = new ChromeDriver(options);					
		System.out.println("Chrome Browser is selected");		
		 		
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   
	    driver.get("https://audanet-cae.audatex.com.au/sso/login?service=https%3a%2f%2faudanet-cae.audatex.com.au%2fbre");
	    Thread.sleep(2000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.focus();");
	    
	    driver. manage(). window().maximize();
	   
	    System.out.println(driver.getTitle());
	    
	    driver.findElement(By.id("ssousername")).clear();
		driver.findElement(By.id("ssousername")).sendKeys("155757");
		
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("x7U2Nj33AN0B99EH");
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.name("submit")).click();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		js.executeScript("window.focus();");
	    driver.close();
    }
    
    @Given("Open google in chrome")
    public void open_firefox() throws InterruptedException
    		{
    			
    				//System.out.format("Thread ID - %2d - %s from %s feature file.\n",
    		        //Thread.currentThread().getId(), scenario,file);
    		        System.out.println("Hello");
    		    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\selvakumar.c\\Downloads\\Fram6\\Fram6 - Copy\\src\\main\\java\\Jar\\chromedriver.exe");				 			
    				ChromeOptions options = new ChromeOptions();				 			
    				options.addArguments("--lang=en-AU");	
    				options.setExperimentalOption("useAutomationExtension", false);
    				Map<String, Object> prefs = new HashMap<String, Object>();
    				prefs.put("intl.accept_languages", "en-AU");
    				options.setExperimentalOption("prefs", prefs);
    			
    				prefs.put("plugins.plugins_disabled", new String[] {
    		            "Chrome PDF Viewer"
    		        });
    				prefs.put("plugins.always_open_pdf_externally", true);
    				//String downloadFilepath = Constant.PDF_Download;
    				//prefs.put("download.default_directory", downloadFilepath);
    				options.setExperimentalOption("prefs", prefs);
    				options.setCapability("requireWindowFocus", true);
    				driver = new ChromeDriver(options);					
    				System.out.println("Chrome Browser is selected");		
    				 		
    			    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    			   
    			    driver.get("https://www.google.com");
    			    
    			    JavascriptExecutor js1 = (JavascriptExecutor) driver;
    			    js1.executeScript("window.focus();");
    			    
    			    driver. manage(). window().maximize();
    			    
    			   

    			    Thread.sleep(9000);
    			    js1.executeScript("window.focus();");
    			    driver.close();
    		}
    
}

