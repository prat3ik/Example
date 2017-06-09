import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */

public class AppTest {

	@Test
	public void test1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());

		WebElement el = driver.findElement(By.id("lst-ib"));
		el.sendKeys("Coldplay" + Keys.ENTER);

		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".rc>.r>a")));

		String actualResult = driver.findElement(By.cssSelector(".rc>.r>a")).getText();
		System.out.println("....Asserting the result...");
		Assert.assertEquals(actualResult, "Coldplay official website");
	}
}
