package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import ui.WongUrl;

public class OpenWong implements Task {

    public OpenWong() {}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().the(WongUrl.class));
    }

    public static OpenWong url() { return Tasks.instrumented(OpenWong.class); }
}
