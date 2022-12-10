package SeleniumDeneme2FA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompulsoryHalf_Redis {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //sayfaya gitme
        driver.get("https://app.redislabs.com/?_gl=1*1vejvx6*_ga*MTQ4OTc5MjYuMTY2OTk2Mjc3Mg..*_ga_8BKGRQKRPV*MTY3MDUwNjIwNC4zLjAuMTY3MDUwNjIwNC4wLjAuMA..#/login");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.id("textfield--email")).sendKeys(Objects.eMail);
        Thread.sleep(1000);
        //driver.findElement(By.xpath("//input[@data-test-id='login-username']")).click();
        driver.findElement(By.name("password")).sendKeys(Objects.password);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@data-testid='button--submit']")).click();





    }
}
