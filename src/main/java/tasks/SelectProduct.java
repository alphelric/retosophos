package tasks;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static ui.SearchPage.PRODUCT_LED;
import static ui.SearchPage.LED_NAME;
import static ui.SearchPage.LOADER;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SelectProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PRODUCT_LED, isClickable()),
                Click.on(PRODUCT_LED),
                WaitUntil.the(LOADER, isNotVisible()),
                Click.on(LED_NAME));
    }

    public static SelectProduct addCart() { return Tasks.instrumented(SelectProduct.class); }
}
