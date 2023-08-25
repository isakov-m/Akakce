package Senol;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OrderBoxCheck extends BaseDriver {

    @Test

    public void orderBox(){

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

        WebElement Menu= driver.findElement(By.cssSelector("a[id='H_a_v8']"));
        //WebElement Hesap= driver.findElement(By.xpath("//a[text()='Hesabım']"));

        Actions aksiyonDriver=new Actions(driver);


        MyFunc.Bekle(2);
        aksiyonDriver.moveToElement(Menu).build().perform();
        MyFunc.Bekle(2);
        // aksiyonDriver.moveToElement(Hesap).build().perform();
        //MyFunc.Bekle(2);
        //Hesap.click();
        //MyFunc.Bekle(2);


        WebElement Hesap= driver.findElement(By.xpath("//a[text()='Hesabım']"));
        Hesap.click();
        MyFunc.Bekle(2);

        WebElement MyOrder= driver.findElement(By.cssSelector("li[class='order first']>:nth-child(2)"));
        MyOrder.click();

        WebElement OrderBox= driver.findElement(By.cssSelector("div[class='no-record']"));

        Assert.assertTrue(OrderBox.getText().equals("Kayıtlı siparişiniz bulunmuyor."));


        BekleVeKapat();





    }
}
