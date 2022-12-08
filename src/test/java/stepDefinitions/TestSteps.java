package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.Locators;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.time.temporal.ChronoUnit;
import java.util.Locale;

import static java.time.temporal.ChronoUnit.SECONDS;
import static org.junit.Assert.assertEquals;

public class TestSteps extends PageObject {

    public static String itemName = "";
    public static String cart_itemName = "";

    @Given("fill the information form with {string} {string} {string}")
    public void fillTheInformationFormWith(String country, String name, String gender) {
        setImplicitTimeout(20, SECONDS);
        clickOn(element(Locators.select_country));

        for (WebElementFacade element : $$(Locators.option_country)) {
            if (element.getText().equals(country)) {
                clickOn(element);
                break;
            }
        }

        typeInto(element(Locators.input_name), name);

        if (gender.equalsIgnoreCase("Male")) {
            clickOn(element(Locators.radio_male));
        } else if (gender.equalsIgnoreCase("Female")) {
            clickOn(element(Locators.radio_female));
        }
    }

    @When("click on Lets Shop button")
    public void clickOnLetsShopButton() {
        clickOn(element(Locators.button_letsShop));
    }

    @And("add first item to the cart")
    public void addFirstItemToTheCart() {
        itemName = textOf(Locators.card_item_name);
        clickOn(element(Locators.button_item_cart));
    }

    @Then("click on cart button")
    public void clickOnCartButton() {
        clickOn(element(Locators.button_cart));
    }

    @And("verify the selected product in cart")
    public void verifyTheSelectedProductInCart() {
        cart_itemName = textOf(Locators.label_cartItem_name);
        assertEquals(itemName, cart_itemName);
    }

}
