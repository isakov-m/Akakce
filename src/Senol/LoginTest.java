package Senol;


import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseDriver {

    @Test

    public void Login(){

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

        //BekleVeKapat();


    }
}
