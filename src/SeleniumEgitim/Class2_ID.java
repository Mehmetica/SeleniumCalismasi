package SeleniumEgitim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2_ID {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //sayfaya gitme
        driver.get("https://login.yahoo.com");
        //sayfayı max hale getirme
        driver.manage().window().maximize();
        //hesap oluştur a tıklama
        driver.findElement(By.id("createacc")).click();
        //1 sn bekleme
        Thread.sleep(1000);
        //isim girme
        String isim = "Mehmet";
        driver.findElement(By.name("firstName")).sendKeys(isim);
        //soyisim girme
        Thread.sleep(1000);
        driver.findElement(By.name("lastName")).sendKeys("Gezer");




    }
}
