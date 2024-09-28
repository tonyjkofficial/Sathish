package xyz.stepdef;

import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import xyz.runner.KvsPage;
import xyz.runner.PageClass;

public class KvsStepDef {
    KvsPage kvsPage;


    @When("User launch URL")
    public void user_launch_url() {

        kvsPage = new KvsPage();
        kvsPage.browserLaunch();
    }

    @When("User Enter Main Page")
    public void userEnterMainPage() {

        kvsPage.verifyLogo();
        
    }

    @Then("Validate {string} on Main Page")
    public void validateOnMainPage(String field) {
        kvsPage.validateTitle(field);
    }
}
