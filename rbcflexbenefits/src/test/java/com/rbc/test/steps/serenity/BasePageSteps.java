package com.rbc.test.steps.serenity;

import net.bytebuddy.implementation.bytecode.Throw;
import net.thucydides.core.annotations.Step;

public class BasePageSteps {
    public static com.rbc.test.pages.BasePage basePage;

    public void i_am_a_visitor_on_the_homepage() throws Throwable {
        basePage.open();
    }

    @Step
    public void i_can_click_the_first_lets_go_button() throws Throwable {
        basePage.clickLetsGo();
    }

    @Step
    public void i_can_click_the_i_have_a_partner_button() throws Throwable {
        basePage.clickYesIDo();
    }

    @Step
    public void i_can_click_the_my_spouse_has_their_own_package_button() throws Throwable {
        basePage.clickYesSpousePackage();
    }

    @Step
    public void i_can_click_the_yes_i_want_to_coordinate_package() throws Throwable {
        basePage.clickYesCoordinate();
    }

}
