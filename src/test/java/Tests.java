import org.junit.After;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
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
private HomePage homePage;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://skillfactory.ru/");
        vars = new HashMap<String, Object>();
        homePage = new HomePage(driver);
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

        homePage.clickContacts();
        Assert.assertEquals("Контактная информация",homePage.getContacts());

    }
    @Test
    public void Test2_Free_events() {
        homePage.clickFree_events();
        Assert.assertEquals("Бесплатные мероприятия и материалы",homePage.getFreeEvents());
    }
    @Test
    public void Test3_career_center() {
        homePage.clickCareerCenter();
        Assert.assertEquals("Центр карьеры",homePage.getCareerCenter());
    }
    @Test
    public void Test4_media() {
        homePage.clickMedia();
        Assert.assertEquals("Честные истории о карьере в IT", homePage.getMedia());
    }
    @Test
    public void Test5_corporativnoye_obuchenye() {
        homePage.clickEducation();
        Assert.assertEquals("Развивайте бизнес", homePage.getCorporateEducation());
    }
    @Test
    public void Test6_courses() {
        homePage.clickCourses();
        Assert.assertEquals("Онлайн-курсы по IT профессиям",homePage.getCourses());
    }
    @Test
    public void Test7_sign_up_for_a_course() {

        homePage.Course_Testing();
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
       homePage.ClickContacts();
       homePage.SendName();
       homePage.ClickEmail();
       homePage.SendEmail();
       homePage.ClickPhoneNumber();
       homePage.SendPhoneNumber();
       homePage.Submit();
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
    @Test
    public void Test10_read_the_history(){
        homePage.readHistory();
    }
    @Test
    public void Test11_Ask(){
        homePage.clickContacts();
        driver.findElement(By.className("t650__inner-col")).click();
        driver.findElement(By.id("input_1495810359387")).click();
        driver.findElement(By.id("input_1495810359387")).sendKeys("Элизабет Голос");
        driver.findElement(By.id("input_1495810354468")).click();
        driver.findElement(By.id("input_1495810354468")).sendKeys("goloseliz@gmail.com");
        driver.findElement(By.name("tildaspec-phone-part[]")).click();
        driver.findElement(By.name("tildaspec-phone-part[]")).sendKeys("(999) 999-99-99");
        driver.findElement(By.id("input_1658683104957")).click();
        driver.findElement(By.id("input_1658683104957")).sendKeys("Test");
        driver.findElement(By.cssSelector("#form472342157 .t-submit")).click();
    }
    @Test
    public void Test12_go_to_media (){
        homePage.Go_to_media();
        Assert.assertEquals("Честные истории о карьере в IT", homePage.getMedia());
    }

    @Test
    public void Test13_subscription (){
        homePage.Subscription();
        driver.findElement(By.cssSelector(".t-input-group_em:nth-child(1) .t-input")).sendKeys("goloseliz@gmail.com");
        driver.findElement(By.cssSelector(".tn-form__submit:nth-child(6) > .t-submit")).click();
    }
    @Test
    public void Test14_Free_registration() {

        driver.findElement(By.linkText("БЕСПЛАТНО")).click();
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.cssSelector("#rec487651778 .t-card__col:nth-child(2) .t-card__btn")).click();
        vars.put("win9864", waitForWindow(2000));
        driver.switchTo().window(vars.get("win9864").toString());
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys("goloseliz@gmail.com");
        driver.findElement(By.name("tildaspec-phone-part[]")).click();
        driver.findElement(By.name("tildaspec-phone-part[]")).click();
        {
            WebElement element = driver.findElement(By.name("tildaspec-phone-part[]"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
        driver.findElement(By.name("tildaspec-phone-part[]")).sendKeys("(999) 999-99-99");
        driver.findElement(By.cssSelector("#form473301432 .t-submit")).click();
    }
    @Test
    public void Test15_look_all_materials (){
      homePage.Look_all_materials();
    }
@Test
    public void Test16_negative_send_contacts(){
    String Current_message = "Укажите, пожалуйста, корректный email";
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).sendKeys("Элизабет Голос");
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys("123456");
        driver.findElement(By.name("tildaspec-phone-part[]")).click();
        driver.findElement(By.name("tildaspec-phone-part[]")).sendKeys("(999) 999-99-99");
        driver.findElement(By.cssSelector("#form562643444 .t-submit")).click();
    Assert.assertEquals(Current_message,"Укажите, пожалуйста, корректный email");
        }
@Test
    public void Test17_negative_subscription_Email (){
        homePage.Subscription();
        driver.findElement(By.cssSelector(".t-input-group_em:nth-child(1) .t-input")).sendKeys("123456");
        homePage.SubmitSubscription();
}
@Test
    public void Test18_negative_SendContacts_Phone(){
        String Current_Message = "Укажите, пожалуйста, корректный номер телефона";
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("Элизабет Голос");
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys("123456");
    driver.findElement(By.name("tildaspec-phone-part[]")).click();
    driver.findElement(By.name("tildaspec-phone-part[]")).sendKeys("(000) 000-00-00");
    driver.findElement(By.cssSelector("#form562643444 .t-submit")).click();
    Assert.assertEquals(Current_Message, "Укажите, пожалуйста, корректный номер телефона");
}
}