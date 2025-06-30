package allstuff;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ApplicationLaunch {
	
	@Test
	public void Amazon1() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();

    options.setAcceptInsecureCerts(true);

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.quit();
	

	}
}
