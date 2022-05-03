package Tests;

import TestForDemoQa.AlertPage;
import TestForDemoQa.Constants;
import TestForDemoQa.Text_box_page;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class DemoQaTest extends BaseTest {
    @Test
    public void demoQaTask() {
        Text_box_page tB_Page = new Text_box_page(driver);
        driver.get(baseUrl); //opens Text Box page url.
        Assert.assertEquals(Constants.EXPECTED_PAGE_URL, driver.getCurrentUrl()); //checking that the correct url is opened.
        Assert.assertEquals(Constants.EXPECTED_TITLE, driver.getTitle()); // checking that the title is correct.
        String full_Name = tB_Page.fullNameField("Artur Madoyan"); //Setting value for name field.
        String email = tB_Page.emailField("Madoyan@gmail.com"); //Setting value for Email field.
        String current_add = tB_Page.currentAddressField("Armenia Yerevan"); //Setting value for current address.
        String perm_add = tB_Page.permanentAddressField("Armenia Yerevan Halabyan"); //Setting value for permanent address.
        tB_Page.clickOnSubmitButton(); //clicking submit button.
        Assert.assertEquals("Name:" + full_Name + '\n' + "Email:" + email + '\n' + "Current Address :" + current_add + '\n' + "Permananet Address :" + perm_add, driver.findElement(By.id("output")).getText()); // comparing the set fields with output
    }

    @Test
    public void demoTask_2() {
        driver.get(baseUrl); //opens Text Box page url
        Text_box_page tBPage = new Text_box_page(driver);
        Assert.assertEquals(Constants.EXPECTED_PAGE_URL, driver.getCurrentUrl()); //checking that the correct url is opened.
        Assert.assertEquals(Constants.EXPECTED_TITLE, driver.getTitle()); // checking that the title is correct.
        String name = "Artur";
        String email = "Artur@gmail.com";
        String current_add = "Yerevan";
        String perm_add = "Yerevan";
        tBPage.ticket("Artur", "Artur@gmail.com", "Yerevan", "Yerevan"); //making form by filling all fields
        Assert.assertEquals("Name:" + name + '\n' + "Email:" + email + '\n' + "Current Address :" + current_add + '\n' + "Permananet Address :" + perm_add, driver.findElement(By.id("output")).getText()); // comparing form with output
    }

    @Test
    public void alertTask() {
        driver.get(alertUrl); //opens Alerts page url
        AlertPage alert = new AlertPage(driver);
        alert.clickOnAlertButton(); //submitting alert.
    }
}
