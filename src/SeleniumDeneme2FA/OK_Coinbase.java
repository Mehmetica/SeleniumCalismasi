package SeleniumDeneme2FA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OK_Coinbase {

    public static void main(String[] args) throws InterruptedException {








    }public void coinbase() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("----------------------------------------");


        //sitye gidiş
        driver.get("https://login.coinbase.com/signin");
        driver.manage().window().maximize();


        Thread.sleep(2000);
        //mail adresi kutusuna tıkla
        driver.findElement(By.xpath("//input[@data-testid='input-username']")).click();
        Thread.sleep(1500);
        //mail adresi gir
        driver.findElement(By.xpath("//input[@data-testid='input-username']")).sendKeys(Objects.eMail);
        Thread.sleep(1500);

        driver.findElement(By.xpath("//span[text()='Devam et']")).click();
        Thread.sleep(1500);


        //şifre kutusuna tıkla
        driver.findElement(By.xpath("//input[@type='password']")).click();
        Thread.sleep(1000);

        //şifre gir
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Besiktas01!Besiktas01!Besiktas01!");
        Thread.sleep(1500);




        //login butonuna tıkla
        driver.findElement(By.xpath("//span[text()='Devam et']")).click();


    }
}
