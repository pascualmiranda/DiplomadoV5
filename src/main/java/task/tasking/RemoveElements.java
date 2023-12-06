package task.tasking;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.AddRemove;
import ui.HomePageUI;

public class RemoveElements {

    public static void as(WebDriver driver){
        Click.on(driver, HomePageUI.addRemove);
        Click.on(driver, AddRemove.add);
        Click.on(driver, AddRemove.remove);
    }
}
