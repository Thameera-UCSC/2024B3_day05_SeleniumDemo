import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EbaySearchDemo {

    WebDriver driver;

    @BeforeTest
    public void configEnv(){
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        //driver.navigate().to("https://www.ebay.com/");
    }



    @Test
    public void iphoneSearch() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='gh-ac']")).click();
        driver.findElement(By.xpath("//input[@id='gh-ac']")).clear();
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("iphone");
        Thread.sleep(2000);
        driver.findElement(By.id("gh-btn")).click();
        Thread.sleep(2000);
        
    }

    @AfterTest
    public void endTest(){
        driver.quit();
    }
}
