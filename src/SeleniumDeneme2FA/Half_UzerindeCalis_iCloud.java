package SeleniumDeneme2FA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Half_UzerindeCalis_iCloud {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.icloud.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//ui-button[@class='push primary sign-in-button']")).click();
        Thread.sleep(2500);
//

//        driver.findElement(By.id("account_name_text_field")).click();
//        Thread.sleep(500);
        driver.findElement(By.xpath("//input[@class='force-ltr form-textbox form-textbox-text ']")).click();

        driver.findElement(By.xpath("//input[@id='account_name_text_field']")).sendKeys("m.gzr.160588@gmail.com");
        Thread.sleep(500);
        driver.findElement(By.xpath("//i[@class='shared-icon icon_sign_in']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Besiktas01!");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//i[@class='shared-icon icon_sign_in']")).click();




    }
}
