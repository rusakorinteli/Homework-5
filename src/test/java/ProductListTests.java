import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import stepObject.ProductListSteps;
import utils.ChromeRunner;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.sleep;

public class ProductListTests extends ChromeRunner {

    ProductListSteps productListSteps = new ProductListSteps();

    @Test
    @Description("filter products")
    public void listPositive () {
        SoftAssert softassert = new SoftAssert();
        productListSteps
                .clickMenu()
                .clickCategory()
                .clickdiscount()
                .clickPercentage()
                .clickColorFilter()
                .clickchosenColor();
        softassert.assertTrue(
                $$("#main").size() > 0,
                "At least one product should be displayed after applying filters"
        );
        softassert.assertAll();
        sleep(3000);
    }
}
