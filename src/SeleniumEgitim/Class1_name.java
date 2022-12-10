package SeleniumEgitim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1_name {

    public static void main(String[] args) throws InterruptedException {
//C mize indirdiğimiz driver ı hedef gösterdik ve intellij e monte ettik
        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        //yeni bir nesne oluşturduk
        WebDriver driver = new ChromeDriver();
        //siteye gitme komutu
        driver.get("https://www.google.com");
        //sayfayı büyütme komutu
        driver.manage().window().maximize();
        //istenen yere gel, sağa tıkla incele de 2 defa yap bunu, ve ulaşmak istediğin yerin herhangi bir parametresini
        // seç ve onunla burda arama yap By keywordü ile
        //By. herhangi birşeyle(burda name ile) istenen yeri bulma komutu  .sendKey ile içini doldurduk
        driver.findElement(By.name("q")).sendKeys("Java");
        //1 sn bekleme hata vermeyi azaltıyor
        Thread.sleep(1000);

        driver.findElement(By.className("gNO89b")).click();

    }
}
