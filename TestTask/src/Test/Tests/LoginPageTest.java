package Tests;


import TestTask.pages.LoginPage;
import TestTask.pages.MainPage;
import Utils.AppConfig;

public class LoginPageTest extends TestBase {
    @Test(testName = "Tests to check if user can login with valid credentials", groups="positive")
    public void validLogin(){
        LoginPage loginPage = new LoginPage(driver);
        MainPage mainPage = loginPage.login(AppConfig.validPassword, AppConfig.validUsername);
        Assert.assertTrue(mainPage.isGoodsListDysplayed());
    }
}
