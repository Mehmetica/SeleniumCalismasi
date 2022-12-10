package SeleniumDeneme2FA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OK_Wazirx {

    public  void wazirx() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //sayfaya gitme
        driver.get("https://wazirx.com/login?source=menubar");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//input[@placeholder='Enter your email']")).click();

        driver.findElement(By.xpath("//input[@placeholder='Enter your email']")).sendKeys(Objects.eMail);
        Thread.sleep(500);
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).click();

        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(Objects.password);
        driver.findElement(By.xpath("//span[text()='Login']")).click();






    }
}
