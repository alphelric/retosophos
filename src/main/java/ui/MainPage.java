package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {

    public static final Target SELECT_CATEGORY = Target.the("select category").
            located(By.id("search-autocomplete-input"));

}