package SeleniumDeneme2FA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OK_Textlocal {

    public  void textlocal() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("----------------------------------------");


        //sitye gidiş
        driver.get("https://control.txtlocal.co.uk/");
        driver.manage().window().maximize();


        //mail adresi kutusuna tıkla
        driver.findElement(By.xpath("//input[@id='login-email']")).click();

        //mail adresi gir
        driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys(Objects.eMail);



        //şifre kutusuna tıkla
        driver.findElement(By.xpath("//input[@id='login-password']")).click();


        //şifre gir
        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys(Objects.password);


        //login butonuna tıkla
        driver.findElement(By.xpath("//input[@id='login-messenger']")).click();






    }
}
