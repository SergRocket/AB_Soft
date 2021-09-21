package TestTask.pages;

import Utils.AppConfig;

import java.time.Duration;
import java.util.NoSuchElementException;

public class BasePage {
    public WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(AppConfig.TIMEOUT));
        PageFactory.initElements(driver, this);
    }

    protected void waitForElementToBeVisible(WebElement element, int timeOut){
        WebDriverWait configWait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        configWait.until(ExpectedConditions.visibilityOf(element));
    }

    protected void elementClick(WebElement element) {
        try {
            waitForElementToBeVisible(element);
        } catch (NoSuchElementException n) {
            System.out.print("The element is not visible");
        }
        element.click();
    }
}
