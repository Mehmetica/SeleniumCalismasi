
package SeleniumEgitim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("----------------------------------------");


        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();


        WebElement isim = driver.findElement(By.name("firstname"));
        isim.click();
        isim.sendKeys("Mehmet");

        WebElement soyisim = driver.findElement(By.name("lastname"));
        soyisim.click();
        soyisim.sendKeys("Gezer");


        WebElement male = driver.findElement(By.xpath("//input[@value='Male']"));
        male.click();
        //div[dir=ltr]>:nth-child(14)
        //experience seçimlerine kadar yukardan aşağı indik. önce ilk baba tag i bulup çocuklarına doğru aşağı indik.
        // input tag i de tüm seçimleri kapsadığı için onunla birtirdik css kodu. Ve bunları bir list e koyduk
        List<WebElement> list = driver.findElements(By.cssSelector("div[dir=ltr]>:nth-child(14)>input"));

        for (WebElement each : list) {
            each.click();
            Thread.sleep(500);
        }


        WebElement date = driver.findElement(By.cssSelector("#datepicker"));
        date.sendKeys("12.09.2022");

        WebElement profession = driver.findElement(By.cssSelector("input[id=profession-0]"));
        profession.click();//manuel tester seçtik. css selector ile bulduk

        //burda div-class ı control grup olan 7 tane tag vardı. biz normal xpath ile class ı bulduk ve parentez içine alıp sonuna [7]
        //koyarak 7. class a git dedik. sonra da  xpath de // css de > ile alt tag e inip inputları aldık.inpulat tıklamamız gereken kutucuklar
        List<WebElement> list2 = driver.findElements(By.xpath("(//div[@class='control-group'])[7]//input"));
        for (WebElement each : list2) {
            each.click();
            Thread.sleep(300);
        }
//        //cookileri kabul et butonu
//        WebElement cookies = driver.findElement(By.cssSelector("span.cookie-choices-buttons>:nth-child(2)"));
//        cookies.click();

//select class:  dropdown menuyu bulduk
        WebElement element = driver.findElement(By.cssSelector("#continents"));
        //önce listenin yerini belirledik.
        WebElement continents = driver.findElement(By.cssSelector("#continents"));
        //daha sonra select classdan bir nesne oluşturduk ve içine listenin konumunu  attık
        Select select = new Select(continents);
        //daha sonra istediğimiz bir seçme yöntemiyle veriyi seçtik
        select.selectByVisibleText("Australia");
        select.selectByIndex(4);// list mantığı var. index 0 dan başlıyor
//yeni element veya select objesi oluşturmaya gerek yok.eskilerini override ederek kullanabilirssin
        element = driver.findElement(By.cssSelector("#selenium_commands"));

        select.selectByVisibleText("Wait Commands");


    }
}
