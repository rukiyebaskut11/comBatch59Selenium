package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {

    /*

    1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin

    2- Add Element butonuna basin

    3- Delete butonu'nun gorunur oldugunu test edin

    4- Delete tusuna basin

    5- "Add/Remove Elements" yazisinin gorunur oldugunu test edin

     */
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //    2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();


        //3- Delete butonu'nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.xpath(""));

        if (deleteButonu.isDisplayed()){
            System.out.println("delete butonu testi PASSED");
        }else {
            System.out.println("delete butonu testi FAILED");
        }

        // 4- Delete tusuna basin
        Thread.sleep(3000);
        deleteButonu.click();


        // 5- "Add/Remove Elements" yazisinin gorunur oldugunu test edin

        WebElement addRemoveYaziElementi= driver.findElement(By.xpath("//h3"));

        if (addRemoveYaziElementi.isDisplayed()){
            System.out.println("addRemoveYazi testi PASSED");
        } else {
            System.out.println("addRemoveYazi testi FAILED");
        }

        Thread.sleep(3000);
        driver.close();


    }
}
