package week3.day2.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailUnique {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();

		driver.get("https://erail.in/");
		Thread.sleep(2000);

		driver.findElement(By.id("chkSelectDateOnly")).click();

		driver.findElement(By.id("txtStationFrom")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("txtStationFrom")).sendKeys("Tambaram", Keys.ENTER);

		driver.findElement(By.id("txtStationTo")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("txtStationTo")).sendKeys("Madurai Jn", Keys.ENTER);

		Thread.sleep(2000);

		List<WebElement> trainList = driver.findElements(By.xpath("//td[@style=';']"));
		System.out.println("Size of list is: " + trainList.size());
		
		Set<String> trainNames= new HashSet<String>();
		

		for (WebElement a : trainList) {
			trainNames.add(a.getText());
		}

		
		System.out.println(trainNames);
		System.out.println("Total number of trains after using Set is: " + trainNames.size());
	}
}
