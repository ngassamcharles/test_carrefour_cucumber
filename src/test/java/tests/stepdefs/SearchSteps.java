package tests.stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import homePage.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;

public class SearchSteps {

    protected WebDriver driver;
    protected HomePage homePage;

    protected static ChromeDriverService service;

    @Given("I launch the home page")
    public void launch(){
        homePage = new HomePage(driver);
        homePage.goToUrl("https://www.carrefour.fr/");
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

    //Chemin d'acces au driver de Chrome différent sur Mac

    @Before
     public void setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/charlesngassam/Documents/Automation/test_carrefour/src/test/resources/Webdrivers/chromedriver");
        driver = new ChromeDriver();
    }

/*  @Before
  public static void launchChromeService() throws IOException {
      service = new ChromeDriverService.Builder()
              .usingDriverExecutable(new File("/Users/charlesngassam/Documents/Automation/test_carrefour/src/test/resources/Webdrivers/chromedriver"))
              .usingAnyFreePort()
              .build();
      service.start();
  }*/

    @After
    public void quitDriver(){
        this.driver.quit();
    }
}
