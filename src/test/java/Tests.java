import org.junit.After;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Tests {
    private static WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;


    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://skillfactory.ru/");
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
    public String waitForWindow(int timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Set<String> whNow = driver.getWindowHandles();
        Set<String> whThen = (Set<String>) vars.get("window_handles");
        if (whNow.size() > whThen.size()) {
            whNow.removeAll(whThen);
        }
        return whNow.iterator().next();
    }

    @Test
    public void Test1_contacts() {
        driver.findElement(By.xpath("//*[@id=\"sbs-562561178-1678713806326\"]/div/a")).click();
        }

    @Test
    public void Test2_Free_events() {
        driver.findElement(By.xpath("//*[@id=\"sbs-562561178-1678713806343\"]/div/a"));
    }
    @Test
    public void Test3_career_center() {
        driver.findElement(By.xpath("//*[@id=\"sbs-562561178-1678713806322\"]/div/a")).click();
    }
    @Test
    public void Test4_media() {
        driver.findElement(By.xpath("//*[@id=\"sbs-562561178-1678713806329\"]/div/a")).click();
    }
    @Test
    public void Test5_corporativnoye_obuchenye() {
        driver.findElement(By.xpath("//*[@id=\"sbs-562561178-1678713806333\"]/div/a")).click();
    }
    @Test
    public void Test6_courses() {
        driver.findElement(By.xpath("//*[@id=\"rec562561178\"]/div/div/div[20]/a")).click();
    }
    @Test

    public void Test7_sign_up_for_a_course() {

        driver.findElement(By.cssSelector(".tn-elem__5625611781679405234205 > .tn-atom")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".tn-elem__5608766611679951555527 > .tn-atom"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.cssSelector(".tn-elem__5608766611679951555532 > .tn-atom")).click();
        vars.put("win6219", waitForWindow(2000));
        driver.switchTo().window(vars.get("win6219").toString());
        driver.findElement(By.linkText("Записаться на курс")).click();
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.id("input_1495810359387")).click();
        driver.findElement(By.id("input_1495810359387")).sendKeys("Голос Элизабет");
        driver.findElement(By.id("input_1495810354468")).click();
        driver.findElement(By.id("input_1495810354468")).sendKeys("goloseliz@gmail.com");
        driver.findElement(By.name("tildaspec-phone-part[]")).click();
        driver.findElement(By.name("tildaspec-phone-part[]")).sendKeys("(999) 999-99-99");
        driver.findElement(By.className("t-submit")).click();
    }
    @Test
    public void Test8_send_contact (){
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).sendKeys("Голос Элизабет");
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys("goloseliz@gmail.com");
        driver.findElement(By.name("tildaspec-phone-part[]")).click();
        driver.findElement(By.name("tildaspec-phone-part[]")).sendKeys("(999) 999-99-99");
        driver.findElement(By.cssSelector("#form562643444 .t-submit")).click();
    }
    @Test
    public void Test9_get_consulation ()  {

        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.cssSelector(".tn-elem__5664443331679411548099 > .tn-atom")).click();
        vars.put("win8852", waitForWindow(2000));
        driver.switchTo().window(vars.get("win8852").toString());
        driver.findElement(By.cssSelector("#rec496233010 > div > div > div.t396__elem.tn-elem.tn-elem__4962330101650132492207 > a")).click();
        driver.findElement(By.cssSelector("#form496233011 #input_1495810359387")).click();
        driver.findElement(By.cssSelector("#form496233011 #input_1495810359387")).sendKeys("Элизабет Голос");
        driver.findElement(By.cssSelector("#form496233011 #input_1495810354468")).click();
        driver.findElement(By.cssSelector("#form496233011 #input_1495810354468")).sendKeys("goloseliz@gmail.com");
        driver.findElement(By.cssSelector("#form496233011 .t-input > .t-input")).click();
        driver.findElement(By.cssSelector("#form496233011 .t-input > .t-input")).sendKeys("(999) 999-99-99");
        driver.findElement(By.cssSelector(".t-form__submit:nth-child(9) > .t-submit")).click();

    }
}