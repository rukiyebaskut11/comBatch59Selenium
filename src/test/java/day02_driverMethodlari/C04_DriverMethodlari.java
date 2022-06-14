package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverMethodlari {

    public static void main(String[] args) {

        // amazon sitesine gidip Kaynak kodlarında "spend less" yazdıgını test edin

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        String sayfaKaynakKodlari = driver.getPageSource(); // sayfa kaynagını verir
        System.out.println(sayfaKaynakKodlari);

        String arananKelime = "Gateway";
        if (sayfaKaynakKodlari.contains(arananKelime)){
            System.out.println("Kaynak Kodu Testi PASSED");
        }else {
            System.out.println("Kaynak kodlarinda "+ arananKelime + " yok, test FAILED");
        }

        driver.close();

    }
}
