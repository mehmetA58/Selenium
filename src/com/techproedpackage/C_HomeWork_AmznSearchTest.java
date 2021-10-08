package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class C_HomeWork_AmznSearchTest {
    public static void main(String[] args) throws InterruptedException {
        //1. Bir class oluşturun : AmazonSearchTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        // a.https://www. amazon.com/
        // b. Search(ara) “city bike”
        // c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        // d. “Shopping” e tıklayın.
        // e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc1\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement idTextBox=driver.findElement(By.id("twotabsearchtextbox"));
        Thread.sleep(1000);
        idTextBox.sendKeys("city bike"+ Keys.ENTER);
        Thread.sleep(1000);
        WebElement sonucYazisi=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));
        System.out.println("Amazon'da görüntülenen sonuçların sayısı : "+sonucYazisi.getText());
        Thread.sleep(1000);
        WebElement shopping=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
        Thread.sleep(1000);
        shopping.click();
        Thread.sleep(2000);
        WebElement resim=driver.findElement(By.id("100 17443c0a-announce"));
        Thread.sleep(2000);
        resim.click();


        driver.close();



    }
}
