package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_TekrarLessCode {
    public static void include(String x,String y){
        if (x.contains(y)){
            System.out.println(x +" içeriyor "+y+" 'yi -->"+"Test PASS");
        }else{
            System.out.println(x +" içermiyor "+y+" 'yi -->"+"Test FAİL");
        }

    };
    public static void same(String x,String y){
        if (x.equals(y)){
            System.out.println(x +" ile "+y+" aynı -->"+"Test PASS");
        }else {
            System.out.println(x+" ile "+y+" aynı değil --> "+"Test Fail");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        //Tekrar Testi
        //1. Yeni bir class olusturun (TekrarTesti)

        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc1\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
        //(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin

        driver.get("https://www.youtube.com");

        String actYoutube= driver.getTitle();//başlığı getirir
        String expYoutube="youtube";

        same(actYoutube,expYoutube);


        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
        //URL'yi yazdırın.

        String actURL= driver.getCurrentUrl();
        String expURL="youtube";

        include(actURL,expURL);

        Thread.sleep(2000);//-->bir süre beklemesi için

        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/

        driver.navigate().to("https://www.amazon.com/");//-->bulunduğumuz sayfadan bir sonraki sayfaya gitmek için kullanılır

        //5. Youtube sayfasina geri donun

        Thread.sleep(1000);

        driver.navigate().back();//bi önceki sayfaya döner

        //6. RefrSayfayi yenileyin

        driver.navigate().refresh();//sayfayı yeniler

        //7. Amazon sayfasina donun

        driver.navigate().forward();//geri gelinen sayfaya tekrar döner

        //8. Sayfayi tamsayfa yapin

        driver.manage().window().maximize();//-->sayfayı tam sayfa yapar

        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
        //doğru başlığı(Actual Title) yazdırın.

        String ActAmznTitle= driver.getTitle();
        String ExpAmznTitle="Amazon";

        include(ActAmznTitle,ExpAmznTitle);

        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın(equals), degilse doğru
        //URL'yi yazdırın

        String ActAmznURL=driver.getCurrentUrl();//-->sayfanın Doğru URL'sini getirir.
        String ExpAmaznURL="https://www.amazon.com/";

        same(ActAmznURL,ExpAmaznURL);

        //11.Sayfayi kapatin
        //driver.close();//-->sayfayı kapatır
        driver.quit();//-->bu da tüm browserları kapatır.
    }
}
