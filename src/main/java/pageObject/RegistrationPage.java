package pageObject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    public SelenideElement
                 logInBtn = $(byText("LOG IN")),
                 regBtn = $(byText("Register")),
                 mailField = $(byName("email")),
                 passWord = $(byName("password")),
                 name = $(byName("firstName")),
                 surName = $(byName("lastName")),
                 phoneNum = $(byName("phone.number")),
                 chkBx = $(byText("I want to receive personalised commercial communications from")),
                 chkbx2 = $(byText("I have read and understand the")),
                 createAcBtn = $(byText("Create Account"));
}
