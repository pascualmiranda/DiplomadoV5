package ui;

import org.openqa.selenium.By;

public class FormAuthentication {

    public static By username = By.xpath("//div[@id='HPloginDiv']/div[1]/input[1]");
    public static By password = By.xpath("//div[@id='HPloginDiv']//input[2]");
    public static By loginButton = By.xpath("//div[@id='HPloginDiv']/div[1]//input[@class='HPLoginBtn']");

    public static By alertSuccess = By.xpath("//div[@id='CurrentProjectTitle']");
    public static By alertError = By.xpath("//*[@id=\"ErrorMessageText\"]");

    public static By logoutButton = By.xpath("//a[.='Logout']");
}
