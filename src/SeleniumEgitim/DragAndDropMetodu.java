
package SeleniumEgitim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DragAndDropMetodu {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("----------------------------------------");


        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();

        //başkentlerin yerleini tespit ettik
        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement washington = driver.findElement(By.id("box3"));
        WebElement Stockholm = driver.findElement(By.id("box2"));
        WebElement Copenhagen = driver.findElement(By.id("box4"));
        WebElement Seoul = driver.findElement(By.id("box5"));
        WebElement Rome = driver.findElement(By.id("box6"));
        WebElement Madrid = driver.findElement(By.id("box7"));

        //ulkelerin yerini tespit ettik
        WebElement Italy = driver.findElement(By.id("box106"));
        WebElement Spain = driver.findElement(By.id("box107"));
        WebElement Norway = driver.findElement(By.id("box101"));
        WebElement Denmark = driver.findElement(By.id("box104"));
        WebElement SouthKorea = driver.findElement(By.id("box105"));
        WebElement Sweden = driver.findElement(By.id("box102"));
        WebElement UnitedStates = driver.findElement(By.id("box103"));

        Actions action = new Actions(driver);

        action.dragAndDrop(Rome,Italy).build().perform();
        action.dragAndDrop(oslo,Norway).build().perform();
        action.dragAndDrop(Madrid,Spain).build().perform();
        action.dragAndDrop(Seoul,SouthKorea).build().perform();
        action.dragAndDrop(washington,UnitedStates).build().perform();
        action.dragAndDrop(Stockholm,Sweden).build().perform();
        action.dragAndDrop(Copenhagen,Denmark).build().perform();










    }
}
