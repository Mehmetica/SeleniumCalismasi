package SeleniumDeneme2FA;

public class AnaSinif {

    public static void main(String[] args) throws InterruptedException {
        OK_Arena arena = new OK_Arena();
        OK_Bitly bitly = new OK_Bitly();
        OK_Cex cex = new OK_Cex();
        OK_Coinbase coinbase = new OK_Coinbase();
        OK_DropBox dropBox = new OK_DropBox();
        OK_Elastic elastic = new OK_Elastic();
        OK_Expo expo = new OK_Expo();
        OK_Gocardless gocardless = new OK_Gocardless();
        OK_Kaspersky kaspersky = new OK_Kaspersky();
        OK_Monday monday = new OK_Monday();
        OK_PCloud pCloud= new OK_PCloud();
        OK_Postmark postmark = new OK_Postmark();
        OK_Textlocal textlocal = new OK_Textlocal();
        OK_Vagrant vagrant = new OK_Vagrant();
        OK_Wazirx wazirx = new OK_Wazirx();
        OK_YouHolder youHolder = new OK_YouHolder();

        dropBox.dropbox();
        youHolder.youholder();
        pCloud.pcloud();
        elastic.elastic();
        cex.cex();
        vagrant.vagrant();
        kaspersky.kaspersky();
        bitly.bitly();
        monday.monday();
        arena.arena();
        expo.expo();
        postmark.postmark();
        textlocal.textlocal();
        gocardless.gocardless();
        coinbase.coinbase();

    }
}
