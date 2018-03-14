package com.rbc.test.pages;

import com.google.common.base.Predicate;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;


public class BasePage extends PageObject {

    @FindBy(css = "button.sc-bdVaJa")
    private WebElement letsGoButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[2]/button[1]/div[1]")
    private WebElement yesPartnerButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[2]/button[2]")
    private WebElement noPartnerButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[2]/button[3]")
    private WebElement inquiryPartnerButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[9]/div[1]/div[2]/button[1]")
    private WebElement spousePackageYes;

    @FindBy(id = "5a95aeb6a8525ae619e9d76e")
    private WebElement spouseCoordinateYes;

    public void clickLetsGo() throws Throwable {
        letsGoButton.click();
    }

    public void clickYesIDo() throws Throwable {
        yesPartnerButton.click();
    }

    public void clickYesSpousePackage() throws Throwable {
        spousePackageYes.click();
    }

    public void clickYesCoordinate() throws Throwable {
        Actions actions = new Actions(driver);
        spousePackageYes.click();
    }

    public BasePage(final WebDriver driver) {
        super(driver, new Predicate<PageObject>() {
            @Override
            public boolean apply(PageObject page) {
                PageFactory.initElements(driver, page);
                return true;
            }
        });
    }
}