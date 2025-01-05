package stepObject;

import io.qameta.allure.Step;
import pageObject.OneProduct;

public class OneProductPageSteps extends OneProduct {

    @Step("click menu button")
    public OneProductPageSteps clickMenu() {
        menu.click();
        return this;
    }

    @Step("click dresses category")
    public OneProductPageSteps clickCategory() {
        category.click();
        return this;
    }

    @Step("click first product")
    public OneProductPageSteps clickitem() {
        product.click();
        return this;
    }

    @Step("click products size")
    public OneProductPageSteps clicksize() {
        size.click();
        return this;
    }

    @Step("select man into gender dropdown")
    public OneProductPageSteps selectGender() {
        selectgender.selectOption("Man");
        return this;
    }

    @Step("click height button")
    public OneProductPageSteps clickheightBtn() {
        heightBtn.click();
        return this;
    }

    @Step("choose height")
    public OneProductPageSteps clickheight() {
        height.click();
        return this;
    }

    @Step("click weight button")
    public OneProductPageSteps clickweightBtn() {
        weightBtn.click();
        return this;
    }

    @Step("choose weightn")
    public OneProductPageSteps clickweight() {
        weight.click();
        return this;
    }

    @Step("click continue button")
    public OneProductPageSteps clickcontinueBtn() {
        continueBtn.click();
        return this;
    }

    @Step("click end button")
    public OneProductPageSteps clickendBtn() {
        endBtn.click();
        return this;
    }

    @Step("click add button")
    public OneProductPageSteps clickaddBtn() {
        addBtn.click();
        return this;
    }

    @Step("click add to basket button")
    public OneProductPageSteps clickaddbasketBtn() {
        addBasketBtn.click();
        return this;
    }

    @Step("click see basket button")
    public OneProductPageSteps clickseebasketBtn() {
        SeebasketBtn.click();
        return this;
    }
}
