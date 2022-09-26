package Automation_c;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_practice {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VM452YE\\eclipse-workspace\\Autmation_cucumber\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://live.techpanda.org");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobile']"));
		mobile.click();
		driver.findElement(By.xpath("(//button[@title='Add to Cart'])[2]")).click();
		WebElement qty = driver.findElement(By.xpath("//input[@title='Qty']"));
		qty.clear();
		qty.sendKeys("2");
		driver.findElement(By.xpath("(//span[text()='Update Shopping Cart'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='coupon_code']")).sendKeys("12345");
		driver.findElement(By.xpath("//span[text()='Apply']")).click();
		WebElement coupon = driver.findElement(By.xpath("//span[text()='Coupon code \"12345\" is not valid.']"));
		System.out.println(coupon.getText());
		WebElement country = driver.findElement(By.id("country"));
		Select s = new Select(country);
		s.selectByVisibleText("India");
		driver.findElement(By.id("region")).sendKeys("Tamilnadu");
		driver.findElement(By.id("postcode")).sendKeys("69012");
		driver.findElement(By.xpath("//span[text()='Estimate']")).click();
		driver.findElement(By.xpath("(//span[text()='Proceed to Checkout'])[1]")).click();
		
	}

}
