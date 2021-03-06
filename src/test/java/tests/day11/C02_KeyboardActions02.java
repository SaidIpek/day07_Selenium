package tests.day11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import javax.swing.*;

public class C02_KeyboardActions02 extends TestBase {
    //1- Bir Class olusturalim D14_KeyboardActions2
    //2- https://html.com/tags/iframe/ sayfasina gidelim
    @Test
    public void test() {

        driver.get("https://html.com/tags/iframe/");

        //3- video’yu gorecek kadar asagi inin
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //4- videoyu izlemek icin Play tusuna basin

        WebElement iFrame=driver.findElement(By.className("lazy-loaded"));
        driver.switchTo().frame(iFrame);

    WebElement playTusu = driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']"));
    actions.click(playTusu).perform();

        //5- videoyu calistirdiginizi test edin

        Assert.assertFalse(playTusu.isDisplayed());








    }
}
