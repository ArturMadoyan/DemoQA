package TestForDemoQa;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPage extends BasePage {
    WebDriverWait wait = new WebDriverWait(driver, 10);
    @FindBy(id = "alertButton")
    private WebElement alertButton;

    public AlertPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnAlertButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("alertButton")));
        alertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
