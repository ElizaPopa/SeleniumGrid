package herokuapp_tests;

import implementation.WebdriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;


public class BaseTest {

    WebDriver driver;
    LoginPage loginPage;
    AppointmentPage appointmentPage;
    HomeButtonPage homeButtonPage;
    RedirectPage redirectPage;
    String configPath;
    RefreshPage refreshPage;
    BasicAjaxPage basicAjaxPage;
//    Screenshot screenshot;
    ButtonsPage buttonsPage;

    String urlDemoQA = "https://demoqa.com/";

    @BeforeMethod
    public void loginSteps() {

        driver = WebdriverManager.getChromedriver();
        loginPage = new LoginPage(driver);
        appointmentPage = new AppointmentPage(driver);
        homeButtonPage = new HomeButtonPage(driver);
        basicAjaxPage = new BasicAjaxPage(driver);
        redirectPage = new RedirectPage(driver);
        refreshPage = new RefreshPage(driver);
        buttonsPage = new ButtonsPage(driver);
//        driver.get("https://katalon-demo-cura.herokuapp.com/");
//        screenshot = new Screenshot(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void quitThePage(ITestResult result) {

//        String testName = result.getName();
//        String screenshotFileName = "screenshots/" + testName + ".png";
//        if(result.getStatus() == ITestResult.FAILURE){
//            screenshot.saveScreenshot(screenshotFileName);
//        }
        driver.quit();
        System.out.println("Test passed successfully");
    }
}

