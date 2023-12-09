package ui;

import org.openqa.selenium.By;

public class FormSignup {
    public static By fullName = By.xpath("//div[@class='HPsignupDiv']/input[1]");
    public static By email = By.xpath("//div[@class='HPsignupDiv']/input[2]");
    public static By passwordLogin = By.xpath("//div[@class='HPsignupDiv']/input[3]");
    public static By terms = By.xpath("//label[@class='HPLoginTerms']/input[1]");
    public static By signupButton = By.xpath("//div[@class='HPsignupDiv']//input[@class='HPLoginBtn']");

}
