package pageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class OneProduct {
    public SelenideElement
    menu = $("[aria-label='Open menu']"),
    category = $(byText("DRESSES")),
    product = $(byText("ZW COLLECTION WOOL BLEND MIDI DRESS")),
    size = $(byText("Size recommender")),
    selectgender = $(byName("Seccion")),
    heightBtn = $("[aria-label='height-menu']"),
    height = $(byText("160 cm")),
    weightBtn = $("[aria-label='weight-menu']"),
    weight = $(byText("60 kg")),
    continueBtn = $(byText("Continue")),
    endBtn = $(byText("End")),
    addBtn = $(byText("Add size M")),
    addBasketBtn = $(byText("Added to your basket")),
    SeebasketBtn = $(byText("See shopping basket"));
}
