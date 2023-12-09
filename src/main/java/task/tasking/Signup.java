package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.FormAuthentication;
import ui.FormSignup;
import ui.HomePageUI;

public class Signup {

    public static void as(WebDriver webDriver, String fullName, String email, String pwdLogin) {
        Click.on(webDriver, HomePageUI.formSingup);
        Enter.text(webDriver, FormSignup.fullName, fullName);
        Enter.text(webDriver, FormSignup.email, email);
        Enter.text(webDriver, FormSignup.passwordLogin, pwdLogin);
        Click.on(webDriver, FormSignup.terms);
        Click.on(webDriver, FormSignup.signupButton);
        Click.on(webDriver, FormAuthentication.logoutButton);
    }
}
