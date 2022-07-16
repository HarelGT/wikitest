import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static org.openqa.selenium.By.*;

public class mytest {
    @BeforeClass
    public static void setupclass() {
        WebDriverManager.firefoxdriver().setup();
    }
    @Test
    public void testOne() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get(helper.CAT);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void testTwo() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get(helper.CAT);
        Thread.sleep(3000);
        driver.findElement(By.id("searchInput")).sendKeys("dog");
        driver.findElement(By.id("searchInput")).sendKeys(Keys.RETURN);
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void testThree() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get(helper.CAT);
        driver.findElement(By.className("image")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.quit();
    }


    @Test
    public void testFour() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://en.wikipedia.org/wiki/Cat");
        Thread.sleep(3000);
        WebElement element = driver.findElement(id("siteSub"));
        String meow = element.getText();
        System.out.println(meow);
        driver.quit();
        }

    @Test
    public void testFive() throws InterruptedException, IOException {
    WebDriver driver = new FirefoxDriver();
    driver.get(helper.CAT);
    Thread.sleep(3000);
    File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(file, new File(helper.MYFOLDER + "kittymain" + helper.JPG));
    Thread.sleep(3000);
    driver.quit();
}




}
