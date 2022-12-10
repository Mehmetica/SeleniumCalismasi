package SeleniumDeneme2FA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OK_Kaspersky {

    public  void kaspersky() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("----------------------------------------");



        driver.get("https://my.kaspersky.com/#/auth/layout/main");
        driver.manage().window().maximize();
        if (driver.manage().equals("//button[text()='Confirm']")){
            driver.findElement(By.xpath("//button[text()='Confirm']")).click();
        }


        driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonAccept")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@data-at-selector='emailInput']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@data-at-selector='emailInput']")).sendKeys(Objects.eMail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@data-at-selector='passwordInput']")).click();

        driver.findElement(By.xpath("//input[@data-at-selector='passwordInput']")).sendKeys(Objects.password);

        driver.findElement(By.xpath("//kl-button[@ atselector='welcomeSignInBtn']")).click();







    }
}
