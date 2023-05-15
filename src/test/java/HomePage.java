import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){this.driver=driver;}
    public static final String CONTACTS = "//*[@id=\"sbs-562561178-1678713806326\"]/div/a";
    private static final String FREE_EVENTS  = "//*[@id=\"sbs-562561178-1678713806343\"]/div/a";
    private static final String CAREER_CENTER = "//*[@id=\"sbs-562561178-1678713806322\"]/div/a";
    private static final String MEDIA = "//*[@id=\"sbs-562561178-1678713806329\"]/div/a";
    private static final String CORPORATE_EDUCATION = "//*[@id=\"sbs-562561178-1678713806333\"]/div/a";
    private static final String COURSES = "//*[@id=\"rec562561178\"]/div/div/div[20]/a";
    private static final String HISTORY = "//*[@id=\"sbs-563872722-1679689839392\"]/div/a";
    private static final String TESTING_COURSE = ".tn-elem__5625611781679405234205 > .tn-atom";
    private static final String  GO_TO_MEDIA = "//*[@id=\"sbs-566452408-1679042434649\"]/div/a";
    private static final String SUBSCRIPTION = ".t-input-group_em:nth-child(1) .t-input";
    private static final String LOOK_ALL_MATERIALS = "//*[@id=\"sbs-563688903-1679040484154\"]/div/a";
    private static final String ERROR_MESSAGE = "t-input-error";
    private static final String SEARCH_CONTACTS = "//*[@id=\"rec472341689\"]/div/div/div[3]/h1";
    private static final String SEARCH_MEDIA = "//*[@id=\"header\"]/div[1]/p";
    private static final String SEARACH_FREE_EVENTS = "//*[@id=\"rec487651767\"]/div/div/div[3]/h1";
    private static final String SEARCH_CAREER_CENTER = "//*[@id=\"rec350865380\"]/div/div/div[3]/h1";
    private static final String SEARCH_CORP_OBUCHENIE = "#rec425993788 > div > div > div.t396__elem.tn-elem.tn-elem__4259937881636447160852 > h1 > span";
    private static final String SEARCH_COURSES = "//*[@id=\"rec567539569\"]/div/div/div[3]/h1";
    private static final String NAME_FIELD = "name";
    private static final String EMAIL_FIELD = "email";
    private static final String PHONE_NUMBER_FIELD = "tildaspec-phone-part[]";
    private static final String SUBMIT = "#form562643444 .t-submit";
    private static final String SUBMIT2 = "#form473301432 .t-submit";
    private static final String SUBMIT3 = "#form472342157 .t-submit";
    private static final String SUBMIT_SUBSCRIPTION = ".tn-form__submit:nth-child(6) > .t-submit";
    private static final String FREE ="БЕСПЛАТНО";
    private static final String START_FREE = "#rec487651778 .t-card__col:nth-child(2) .t-card__btn";
    private static final String INPUT_TEXT  ="input_1658683104957";
    private static final String BUTTON_ASK = "t650__inner-col";
    private static final String CHOOSE_COURSE = ".tn-elem__5664443331679411548099 > .tn-atom";
    private static final String BTN_GET_CONSULTATION = "#rec496233010 > div > div > div.t396__elem.tn-elem.tn-elem__4962330101650132492207 > a";
    private static final String NAME_FIELD2 = "#form496233011 #input_1495810359387";
    private static final String CLICK_EMAIL = "#form496233011 #input_1495810354468";
public void clickContacts (){
    driver.findElement(By.xpath(CONTACTS)).click();
}
public String getContacts(){
    return driver.findElement(By.xpath(SEARCH_CONTACTS)).getText();
}
public void clickFree_events(){
    driver.findElement(By.xpath(FREE_EVENTS)).click();
}
public String getFreeEvents(){
    return driver.findElement(By.xpath(SEARACH_FREE_EVENTS)).getText();
}
public void clickCareerCenter (){
    driver.findElement(By.xpath(CAREER_CENTER)).click();
}
public String getCareerCenter(){
    return driver.findElement(By.xpath(SEARCH_CAREER_CENTER)).getText();
}
public void clickMedia (){
    driver.findElement(By.xpath(MEDIA)).click();
}
public String getMedia(){
    return driver.findElement(By.xpath(SEARCH_MEDIA)).getText();
}
public void clickEducation (){
    driver.findElement(By.xpath(CORPORATE_EDUCATION)).click();
}
public String getCorporateEducation(){
    return driver.findElement(By.cssSelector(SEARCH_CORP_OBUCHENIE)).getText();
}
public void clickCourses(){
      driver.findElement(By.xpath(COURSES)).click();
  }
  public String getCourses(){
    return driver.findElement(By.xpath(SEARCH_COURSES)).getText();
  }
public void readHistory(){
    driver.findElement(By.xpath(HISTORY)).click();
}
public void Course_Testing(){
    driver.findElement(By.cssSelector(TESTING_COURSE)).click();
}
public void Go_to_media(){
    driver.findElement(By.xpath(GO_TO_MEDIA)).click();
}
public void Subscription (){
    driver.findElement(By.cssSelector(SUBSCRIPTION)).click();
}
public void SendSubscription(){
    driver.findElement(By.cssSelector(SUBSCRIPTION)).sendKeys("goloseliz@gmail.com");
}
    public void SendIncoorectEmailSubscription(){
        driver.findElement(By.cssSelector(SUBSCRIPTION)).sendKeys("123456");
    }
public void Look_all_materials (){
    driver.findElement (By.xpath(LOOK_ALL_MATERIALS)).click();
}
    public String getErrorMessage(){
        return driver.findElement(By.className(ERROR_MESSAGE)).getText();
}
public void ClickName(){
    driver.findElement(By.name(NAME_FIELD)).click();

}
public void SendName(){
    driver.findElement(By.name(NAME_FIELD)).sendKeys("Голос Элизабет");
}
    public void SendSpaceName(){
        driver.findElement(By.name(NAME_FIELD)).sendKeys("");
    }
public void ClickEmail(){
    driver.findElement(By.name(EMAIL_FIELD)).click();
}
public void SendEmail(){
    driver.findElement(By.name(EMAIL_FIELD)).sendKeys("goloseliz@gmail.com");
}
    public void SendIncorrectEmail(){
        driver.findElement(By.name(EMAIL_FIELD)).sendKeys("12345");
    }
public void ClickPhoneNumber(){
    driver.findElement(By.name(PHONE_NUMBER_FIELD)).click();
}
public void SendPhoneNumber(){
    driver.findElement(By.name(PHONE_NUMBER_FIELD)).sendKeys("(999) 999-99-99");
}
    public void SendPhoneIncorrectNumber(){
        driver.findElement(By.name(PHONE_NUMBER_FIELD)).sendKeys("(000) 000-00-00");
    }
public void Submit(){
    driver.findElement(By.cssSelector(SUBMIT)).click();
}
    public void Submit2(){
        driver.findElement(By.cssSelector(SUBMIT2)).click();
    }
    public void Submit3(){
        driver.findElement(By.cssSelector(SUBMIT3)).click();
    }
public void SubmitSubscription(){
    driver.findElement(By.cssSelector(SUBMIT_SUBSCRIPTION)).click();
}
public void ClickFree(){
    driver.findElement(By.linkText(FREE)).click();
}
public void ClickBtnStratFree(){
    driver.findElement(By.cssSelector(START_FREE)).click();
}
public void ClickInputText(){
    driver.findElement(By.id(INPUT_TEXT)).click();
}
public void SendText(){
    driver.findElement(By.id(INPUT_TEXT)).sendKeys("Test");
}
public void ClickBtnAsk(){
    driver.findElement(By.className(BUTTON_ASK)).click();
}
public void ClickCourse (){
    driver.findElement(By.cssSelector(CHOOSE_COURSE)).click();
}
public void ClickGetConsultation(){
    driver.findElement(By.cssSelector(BTN_GET_CONSULTATION)).click();
}
public void ClickNAme2(){
    driver.findElement(By.cssSelector(NAME_FIELD2)).click();

}
public void InputName(){
   driver.findElement(By.cssSelector(NAME_FIELD2)).sendKeys("Элизабет Голос");
}
public void ClickEmail2(){
    driver.findElement(By.cssSelector(CLICK_EMAIL)).click();
}
public void InputEmail(){
    driver.findElement(By.cssSelector(CLICK_EMAIL)).sendKeys("goloseliz@gmail.com");
}
public void SendNumber(){
    driver.findElement(By.cssSelector("#form496233011 .t-input > .t-input")).click();
    driver.findElement(By.cssSelector("#form496233011 .t-input > .t-input")).sendKeys("(999) 999-99-99");
}
public void SendRequest(){
    driver.findElement(By.cssSelector(".t-form__submit:nth-child(9) > .t-submit")).click();

}
public void SendName1(){
    driver.findElement(By.id("input_1495810359387")).click();
    driver.findElement(By.id("input_1495810359387")).sendKeys("Голос Элизабет");

}
public void SendEmail1(){
    driver.findElement(By.id("input_1495810354468")).click();
    driver.findElement(By.id("input_1495810354468")).sendKeys("goloseliz@gmail.com");
}
public void SendNumer1(){
    driver.findElement(By.name("tildaspec-phone-part[]")).click();
    driver.findElement(By.name("tildaspec-phone-part[]")).sendKeys("(999) 999-99-99");
}
public void ClickSubmit1(){
    driver.findElement(By.className("t-submit")).click();
}
}