package orangegit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Orangehub {


	@Test
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\VISHN_yvgc60o\\Downloads\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost/orangehrm/orangehrm-5.5/orangehrm-5.5/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("vishnu@12345");
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstName")).sendKeys("vishnu");
		Thread.sleep(2000);
		driver.findElement(By.name("middleName")).sendKeys("das");
		driver.findElement(By.name("lastName")).sendKeys("r");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
