package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class IzaanHomePage {
    private WebDriver driver;

    @FindBy(xpath = "//a[@href='/signIn']")
    WebElement signInButton;
    @FindBy(xpath = "/html/body/app-root/app-common-layout/app-signin/section/div/div/div[3]/div/button")
    WebElement traineeSignin;

    public void signIn(WebDriver driver) throws InterruptedException {
        Actions act = new Actions(driver);
        act.moveByOffset(1199, 38).perform();
        act.build().perform();
        Thread.sleep(3000);
        signInButton.click();

    }
    public void trainLogin(){
        traineeSignin.click();
    }


}
