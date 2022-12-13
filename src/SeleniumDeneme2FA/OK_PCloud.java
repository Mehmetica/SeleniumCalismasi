package SeleniumDeneme2FA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OK_PCloud {
    public   void pcloud() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.pcloud.com/tr/eu");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='Modal__OvalModalClose-dFihMu fLkzlo']")).click();
        driver.findElement(By.xpath("//a[@class='UserHeader__Sign-hDcTWm efPTnN']")).click();
        driver.findElement(By.xpath("//input[@class='WebStyles__Input-gmVoag caiDsQ']")).click();
        driver.findElement(By.xpath("//input[@class='WebStyles__Input-gmVoag caiDsQ']")).sendKeys("m.gzr.160588@gmail.com");
        driver.findElement(By.xpath("//button[text()='Devam et']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("Besiktas01!");
        driver.findElement(By.xpath("//button[text()='Giriş Yap']")).click();




//input[@placeholder='Şifre']


    }
}

