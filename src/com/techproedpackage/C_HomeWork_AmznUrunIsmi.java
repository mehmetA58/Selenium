package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C_HomeWork_AmznUrunIsmi {
    // amazon.com a gidip java kelimesini aratin
    // kac sonuc geldigini ve gelen sonuclardan 4.ve 7.nin isimlerini yazdirin

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc1\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com/");
        WebElement searchBox=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        searchBox.sendKeys("Java"+Keys.ENTER);
        WebElement sonuc=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));
        System.out.println(sonuc.getText()+"tane işlem sonucu var");



        // WebElement four= driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal'][4]"));
        // System.out.println("dördüncü ürünün ismi : "+four.getText());
        // WebElement seven=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[8]/div/span/div/div/div[2]/div[1]/h2/a/span"));
        // System.out.println("yedinci ürünün ismi : "+seven.getText());



        List<WebElement> ürünler=driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        for (int i = 1; i < ürünler.size(); i++) {
            System.out.println(i+".sıradaki ürün ismi: "+ürünler.get(i).getText());
        }

        //System.out.println("ürünler.size() = " + ürünler.size());

        driver.close();
    }
}