package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchPage {

    public static final Target PRODUCT_LED = Target.the("Product to add cart").
            locatedBy("//*[@data-productid = '550274']");

    public static final Target LED_NAME = Target.the("Product page").
            locatedBy("(//*[@class = 'product-item__name'])[3]");

    public static final Target LOADER = Target.the("Banner loader icon").
            located(By.className("spinner-loader"));

}
