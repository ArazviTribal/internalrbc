package com.rbc.test.features;

import com.rbc.test.steps.serenity.BasePageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class StartFeature {
    @Managed(uniqueSession = true, driver = "chrome")
    public WebDriver webDriver;

    @Steps
    public BasePageSteps basePageSteps;

    @Test
    public void User_Can_Go_Through_Happy_Path() throws Throwable {

        // GIVEN
        basePageSteps.i_am_a_visitor_on_the_homepage();

        // AND
        basePageSteps.i_can_click_the_first_lets_go_button();
        basePageSteps.i_can_click_the_i_have_a_partner_button();
        basePageSteps.i_can_click_the_my_spouse_has_their_own_package_button();
        basePageSteps.i_can_click_the_yes_i_want_to_coordinate_package();
        Thread.sleep(3000);
    }
}
