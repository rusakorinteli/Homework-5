package stepObject;

import io.qameta.allure.Step;
import pageObject.RegistrationPage;

public class RegistrationPageSteps extends RegistrationPage {

    @Step("click login button")
    public RegistrationPageSteps clickLogin(){
         logInBtn.click();
         return this;
     }

    @Step("click registartion button")
    public RegistrationPageSteps goToRegistrationPage(){
        regBtn.click();
        return this;
    }

    @Step("set value for email field")
    public RegistrationPageSteps eMailField(String email){
        mailField.setValue(email);
        return this;
    }

    @Step("set value for password field")
    public RegistrationPageSteps pasWordField(String email){
        passWord.setValue(email);
        return this;
    }

    @Step("set value for name field")
    public RegistrationPageSteps nameField(String naMe){
        name.setValue(naMe);
        return this;
    }

    @Step("set value for surname field")
    public RegistrationPageSteps surNameField(String surname){
        surName.setValue(surname);
        return this;
    }

    @Step("set value for phone field")
    public RegistrationPageSteps phoneField(String phone){
        phoneNum.setValue(phone);
        return this;
    }

    @Step("click on checkbox")
    public RegistrationPageSteps clickbox(){
        chkBx.click();
        return this;
    }

    @Step("click on second checkbox")
    public RegistrationPageSteps clickBox2(){
        chkbx2.click();
        return this;
    }

    @Step("click on create account button")
    public RegistrationPageSteps clickCreateAcBtn(){
        createAcBtn.click();
        return this;
    }


}
