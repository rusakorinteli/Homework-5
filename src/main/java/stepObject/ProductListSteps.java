package stepObject;

import io.qameta.allure.Step;
import pageObject.ProductList;

public class ProductListSteps extends ProductList {

    @Step("click menu button")
    public ProductListSteps clickMenu(){
        menu.click();
        return this;
    }

    @Step("click dresses category")
    public ProductListSteps clickCategory(){
        category.click();
        return this;
    }

    @Step("click discount button")
    public ProductListSteps clickdiscount(){
        discountFilter.click();
        return this;
    }

    @Step("click percentage button")
    public ProductListSteps clickPercentage(){
        percentage.click();
        return this;
    }

    @Step("click color button")
    public ProductListSteps clickColorFilter(){
        colorFilter.click();
        return this;
    }

    @Step("choose and click one color button")
    public ProductListSteps clickchosenColor(){
        chosenColor.click();
        return this;
    }

}
