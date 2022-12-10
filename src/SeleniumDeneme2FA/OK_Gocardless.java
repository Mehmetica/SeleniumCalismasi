package SeleniumDeneme2FA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OK_Gocardless {

    public void gocardless() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("----------------------------------------");


        //sitye gidiş
        driver.get("https://manage.gocardless.com/sign-in");
        driver.manage().window().maximize();

        Thread.sleep(500);
        //mail adresi kutusuna tıkla
        driver.findElement(By.xpath("//input[@id='email']")).click();
        Thread.sleep(500);

        //mail adresi gir
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Objects.eMail);



        //şifre kutusuna tıkla
        driver.findElement(By.xpath("//input[@id='password']")).click();


        //şifre gir
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Besiktas01!Besiktas01!");


        //login butonuna tıkla
        driver.findElement(By.xpath("//button[@type='submit']")).click();







    }
}
