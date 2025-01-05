import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import stepObject.OneProductPageSteps;
import utils.ChromeRunner;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class OneProductTests extends ChromeRunner {

    OneProductPageSteps oneProductPageSteps = new OneProductPageSteps();

    @Test
    @Description("add product in the bag and check if product appears is in the bag")
    public void oneProductcases (){
        SoftAssert softassert = new SoftAssert();
        oneProductPageSteps
                .clickMenu()
                .clickCategory()
                .clickitem()
                .clicksize()
                .selectGender()
                .clickheightBtn()
                .clickheight()
                .clickweightBtn()
                .clickweight()
                .clickcontinueBtn()
                .clickendBtn()
                .clickaddBtn()
                .clickaddbasketBtn()
                .clickseebasketBtn();

        softassert.assertTrue(
                $(byText("ZW COLLECTION WOOL BLEND MIDI DRESS")).shouldHave(Condition.text("ZW COLLECTION WOOL BLEND MIDI DRESS")).exists(),
                "The product name should appear in the shopping bag."
        );
        softassert.assertAll();


    }
}
