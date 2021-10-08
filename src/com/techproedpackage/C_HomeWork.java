package com.techproedpackage ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class C05_HomeWork_TitleUrl {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc1\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.youtube.com/");

        String actTitle= driver.getTitle();
        String actURL=driver.getCurrentUrl();

        System.out.println("actTitle Youtube :"+actTitle);
        String expTitle="YouTube";
        System.out.println("expTitle Youtube :"+expTitle);



        if (expTitle.equals(actTitle)){
            System.out.println("Test Title PASS");
        }else{
            System.out.println("Test Title FAİL");
        }

        if (actURL.contains("youtube")){
            System.out.println("Test URL PASS");
        }else {
            System.out.println("Test URL Fail");
        }
        System.out.println("actURL : "+actURL);

        driver.navigate().to("https://www.walmart.com/");

        String walmAct=driver.getTitle();
        System.out.println("walmAct : "+walmAct);
        String walmExp="Walmart.com";
        System.out.println("walmExp : "+walmExp);

        if (walmExp.contains("Walmart.com")){
            System.out.println("Test Walmart PASS");
        }else{
            System.out.println("Test Walmart FAİL");
        }
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.close();

    }
}
