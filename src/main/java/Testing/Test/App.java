package Testing.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Hello world!
 *
 */
public class App {
	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys(" youtube mt software");
		driver.findElement(By.name("btnK")).click();
        Thread.sleep(4000);
		driver.quit();

	}
}
