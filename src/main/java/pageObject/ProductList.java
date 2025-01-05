package pageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class ProductList {
    public SelenideElement
            menu = $("[aria-label='Open menu']"),
            category = $(byText("DRESSES")),
            discountFilter = $(byText("discount")),
            percentage = $(byText("30% - 40%")),
            colorFilter = $(byText("colour")),
            chosenColor = $(byText("Burgundy"));
}
