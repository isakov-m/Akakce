package Senol;


import Utlity.BaseDriver;
import Utlity.MyFunc;
import com.google.common.annotations.VisibleForTesting;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class CreateAccount extends BaseDriver {


    @Test


    public void Test1(){

        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(2);

        WebElement HesapAc=driver.findElement(By.xpath("(//*[text()='Hesap Aç'])[1] "));
        HesapAc.click();
        MyFunc.Bekle(2);

        WebElement isim= driver.findElement(By.xpath("//input[@id='rnufn']"));
        isim.sendKeys("Senol");
        MyFunc.Bekle(1);


        WebElement SoyIsim= driver.findElement(By.xpath("//input[@id='rnufs']"));
        SoyIsim.sendKeys("Dogan");
        MyFunc.Bekle(1);

        WebElement Email= driver.findElement(By.xpath("//input[@id='rnufe1' and @type='email']"));
        Email.sendKeys("senoldogan2018@gmail.com");
        MyFunc.Bekle(1);

        WebElement EmailTekrar= driver.findElement(By.xpath("//input[@id='rnufe2' and @type='email']"));
        EmailTekrar.sendKeys("senoldogan2018@gmail.com");
        MyFunc.Bekle(1);

        WebElement password= driver.findElement(By.xpath("//input[@id='rnufp1' and @type='password']"));
        password.sendKeys("Senol1988++");
        MyFunc.Bekle(1);

        WebElement passwordTeskrar= driver.findElement(By.xpath("//input[@id='rnufp2' and @type='password']"));
        passwordTeskrar.sendKeys("Senol1988++");
        MyFunc.Bekle(1);

        WebElement Cinsiyet= driver.findElement(By.xpath("//input[@id='rngm']"));
        Cinsiyet.click();
        MyFunc.Bekle(1);

        WebElement il= driver.findElement(By.xpath("//select[@id='locpr']"));
        il.click();
        MyFunc.Bekle(1);

        WebElement ilSec= driver.findElement(By.xpath("//option[@value='6' and text()='Ankara']"));
        ilSec.click();
        MyFunc.Bekle(1);

        WebElement ilce= driver.findElement(By.xpath("//select[@id='locds']"));
        ilce.click();
        MyFunc.Bekle(1);

        WebElement ilceSec= driver.findElement(By.xpath("//option[@value='64' and text()='Çankaya']"));
        ilceSec.click();
        MyFunc.Bekle(1);

        WebElement Gun=driver.findElement(By.id("bd"));
        WebElement Ay=driver.findElement(By.id("bm"));
        WebElement Yil=driver.findElement(By.id("by"));

        Select gun=new Select(Gun);
        Select ay=new Select(Ay);
        Select yil=new Select(Yil);

        gun.selectByVisibleText("22");
        ay.selectByValue("6");
        yil.selectByVisibleText("1988");

        WebElement Anlasma= driver.findElement(By.xpath("//input[@id='rnufpca']"));
        Anlasma.click();
        MyFunc.Bekle(1);

        WebElement Hesap= driver.findElement(By.xpath("//input[@id='rfb']"));
        Hesap.click();
        MyFunc.Bekle(1);








    }
}
