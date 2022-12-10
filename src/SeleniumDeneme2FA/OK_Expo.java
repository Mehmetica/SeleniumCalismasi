package SeleniumDeneme2FA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OK_Expo {

    public void expo() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("----------------------------------------");


        //sitye gidiş
        driver.get("https://expo.dev/login");
        driver.manage().window().maximize();


        //mail adresi kutusuna tıkla
        driver.findElement(By.xpath("//input[@id='usernameOrEmail']")).click();

        //mail adresi gir
        driver.findElement(By.xpath("//input[@id='usernameOrEmail']")).sendKeys(Objects.eMail);



        //şifre kutusuna tıkla
        driver.findElement(By.xpath("//input[@id='password']")).click();


        //şifre gir
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Objects.password);


        //login butonuna tıkla
        driver.findElement(By.xpath("//button[@class='css-fsoje9']")).click();







    }
}
