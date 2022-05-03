package TestForDemoQa;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Text_box_page extends BasePage {
    WebDriverWait wait = new WebDriverWait(driver, 12);
    JavascriptExecutor jse = (JavascriptExecutor) driver;


    @FindBy(id = "userName")
    private WebElement fullNameField;
    @FindBy(id = "userEmail")
    private WebElement emailField;
    @FindBy(id = "currentAddress")
    private WebElement currentAddressField;
    @FindBy(id = "permanentAddress")
    private WebElement permanentAddressField;
    @FindBy(id = "submit")
    private WebElement submitButton;

    public Text_box_page(WebDriver driver) {
        super(driver);
    }

    public String fullNameField(String fullName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName")));
        fullNameField.sendKeys(fullName);
        return fullName;
    }

    public String emailField(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userEmail")));
        emailField.sendKeys(email);
        return email;
    }

    public String currentAddressField(String currentAddress) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("currentAddress")));
        currentAddressField.sendKeys(currentAddress);
        return currentAddress;
    }

    public String permanentAddressField(String permanentAddress) {
        jse.executeScript("window.scrollTo(0,280);"); //to be visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("permanentAddress")));
        permanentAddressField.sendKeys(permanentAddress);
        return permanentAddress;
    }

    public void clickOnSubmitButton() {
        jse.executeScript("window.scrollTo(0,460);"); //to be able click button
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submit")));
        submitButton.click();
    }

    public Text_box_page ticket(String fillNameField, String fillEmailField, String fillCurrentAddress, String fillPermanentAddress) {
        fullNameField.sendKeys(fillNameField);
        emailField.sendKeys(fillEmailField);
        currentAddressField.sendKeys(fillCurrentAddress);
        jse.executeScript("window.scrollTo(0,280);"); //to be visible
        permanentAddressField.sendKeys(fillPermanentAddress);
        jse.executeScript("window.scrollTo(0,460);"); //to be able click button
        submitButton.click();
        return this;
    }
}




