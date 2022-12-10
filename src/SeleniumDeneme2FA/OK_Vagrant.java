package SeleniumDeneme2FA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OK_Vagrant {

    public  void vagrant() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //sayfaya gitme
        driver.get("https://app.vagrantup.com/session");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//input[@placeholder='username or email']")).click();

        driver.findElement(By.xpath("//input[@placeholder='username or email']")).sendKeys(Objects.eMail);

        driver.findElement(By.xpath("//input[@name='user[password]']")).click();
        driver.findElement(By.xpath("//input[@name='user[password]']")).sendKeys(Objects.password);

        driver.findElement(By.xpath("//input[@data-disable-with='Sign in']")).click();






    }
}
