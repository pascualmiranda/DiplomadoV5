import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Login;
import task.tasking.Signup;
import task.validations.IsLoginErrorMessage;
import task.validations.IsLoginSuccessMessage;

public class AuthenticationTest extends BaseTest {

    private String nombreCompleto="Pascual Miranda";
    private String emailusuario = "pmm12345@email.com";
    private String contrasena = "pwd12345";

    @Test
    public void authenticationTest() {
        Signup.as(webDriver,this.nombreCompleto,this.emailusuario,this.contrasena);
        Login.as(webDriver, this.emailusuario, this.contrasena);
        //Assert.assertTrue(IsLoginSuccessMessage.visible(webDriver));
    }

}
