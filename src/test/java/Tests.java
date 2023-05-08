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
        homePage.SendName1();
        homePage.SendEmail1();
        homePage.SendNumer1();
        homePage.ClickSubmit1();
    }
    @Test
    public void Test8_send_contact (){
       homePage.ClickName();
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
      homePage.ClickCourse();
        vars.put("win8852", waitForWindow(2000));
        driver.switchTo().window(vars.get("win8852").toString());
        homePage.ClickGetConsultation();
        homePage.ClickNAme2();
        homePage.InputName();
        homePage.ClickEmail2();
        homePage.InputEmail();
        homePage.SendNumber();
        homePage.SendRequest();

    }
    @Test
    public void Test10_read_the_history(){
        homePage.readHistory();
    }
    @Test
    public void Test11_Ask(){
        homePage.clickContacts();
        homePage.ClickBtnAsk();
        homePage.SendName();
        homePage.ClickEmail();
        homePage.SendEmail();
        homePage.ClickPhoneNumber();
        homePage.SendPhoneNumber();
        homePage.ClickInputText();
        homePage.SendText();
        homePage.Submit3();
    }
    @Test
    public void Test12_go_to_media (){
        homePage.Go_to_media();
    }

    @Test
    public void Test13_subscription (){
        homePage.Subscription();
        homePage.SendSubscription();
        homePage.SubmitSubscription();
    }
    @Test
    public void Test14_Free_registration() {

        homePage.ClickFree();
        vars.put("window_handles", driver.getWindowHandles());
        homePage.ClickBtnStratFree();
        vars.put("win9864", waitForWindow(2000));
        driver.switchTo().window(vars.get("win9864").toString());
        homePage.ClickEmail();
        homePage.SendEmail();
        homePage.ClickPhoneNumber();
        homePage.SendPhoneNumber();
        homePage.Submit2();
    }
    @Test
    public void Test15_look_all_materials (){
      homePage.Look_all_materials();
    }
    @Test
    public void Test16_negative_send_contacts(){
    String Current_message = "Укажите, пожалуйста, корректный email";
    homePage.ClickName();
    homePage.SendName();
    homePage.ClickEmail();
    homePage.SendIncorrectEmail();
    homePage.ClickPhoneNumber();
    homePage.SendPhoneNumber();
    homePage.Submit();
    Assert.assertEquals(Current_message,driver.findElement(By.xpath("//*[@id=\"form562643444\"]/div[2]/div[2]/div/div")).getText());
        }
    @Test
    public void Test17_negative_subscription_Email (){
        String Current_Message = "Укажите, пожалуйста, корректный email";
        homePage.Subscription();
        homePage.SendIncoorectEmailSubscription();
        homePage.SubmitSubscription();
        Assert.assertEquals(Current_Message, driver.findElement(By.xpath("//*[@id=\"form572934623\"]/div[2]/div[1]/div/div")).getText());
}
    @Test
    public void Test18_negative_SendContacts_IncorrectPhoneNumber(){
        String Current_Message = "Укажите, пожалуйста, корректный номер телефона";
        homePage.ClickName();
        homePage.SendName();
        homePage.ClickEmail();
        homePage.SendEmail();
        homePage.ClickPhoneNumber();
        homePage.SendPhoneIncorrectNumber();
        homePage.Submit();
        Assert.assertEquals(Current_Message,driver.findElement(By.xpath("//*[@id=\"form562643444\"]/div[2]/div[3]/div/div[2]")).getText());

}
    @Test
    public void Test19_Send_Contacts_SpaceField(){
        homePage.ClickName();
        homePage.SendSpaceName();
        homePage.ClickEmail();
        homePage.SendEmail();
        homePage.ClickPhoneNumber();
        homePage.SendPhoneNumber();
        homePage.Submit();
        Assert.assertEquals("Обязательное поле",driver.findElement(By.xpath("//*[@id=\"form562643444\"]/div[2]/div[1]/div/div")).getText());
    }

}