package task22;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.commons.math3.stat.descriptive.summary.Sum;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//Launch browser
	WebDriver driver = new ChromeDriver();
//Load URL
	driver.get("https://phptravels.com/demo");
//Maximize the window
	driver.manage().window().maximize();
//Implicit wait	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//inspect first name
	driver.findElement(By.xpath("//input[@class =\"first_name form-control\"]")).sendKeys("Divya");
	//inspect last name
	driver.findElement(By.xpath("//input[@class=\"last_name form-control\"]")).sendKeys("Anburose");
	////inspect business name
	driver.findElement(By.xpath("//input[@class=\"business_name form-control\"]")).sendKeys("DDR Traders");
	//inspect email
	driver.findElement(By.xpath("//input[@class=\"email form-control\"]")).sendKeys("divyaganeshwathi@gmail.com");
	//sum verification
	String num1 = driver.findElement(By.xpath("//span[@id=\"numb1\"]")).getText();
	System.out.println("Number 1:"+num1);
	String num2 = driver.findElement(By.xpath("//span[@id=\"numb2\"]")).getText();
	System.out.println("Number 2:"+num2);
	//convert string to integer
	int intnum1 = Integer.parseInt(num1);
	int intnum2 = Integer.parseInt(num2);
	int sum = intnum1 +intnum2;
	//Convert sum to string
	String result = Integer.toString(sum);
	driver.findElement(By.xpath("//input[@class=\"form-control w-100\"]")).sendKeys(result);
	driver.findElement(By.xpath("//button[text()=\"Submit\"]")).click();
	//to take screenshot
	TakesScreenshot screenshot = ((TakesScreenshot) driver);
	File source = screenshot.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\Anbu Rose\\eclipse-workspace\\demo1\\src\\main\\java\\task22\\snap\\Screensot1.png");
	FileUtils.copyFile(source, dest);
	
	
	
	
	
	
	
	
	
	
	
	
	}

	private static String Sum(String num1, String num2) {
		// TODO Auto-generated method stub
		return null;
	}

}
