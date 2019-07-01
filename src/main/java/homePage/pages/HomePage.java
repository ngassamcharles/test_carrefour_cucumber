package homePage.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

    protected WebDriver driver;


    @FindBy(id = "search-bar-input")
    public WebElement barreDeRecherche;

    @FindBy(xpath = "//span[contains(.,'Lait bio demi-écrémé CARREFOUR BIO')]")
    public WebElement product;

    //Verifier que l'image est présente
    @FindBy(xpath = "//div[@class='pdp-hero__images']//div[@class='carousel__siema']")
    public WebElement image;


    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void goToUrl(){
        this.driver.get("https://www.carrefour.fr/");
    }

    public void search(String word){
        barreDeRecherche.sendKeys(word);
        barreDeRecherche.sendKeys(Keys.ENTER);
    }

    public void selectProduct(){
        this.product.click();
    }

    public boolean isImageDisplayed(){
        return this.image.isDisplayed();
    }
}
