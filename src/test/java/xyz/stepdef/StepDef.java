package xyz.stepdef;

import io.cucumber.java.en.When;
import xyz.runner.PageClass;

public class StepDef {
    PageClass pageClass;

    @When("User launch URL")
    public void user_launch_url() {

        pageClass = new PageClass();
        pageClass.browserLaunch();


    }

    @When("User Enters {string}")
    public void userEnters(String username) {
        pageClass.enterUserName(username);

    }

    @When("User Enters pass {string}")
    public void userEntersPass(String password) {
        pageClass.enterPassword(password);
    }

    @When("User Clicks {string}")
    public void userClicks(String menu) {
        pageClass.menu(menu);
    }
}
