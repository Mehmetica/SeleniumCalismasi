package SeleniumDeneme2FA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OK_Bitly {

    public static void main(String[] args) throws InterruptedException {








    }public  void bitly() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("----------------------------------------");



        driver.get("https://bitly.com/a/sign_in");
        driver.manage().window().maximize();



        driver.findElement(By.xpath("//input[@autocomplete='username email']")).click();


        driver.findElement(By.xpath("//input[@autocomplete='username email']")).sendKeys(Objects.eMail);


        driver.findElement(By.xpath("//input[@autocomplete='current-password']")).click();

        driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys(Objects.password);

        driver.findElement(By.xpath("//input[@type='submit' and @tabindex='5']")).click();


    }
}
