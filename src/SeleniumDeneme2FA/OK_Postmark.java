package SeleniumDeneme2FA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OK_Postmark {

    public  void postmark() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("----------------------------------------");


        //sitye gidiş
        driver.get("https://account.postmarkapp.com/login");
        driver.manage().window().maximize();


        //mail adresi kutusuna tıkla
        driver.findElement(By.xpath("//input[@name='user_session[login]']")).click();
        //mail adresi gir
        driver.findElement(By.xpath("//input[@name='user_session[login]']")).sendKeys("MehmetGezer");
        Thread.sleep(1000);


        //şifre kutusuna tıkla
        driver.findElement(By.xpath("//input[@name='user_session[password]']")).click();


        //şifre gir
        driver.findElement(By.xpath("//input[@name='user_session[password]']")).sendKeys(Objects.password);


        //login butonuna tıkla
        driver.findElement(By.xpath("//button[@class='u-btn u-btn--xl']")).click();







    }
}
