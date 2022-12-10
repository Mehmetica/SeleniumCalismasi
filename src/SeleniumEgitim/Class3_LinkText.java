package SeleniumEgitim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3_LinkText {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //sayfaya gitme
        driver.get("https://login.yahoo.com");
        //sayfayı max hale getirme
        driver.manage().window().maximize();
        //sitedeki bir yazının(bağlantı linki olan) arka planına gidip, linktext alanını kopyaladık ve onla arattık
       // driver.findElement(By.linkText("Kullanıcı adınızı mı unuttunuz?")).click();
        //yazının hepsini değilde kısmi olarak arattık. arka planda Linktext alanında
        driver.findElement(By.partialLinkText("Kullanıcı")).click();
        driver.findElement(By.className("phone-no")).sendKeys("mehmetica74@gmail.com");
        driver.findElement(By.name("verifyYid")).click();
        driver.findElement(By.className("recaptcha-checkbox-border")).click();



    }
}
