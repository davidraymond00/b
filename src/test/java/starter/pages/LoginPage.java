package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    private By fieldEmail(){ return By.xpath("//div[label[text() = 'Email']]/input");}

    private By fieldPassword(){ return By.xpath("//div[label[text() = 'Password']]/input");}

    private By loginButton(){ return By.xpath("//button/span[text() = 'Login']");}

    private By errorMessage(){ return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[1]");}

    private By errorPasswordMsg(){ return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[1]");}

    private By errorEmailMsg(){ return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[1]");}

    private By recordNot() { return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[1]");}

    public void openUrl(){ openAt("/");}

    public void inputEmail(String email) { $(fieldEmail()).type(email);}

    public void inputPassword(String password) { $(fieldPassword()).type((password));}

    public void clickLoginBtn() { $(loginButton()).click();}

    public void errorMessageDisplayed() { $(errorMessage()).isDisplayed();}

    public void errorPasswordMessage() { $(errorPasswordMsg()).isDisplayed();}

    public void errorEmailMessage() { $(errorEmailMsg()).isDisplayed();}

    public void recordNotFound() { $(recordNot()).isDisplayed();}

}
