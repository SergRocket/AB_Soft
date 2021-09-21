package Tests;


import java.time.Duration;

public class TestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @Parameters({"browser"})
    @BeforeMethod
    public void beforeLogin(@Optional("chrome") String browser) {
        BrowserFactory browserDriverFactory = new BrowserFactory(browser);
        driver = browserDriverFactory.createDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(AppConfig.TIMEOUT));
        driver.get(AppConfig.startUrl);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void shuttingDown() {
        driver.close();
        if (driver != null) {
            driver.quit();
        }
    }
}
