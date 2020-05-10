package page_objects_test;


import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.IzaanHomePage;

class IzaanHomePageTest extends BrowserDriver {
    IzaanHomePage hmpage;

    @BeforeMethod
    public void intialize(){
        hmpage = PageFactory.initElements(driver,IzaanHomePage.class);

    }

    @Test
    public void findSignIn() throws InterruptedException {
        hmpage.signIn(driver);
        hmpage.trainLogin();
        String expectedUrl = "https://izaan.io/login";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual,expectedUrl);

    }

}