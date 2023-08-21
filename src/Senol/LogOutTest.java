package Senol;


import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LogOutTest extends BaseDriver {

    @Test

    public void LogOut(){


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
        MyFunc.Bekle(5);

        WebElement element= driver.findElement(By.xpath("//a[@id='H_a_v8']"));
        MyFunc.Bekle(2);

        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.moveToElement(element).build();
        MyFunc.Bekle(2);
        aksiyon.perform();
        MyFunc.Bekle(2);

        WebElement cikisYap=driver.findElement(By.xpath("//a[text()='Çık']"));
        cikisYap.click();
        MyFunc.Bekle(3);




        //BekleVeKapat();

    }
}
