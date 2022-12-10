
package SeleniumEgitim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.List;

public class ActionClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("----------------------------------------");


        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();
        //tıklmadan sayfada dolaşsın istersek action sınıfını kullanıyoruz
        Actions action = new Actions(driver);

        //üst menudeki 6 tane modulü seçtik. önce ul lerine ulaştık ordan il leri seçerek enter e basınca 6 sının arasında dolastigini gorduk
        List<WebElement> menu = driver.findElements(By.xpath("//ul[@class='wt-grid wt-grid--block wt-justify-content-center wt-pt-xs-1 wt-pl-xs-1 wt-pr-xs-1 wt-pt-md-0 wt-pl-md-4 wt-pr-md-4 wt-pl-lg-6 wt-pr-lg-6']//li"));
        //her modul üstunde 1 sn bekleyip digerine gececek
        for (WebElement each : menu) {
            action.moveToElement(each).perform();
            Thread.sleep(1000);
        }






    }
}
