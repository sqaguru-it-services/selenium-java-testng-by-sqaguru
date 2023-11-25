package sqaguru.selenium.actiontests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActionTest {

	public static void main(String[] args) throws InterruptedException, AWTException {

		{
			System.setProperty("webdriver.chrome.driver",
					"D:\\sqa-guru\\selenium-java-by-sqaguru\\resources\\drivers\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("https://google.com");

			// Enter "webdriver" text and perform "ENTER" keyboard action
			driver.findElement(By.name("q")).sendKeys("webdriver" + Keys.ENTER);

			Actions action = new Actions(driver);

			action.keyDown(driver.findElement(By.name("q")), Keys.CONTROL)
			.sendKeys("a").keyUp(Keys.CONTROL)
			.build().perform();

			// action.sendKeys("selenium").keyUp(Keys.SHIFT).build().perform();

			driver.findElement(By.name("q")).sendKeys("selenium");

		}
	}
}
