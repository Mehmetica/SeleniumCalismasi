
package SeleniumEgitim;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("----------------------------------------");


        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();

        //class isminde arada boşlık varsa "btn btn-danger" gibi, bunu html de arattığın zaman bulamaz. onunyerine boşluk-> nokta yap"btn.btn-danger"
        //class aratırken css ile, başına sadece mokta koysak bulur".sdfasdf"

        // tek cevaplı alert kutusunu kapattık. ok e bastık gitti
        driver.findElement(By.cssSelector(".btn.btn-danger")).click();
        Thread.sleep(1500);
        driver.switchTo().alert().accept();

        //teyit uyarılarını(2.uyarı çıkarsa onu kapatıyoruz)
        driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
        //(//a[@class='analystic'])[2]    xpath de analystic clasından 3 tane vardı. biz hepsini paranteze alıp
        // sonuna köşeli parantezde 2 yazınca 2.cisini buldu
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        Thread.sleep(1500);
        driver.switchTo().alert().dismiss();







    }
}
