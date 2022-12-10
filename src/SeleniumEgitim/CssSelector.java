package SeleniumEgitim;

public class CssSelector {
    public static void main(String[] args) {
        // xpath gibi arama yapmaya yarıyor ancak
        // xpath = //input[@class='asfasgg']
        //Css = input[class=asddsf]

        //id ile arama
        //div[id=footer] yada  div#footer  #footer yazarsan tüm html kodların içinde id si footer olanları getirir


        //class bulma
        //.RNlkk direk classları bulur

        //contains
        //input[maxlength*='2048'] input[maxlength*='0'] input[maxlength*='8']  içerenleri bulur
        //input[class*=gLf]  bir kısmını yazsan yeterli.bulur

        //startsWith
        //input[class^=gL]  gL ile başlyan classları getir
        //input[maxlength^='2']    2048 i buluyor

        //html arama yerine html>body>div>:nth-child(3)  yazarsan div in 3. cocuguna gider
                                        //:firstchild yada lastchild

        //endswith
        //div[id$=b]  div etiketinin altında id si b ile bitenleri bulur

        //google da arama yerine queue yazınca alt alta çıkan seçeneklerden kaçıncı sıradakini istersek seçebiliriz
        //ul sınıfı baba sınıf. arama yapınca çıkan seceneklerin hepsi
        // li sınıfı cacuk sınıf .
        //ul.erkda(sınıf ismi)>:nth(3)  aramada cikan 3. ogeyi alır
        //ul.asdaf>:first-of-type   ilk cikan sonucu alir
        //ul.asdaf>:last-of-type   son cikan sonucu alir



        //bunları kullanırklen BY.cssselector ile arat input[id=mehe]  xpathe den biraz farklı
                                                     //input[@id='mehe']

    }
}
