package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/champ/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.fitpeo.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div[3]/div[6]/a/div")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@type,'number')]")).sendKeys("820");
		
		Thread.sleep(3000);
		
				
		//driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/label/span[1]/input")).click();
		
		driver.quit();
	}
}
