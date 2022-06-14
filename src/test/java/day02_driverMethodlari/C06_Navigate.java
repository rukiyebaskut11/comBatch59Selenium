package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_Navigate {
    public static void main(String[] args) throws InterruptedException{

        /*
        eger testimiz sırasında birden fazla ileri geri hareket edeceksek
        driver.get() yerine driver.navigate.to() method unu kullanırız
        ve sonrasında forward(), back(), veya refresh()  method larını kullanabiliriz
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.amazon.com");
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);

        // amazon a geri dönelim
        driver.navigate().back();
        Thread.sleep(2000);

        // yeniden facebook a gidelim
        driver.navigate().forward();
        Thread.sleep(2000);

        // sayfayı refresh yapalım
        driver.navigate().refresh();
        Thread.sleep(2000);


    }
}
