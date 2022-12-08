package locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class Locators {

    public static By select_country = AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry");
    public static By option_country = AppiumBy.xpath("//android.widget.ListView/android.widget.TextView");
    public static By input_name = AppiumBy.id("com.androidsample.generalstore:id/nameField");
    public static By radio_female = AppiumBy.id("com.androidsample.generalstore:id/radioFemale");
    public static By radio_male = AppiumBy.id("com.androidsample.generalstore:id/radioMale");
    public static By button_letsShop = AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop");
    public static By card_item_name = AppiumBy.xpath("(//android.widget.TextView[@resource-id='com" +
            ".androidsample.generalstore:id/productName'])[1]");
    public static By button_item_cart = AppiumBy.xpath("(//android.widget.TextView[@resource-id='com" +
            ".androidsample.generalstore:id/productAddCart'])[1]");
    public static By button_cart = AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart");
    public static By label_cartItem_name = AppiumBy.id("com.androidsample.generalstore:id/productName");

}
