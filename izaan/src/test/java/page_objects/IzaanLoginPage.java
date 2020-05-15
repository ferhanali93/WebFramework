package page_objects;

import application_page_base.ApplicationPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class IzaanLoginPage {
     private WebDriver driver ;
    @FindBy(how = How.ID, id = "email")
    private WebElement emailBox;

    @FindBy(how = How.ID, id = "passwd")
    private WebElement passwordBox;

    @FindBy(how = How.CLASS_NAME, css = "#center_column > div.alert.alert-danger > p")
    private WebElement errorMessage;

    @FindBy(how = How.ID, id = "SubmitLogin")
    private WebElement submitButton;

   // @FindBy(how = How.TAG_NAME, tagName = "input")
  //  private List<WebElement> inputTag =

    public void login(String email, String password) throws InterruptedException {

        ApplicationPageBase.sendKeys("email address box", emailBox, email);
        ApplicationPageBase.sendKeys("password box", passwordBox, password);
        Thread.sleep(4000);
        ApplicationPageBase.click(submitButton, "submit button");

    }


   /* public LoginPage login(String email, String password){

        ApplicationPageBase.sendKeys(inputTag.get(6), "emailBox", email);
        ApplicationPageBase.sendKeys(inputTag.get(7),"passwordBox", password);
        ApplicationPageBase.click(submitButton,"submitButton");

        return new LoginPage();

    }*/

    // In page class no assertion shall be done
    public String getErroMessage(){

        String actualText = ApplicationPageBase.getText(errorMessage,"errorMessage");

        return actualText;
    }


    /*public LoginPage login(String email, String password){

        TestLogger.log("Sending keys to email box");
        sendKeys(emailBox,"emailBox", email);
        sendKeys(passwordBox,"passwordBox",password);


        return new LoginPage();

    }*/



}
