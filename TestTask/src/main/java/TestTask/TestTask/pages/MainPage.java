package TestTask.pages;

import java.util.NoSuchElementException;

public class MainPage extends BasePage {
    @FindBy(css = "select[class='product_sort_container']")
    private WebElement filterBody;
    @FindBy(css = "option[value='lohi']")
    private WebElement filterFromCheap;
    @FindBy(css = "option[value='hilo']")
    private WebElement filterFromHight;
    @FindBy(css = "div.pricebar > div")
    private WebElement prices;
    @FindBy(css = "div.pricebar > div")
    private WebElement goodsList;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public boolean isGoodsListDysplayed() {
        try {
            waitForElementToBeVisible(goodsList);
            if (goodsList.isDisplayed()) {
                return true;
            }
        } catch (NoSuchElementException n) {
            System.out.print("The element is not visible");
        }
        return goodsList.isDisplayed();
    }

    public void selectFromHigh(){
        elementClick(filterBody);
        elementClick(filterFromHight);
    }

    public void selectFromLow(){
        elementClick(filterBody);
        elementClick(filterFromCheap);
    }

    public boolean checkFromLowPrices(){
        return boolean ;
    }

    public boolean checkFromHighPrices(){
        return boolean ;
    }

}
