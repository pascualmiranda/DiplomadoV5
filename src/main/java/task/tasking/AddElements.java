package task.tasking;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.AddRemove;
import ui.HomePageUI;

public class AddElements {

    public static void as(WebDriver driver){
        Click.on(driver, HomePageUI.addRemove);
        Click.on(driver, AddRemove.add);
    }
}
