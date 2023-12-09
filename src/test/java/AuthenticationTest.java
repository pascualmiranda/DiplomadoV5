import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Login;
import task.validations.IsLoginErrorMessage;
import task.validations.IsLoginSuccessMessage;

public class AuthenticationTest extends BaseTest {

    
    @Test
    public void authenticationSuccessTest() {
        Login.as(webDriver, "pmmn23@email.com", "pwd12345");
        Assert.assertTrue(IsLoginSuccessMessage.visible(webDriver));
        Assert.assertEquals(IsLoginSuccessMessage.getTextSuccess(webDriver), "Work");

    }

    @Test
    public void authenticationFailedTest() {
        Login.as(webDriver, "pmmn123@email.com", "12345");
        Assert.assertTrue(IsLoginErrorMessage.visible(webDriver));
    }
}
