package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver;
    //###___Login-modals___###
    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    WebElement linkLogin;
    @FindBy(xpath = "//input[@id='id_userLoginId']")
    WebElement txtEmail;
    @FindBy(xpath = "//input[@id='id_password']")
    WebElement txtPassword;
    @FindBy(xpath = "//button[contains(text(),'Sign In')]")
    WebElement btnSubmit;
    @FindBy(xpath = "//a[contains(text(),'Sign Out')]")
    WebElement btnSignOut;
    @FindBy(xpath = " //a[contains(text(),'reset your password.')]")
    WebElement resetPW;
    @FindBy(xpath = " //a[contains(text(),'create a new account')]")
    WebElement regNewAcc;
    @FindBy(xpath = " //h1[@data-uia='password-reset-header']")
    WebElement forgotPWmsg;
    public Login(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void doLogin(String email,String password) throws InterruptedException {
        linkLogin.click();
        Thread.sleep(1000);
        txtEmail.sendKeys(email);
        txtPassword.sendKeys(password);
        Thread.sleep(1000);
        btnSubmit.click();

    }
}
