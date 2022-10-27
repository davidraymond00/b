package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginStep {

    @Steps
    LoginPage loginpage;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {loginpage.openUrl(); }

    @When("I input null email")
    public void iInputNullEmail() {
        loginpage.inputEmail("");
    }

    @And("I input null password")
    public void iInputNullPassword() {
        loginpage.inputPassword("");
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginpage.clickLoginBtn();
    }

    @Then("I will get error message")
    public void iWillGetErrorMessage() {
        loginpage.errorMessageDisplayed();
    }

    @When("I input valid email")
    public void iInputValidEmail() {
        loginpage.inputEmail("siboro321@gmail.com");
    }

    @Then("I will get password required")
    public void iWillGetPasswordRequired() {
        loginpage.errorPasswordMessage();
    }

    @And("I input valid password")
    public void iInputValidPassword() {
        loginpage.inputPassword("sagalak001");
    }

    @Then("I will get email required")
    public void iWillGetEmailRequired() {
        loginpage.errorEmailMessage();
    }

    @When("I input invalid email")
    public void iInputInvalidEmail() {
        loginpage.inputEmail("siboro321@yahoo.co.id");
    }

    @Then("I will get record not found")
    public void iWillGetRecordNotFound() {
        loginpage.recordNotFound();
    }

    @And("I input invalid password")
    public void iInputInvalidPassword() {
        loginpage.inputPassword("salahhpaswrd");
    }
}
