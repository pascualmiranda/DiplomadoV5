package ui;

import org.openqa.selenium.By;

public class FormAuthentication {

    public static By fullName = By.xpath("//div[@class='HPsignupDiv']/input[1]");
    public static By email = By.xpath("//div[@class='HPsignupDiv']/input[2]");
    public static By passwordLogin = By.xpath("//div[@class='HPsignupDiv']/input[3]");
    public static By terms = By.xpath("//label[@class='HPLoginTerms']/input[1]");
    public static By signupButton = By.xpath("//div[@class='HPsignupDiv']//input[@class='HPLoginBtn']");
    public static By username = By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxEmail\"]");
    public static By password = By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxPassword\"]");
    public static By loginButton = By.xpath("//div[@id='HPloginDiv']/div[1]//input[@class='HPLoginBtn']");

    public static By alertSuccess = By.xpath("//div[@id='CurrentProjectTitle']");
    public static By alertError = By.xpath("//*[@id=\"ErrorMessageText\"]");

    public static By logoutButton = By.xpath("//a[.='Logout']");
}
