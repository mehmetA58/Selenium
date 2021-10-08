package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/pc1/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

//Merhaba Arkadaşlar sizlerle ilk Selenium deneyimimi paylaşmak istiyorum :)
        //1-öncelikle gitmek istediğim URL'yi yazacağım.
        driver.get("https://www.google.com.tr/");
        //2-daha sonra ekran boyutu ayarını yapalım
        driver.manage().window().maximize();//ekranı tam ekran yapacağız
        //3-işaretçini bir miktar beklemesini istiyoruz
        Thread.sleep(1000);
        //4-Google arama çubuğuna ulaşıp yazdırma işlemi sağlayalım
        driver.findElement(By.name("q")).sendKeys("techproeducation"+ Keys.ENTER);//arama çubuğuna ulaştık ve aramak istediğimiz sözcüğü yazdırdık
        Thread.sleep(1000);//bir miktar bekletme :)//bu kısımda ise element olarak name değerini kullandık

        //5-arama butonuna tıklanmasını sağlayalım
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div[1]/a/h3")).click();
        //6-ve Run edelim
       // evet başarılı oldu.
        driver.quit();




    }
}
