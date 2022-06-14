package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_ManageMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amaazon.com");

        /*
        ilerde wait konusunu daha genis olarak ele alacagız
        Bir sayfa acılırken ilk basta sayfanın icerisinde bulunan elementlere göre
        bir yuklenme suresine ihtiyac vardır

        veya bir web elementinin kullanılabilmesi icin zamana ihtiyac olabilir
        implicityWait bize sayfanın yuklenmesi ve sayfadaki elementlere ulasim icin beklenecek
        MAXIMUM sureyi belirleme olanagı tanır
         */

        driver.close();
    }
}
