package utils;


import org.testng.annotations.BeforeTest;
import static com.codeborne.selenide.Selenide.*;

public class CromeRunner {
    @BeforeTest
    public void setUp(){
        open();
    }
}
