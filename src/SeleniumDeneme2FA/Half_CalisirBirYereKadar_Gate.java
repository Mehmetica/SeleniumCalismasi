package SeleniumDeneme2FA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Half_CalisirBirYereKadar_Gate {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();




        driver.get("https://www.gate.io/tr/login");
        driver.manage().window().maximize();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='E-posta']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='E-posta']")).sendKeys(Objects.eMail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='En az 8 karakter uzunluğunda']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@placeholder='En az 8 karakter uzunluğunda']")).sendKeys(Objects.password);
        Thread.sleep(1000);

        driver.findElement(By.xpath("//span[@class='mantine-qo1k2 mantine-Button-label']")).click();
        Thread.sleep(3000);


        driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
        driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();







    }
}
