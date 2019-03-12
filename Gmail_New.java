package Home_Work;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_New {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
        driver.get("https://accounts.google.com");
        
        driver.findElement(By.id("identifierId")).sendKeys("ID");
	    
	    driver.findElement(By.id("identifierNext")).click();
			
	    Thread.sleep(5000);
	
	    driver.findElement(By.name("password")).sendKeys("password");
	    driver.findElement(By.id("passwordNext")).click();
	    String title=driver.getTitle();
	    if(title.equals("Google Account"))
	    {
	    	System.out.println("yes");
	    }
	    else
	    {
	    	System.out.println("No");
	    }
	    Thread.sleep(10000);
	    driver.quit();
	}
}