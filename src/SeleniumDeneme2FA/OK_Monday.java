package SeleniumDeneme2FA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OK_Monday {

    public  void monday() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("----------------------------------------");



        driver.get("https://auth.monday.com/auth/login_monday");
        driver.manage().window().maximize();



        driver.findElement(By.xpath("//input[@id='user_email']")).click();


        driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys(Objects.eMail);
        Thread.sleep(1000);



        driver.findElement(By.xpath("//button[@data-testid='button']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id='user_password']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(Objects.password);

        driver.findElement(By.xpath("//button[@data-testid='button']")).click();







    }
}
