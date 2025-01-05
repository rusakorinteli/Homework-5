package utils;


import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;
import static com.codeborne.selenide.Selenide.*;

public class ChromeRunner {
    @BeforeTest(description = "browser configuration before test")
    public void setUp(){
        open("https://www.zara.com/ge/");
    }
    @AfterTest(description = "clear cookies and close window")
    public void tearDown(){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();

    }

}
