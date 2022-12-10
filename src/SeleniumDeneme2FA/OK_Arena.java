package SeleniumDeneme2FA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OK_Arena {

    public static void main(String[] args) throws InterruptedException {

    } public void arena() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("----------------------------------------");
        //sitye gidiş
        driver.get("https://account.arena.net/login?_ga=2.7078961.242177898.1668680290-1499147135.1668680290&_gl=1*2jhhwh*_ga*MTQ5OTE0NzEzNS4xNjY4NjgwMjkw*_ga_5S66MJ2Z7H*MTY2ODY4MDI4OS4xLjEuMTY2ODY4MDM2MC4wLjAuMA..");
        driver.manage().window().maximize();


        //mail adresi kutusuna tıkla
        driver.findElement(By.xpath("//input[@placeholder='Email / Account Name']")).click();

        //mail adresi gir
        driver.findElement(By.xpath("//input[@placeholder='Email / Account Name']")).sendKeys(Objects.eMail);



        //şifre kutusuna tıkla
        driver.findElement(By.xpath("//input[@placeholder='Password']")).click();


        //şifre gir
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Objects.password);


        //login butonuna tıkla
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
}
