package tasks;

import static ui.MainPage.SELECT_CATEGORY;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import models.Article;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

public class Search implements Task {

    private List<Article> item;

    public Search(List<Article> item) { this.item = item; }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SELECT_CATEGORY, isVisible()),
                Enter.theValue(item.get(0).getItem()).into(SELECT_CATEGORY));
    }

    public static Search element(List<Article> item) { return Tasks.instrumented(Search.class, item);  }
}
