package Tuba;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Logout extends BaseDriver{

        @Test
        public void Test() {

            driver.get("https://www.akakce.com/");
            MyFunc.Bekle(2);

            WebElement loginBegin= driver.findElement(By.xpath(" //div[@id='H_rl_v8']/a[2]"));
            loginBegin.click();
            MyFunc.Bekle(1);

            WebElement TypeEmail= driver.findElement(By.xpath(" //input[@id='life' and @type='email']"));
            TypeEmail.sendKeys("senoldogan2018@gmail.com");
            MyFunc.Bekle(1);

            WebElement TypePassword= driver.findElement(By.xpath("(//input[@class='t' and @type='password'])[1]"));
            TypePassword.sendKeys("Senol1988++");
            MyFunc.Bekle(1);

            WebElement RememberMeOff= driver.findElement(By.xpath("//input[@class='c' and @type='checkbox']"));
            RememberMeOff.click();
            MyFunc.Bekle(1);

            WebElement loginClcik= driver.findElement(By.xpath("//input[@type='submit' and @class='s' and @value='Giriş yap']"));
            loginClcik.click();
            MyFunc.Bekle(2);

            WebElement hesap = driver.findElement(By.xpath("//a[@id='H_a_v8']"));
            Actions actions = new Actions(driver);

            Action action = actions.moveToElement(hesap).build();
            action.perform();
            MyFunc.Bekle(2);

            WebElement Logout = driver.findElement(By.xpath("//a[@href='#Çık']"));
            Logout.click();

            WebElement hesapAc = driver.findElement(By.xpath("(//a[text()='Hesap Aç'])[1]"));


//        Assert.assertTrue(hesapAc.getText().contains("Hesap Aç"));

        /*
        System.out.println("Oturum kapatmak için 'cikis' yazın.");


        Logout.click();
        System.out.println("Oturum kapatıldı. Giriş sayfasına yönlendiriliyorsunuz.");


        WebElement loginBegin = driver.findElement(By.xpath(" //div[@id='H_rl_v8']/a[2]"));

         */
            BekleVeKapat();


        }
    }

