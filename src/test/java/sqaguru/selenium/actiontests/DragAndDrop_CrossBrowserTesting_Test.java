package sqaguru.selenium.actiontests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_CrossBrowserTesting_Test {

	public static void main(String[] args) throws InterruptedException, AWTException {

		{
			System.setProperty("webdriver.chrome.driver",
					"D:\\sqa-guru\\selenium-java-by-sqaguru\\resources\\drivers\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("https://crossbrowsertesting.github.io/drag-and-drop");

			Actions action = new Actions(driver);

			WebElement draggable = driver.findElement(By.id("draggable"));

			WebElement droppable = driver.findElement(By.id("droppable"));

			action.dragAndDrop(draggable, droppable).build().perform();

		}
	}
}
