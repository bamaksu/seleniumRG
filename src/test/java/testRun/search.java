package testRun;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class search {
    private static WebDriver driver;
    public static void main(String[]args) throws InterruptedException {
//  open browser
        System.setProperty("webdriver.chrome.driver", "/Users/naufalprayogo/Automation/ruangGuru/selenium/src/test/java/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://skillacademy.com/");
        System.out.println("Sukses ke link " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Kursus & Kelas Online Bersertifikat Terbaik | Skill Academy");

//    search
        WebDriverWait search = new WebDriverWait(driver,30);
        search.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]"))));
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")).sendKeys("instagram", Keys.ENTER);

//        show validasi pencarian teratas
        WebElement showPencarian = driver.findElement(By.xpath("//h2[contains(text(),'Sukses Bisnis Online Shop di Instagram')]"));
        System.out.println("result : " + showPencarian.getText());
        Assert.assertEquals(showPencarian.getText().toString(), "Sukses Bisnis Online Shop di Instagram");

//        Close Browser
        driver.close();
        driver.quit();


//


    }
}
