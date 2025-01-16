package StepDepfinitaion;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.cucumber.datatable.DataTable;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class booking {
    private WebDriver driver;

    @Before
    public void beforehock() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\18042\\msedgedriver.exe");
        driver = new EdgeDriver();
    }

    @After
    public void afterhock() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

    @Given("User is on the flight booking page")
    public void user_is_on_the_flight_booking_page() {
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
    }

    @When("User enters flight details")
    public void userEntersFlightDetails(DataTable dataTable) {
        List<String> genders = dataTable.asList(String.class);
        for (String gender : genders) {
            enterFlightDetails(gender);
        }
    }

    @When("User enters flight details {string}")
    public void userEntersFlightDetails(String gender) {
        enterFlightDetails(gender);
    }

    private void enterFlightDetails(String gender) {
        WebElement pageTitle = driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > header:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > a:nth-child(1) > div:nth-child(2)"));
        String elemnettext = pageTitle.getText();
        if (elemnettext.contains("Techlistic")) {
            System.out.println("title is valid");
        } else {
            System.out.println("title is not validated");
        }

        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.clear();
        firstName.sendKeys("Ajmal");
        System.out.println("name was typed");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.clear();
        lastName.sendKeys("weyal");
        System.out.println("Last name was typed");

        List<WebElement> radios = driver.findElements(By.xpath("//input[@name='sex']"));
        for (WebElement radio : radios) {
            if (radio.getAttribute("value").equalsIgnoreCase(gender)) {
                // Scroll the element into view
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", radio);
//                // Remove the blocking iframe
//                ((JavascriptExecutor) driver).executeScript("document.getElementById('google_ads_iframe_/1254144,22662382379/techlistic_com-medrectangle-2_0').remove();");
                radio.click();
                System.out.println(gender + " radio button is selected");
                break;
            }
        }
    }

    @And("User enter years or expiriance")
    public void userExpiriance(DataTable dataTable) {
        List<String> years = dataTable.asList(String.class);
        for (String year : years) {
            enterYears(year);
            System.out.println("Years of expiriance was clicked from data table");
//            WebDriverWait wait = new WebDriverWait(driver, 10);
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='exp']")));
        }
    }
    @And("User enter years or expiriance {int}")
    public void userExpiriance(String year){
        enterYears(year);
    }
    private void enterYears(String year) {
       List<WebElement> yearsOfExp = driver.findElements(By.xpath("//input[@name='exp']"));
        yearsOfExp.clear();
        for (WebElement yearOfExp : yearsOfExp) {
                yearOfExp.click();
                System.out.println(year + " radio button is selected");
    
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
        }
    }
    @Then("User receives a booking confirmation")
    public void userReceivesBookingConfirmation() {
        // Code to verify booking confirmation
    }
}
