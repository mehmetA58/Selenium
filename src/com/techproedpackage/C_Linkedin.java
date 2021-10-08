package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_Linkedin {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc1\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.linkedin.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"session_key\"]")).sendKeys("mehmet.akbayir58@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"session_password\"]")).sendKeys("195987");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div[2]/form/button")).click();
        Thread.sleep(1000);
        WebElement textBox=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div[2]/div/div/main/div[1]/div/div[1]/button/span"));
        Thread.sleep(2000);
        textBox.click();
        Thread.sleep(1000);
        WebElement tag= driver.findElement(By.xpath("(//div[@role='textbox'])[1]"));
        Thread.sleep(2000);
        tag.sendKeys("Bugün Bootcamp Selenyum'da 3.akşamım ve buraya #Selenyum ile geldim.Teşekkürler @TechPro Education");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[2]/div[2]/div[3]/button/span")).click();










    }
}
