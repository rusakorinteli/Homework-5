import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import stepObject.RegistrationPageSteps;
import utils.ChromeRunner;

import static dataObject.RegistrationPageData.*;

public class RegistrationPageTests extends ChromeRunner {

    RegistrationPageSteps registrationPageSteps = new RegistrationPageSteps();

    @Test
    @Description("registration with valid information")
    public void registrationSuccess () {
        SoftAssert softassert = new SoftAssert();
        registrationPageSteps
                .clickLogin()
                .goToRegistrationPage()
                .eMailField(eMail)
                .pasWordField(passWord)
                .nameField(name)
                .surNameField(surName)
                .phoneField(phoneNumber)
                .clickbox()
                .clickBox2();
        softassert.assertTrue(registrationPageSteps.createAcBtn.is(Condition.enabled));
        softassert.assertAll();
    }
}
