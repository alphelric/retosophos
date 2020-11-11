package ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {

    public static final Target CART_ITEM = Target.the("Added product to cart shop").
            locatedBy("(//*[@class = 'product-item__image-wrapper'])[3]");

}
