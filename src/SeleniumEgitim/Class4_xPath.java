package SeleniumEgitim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4_xPath {//name, id vs ile bulamadigimiz seyleri bulmak icin kullanilir
    //xpath daha spesifik olup, dinamik öğeleri rahatlıkla bulmamızı saglar
    //      //input[@name='q']   bunu incele kısmında (elements modulu) ctrl+F yapıp yazarsan
    //      google da,sana arama box ını verir.
    // name ile de ararsın class ile de. kafana göre. baştaki input, arama box ının kodlarının
    // en başında yazan tag olduğu için bunula başladık

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       /* //sayfaya gitme
        driver.get("https://login.yahoo.com");
        //sayfayı max hale getirme
        driver.manage().window().maximize();
            //starts-with metodu*/

        ////input[starts-with(@value,'Go')]     Go yu gördüğünde eşleşen tüm değerleri verir. tam adını yazmaya gerek
        // kalmadan işimizi kolaylaştırır. burda input div de olabilir. html kodun başında ne yazıyorsa onl ara,//
        // a[starts-with(@aria-label,'Amazon')]  https://www.amazon.com.tr/ref=nav_logo

        //text() metodu     html kodun içindeki text i alır
        driver.get("https://www.amazon.com.tr/ref=nav_logo");
        //sayfayı max hale getirme
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='ve Siparişler']")).click();

        //contains metodu

        //input[contains(@type,'sub')]    içinde sub içerenleri verir. input yerine * yazarsan tüm html kodlarında arar

        //or, and metodu

        ////input[@class='gLFyf' or @name='q']   ikisinden biri doğruysa dogru yeri verir
        ///input[@class='gLFyf' and @name='q']    ikisi de dogru olmalı ki döndü versin
        ////input[starts-with(@class,'gLFyf') or @type='text']






    }
}