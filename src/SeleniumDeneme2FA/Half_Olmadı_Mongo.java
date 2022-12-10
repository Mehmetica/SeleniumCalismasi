package SeleniumDeneme2FA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Half_Olmadı_Mongo {
//Next butonunu bulamadım
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //sayfaya gitme
        driver.get("https://account.mongodb.com/account/login?_ga=2.144055543.331633309.1670510397-1834466613.1669965568");
        driver.manage().window().maximize();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='username']")).click();

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Objects.eMail);

        //driver.findElement(By.xpath("//div[text()='Next']")).click();  bu olmadı










    }
}
