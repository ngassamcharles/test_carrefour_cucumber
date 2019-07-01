package tests.stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import homePage.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SearchSteps {

    protected WebDriver driver;
    protected HomePage homePage;


    @Given("I launch the home page")
    public void launch(){
        homePage = new HomePage(driver);
        homePage.goToUrl();
    }

    @And("I enter milk for search")
    public void enterWord(String word){
        homePage.search(word);
    }

    @And("I select the first product")
    public void selectProduct(){
        homePage.selectProduct();
    }

    @Then("Should get the details of product")
    public void verifiyDetails(){
        Assert.assertTrue(homePage.isImageDisplayed());
    }

    @Before
     public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\testtechnique\\src\\test\\resources\\Webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void quitDriver(){
        this.driver.quit();
    }
}
