
package SeleniumEgitim;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class AlertMenu {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("----------------------------------------");


        driver.get("https://www.demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
        //ID boxuna değer girdik
        WebElement ID = driver.findElement(By.xpath("//input[@name='cusid']"));
        ID.sendKeys("aasd2132");
        //submit butonuna bastık
        WebElement submitButton = driver.findElement(By.cssSelector("input[name=submit]"));
        submitButton.click();

        Thread.sleep(2000);
        //burda karşımıza çıkan pop-up a tamam deme komutu verdik
        driver.switchTo().alert().accept(); //        driver.switchTo().alert().dismiss(); diyerek iptal tuşuna da bastırabilirdik

        System.out.println(driver.switchTo().alert().getText());

        //daha sonra çıkan pop-up ı kontrol ettik. karşılaştırdık ve uyuyorsa kabul et dedik
         Assert.assertEquals("Customer Successfully Delete!",driver.switchTo().alert().getText());
        Thread.sleep(2000);
        driver.switchTo().alert().accept();












    }
}
