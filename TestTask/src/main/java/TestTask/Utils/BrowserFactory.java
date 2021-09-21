package Utils;

public class BrowserFactory {
    private ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
    private String browser;

    public BrowserFactory(String browser){this.browser = browser.toLowerCase();}

    public WebDriver createDriver(){
        switch (browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver.set(new ChromeDriver());
                break;
            default:
                System.out.print("Failed to setup browser");
        }
        return driver.get();
    }

}
