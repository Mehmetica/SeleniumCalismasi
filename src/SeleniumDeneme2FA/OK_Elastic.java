package SeleniumDeneme2FA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OK_Elastic {

    public void elastic () throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //sayfaya gitme
        driver.get("https://cloud.elastic.co/login?redirectTo=%2Fhome");
        driver.manage().window().maximize();


        //driver.findElement(By.xpath("//input[@data-test-id='login-username']")).click();
        driver.findElement(By.xpath("//input[@name='email']")).click();

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Objects.eMail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@data-test-id='login-password']")).click();
        driver.findElement(By.xpath("//input[@data-test-id='login-password']")).sendKeys("Besiktas01!!!");

        driver.findElement(By.xpath("//span[text()='Log in']")).click();





    }
}
