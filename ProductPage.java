package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    By searchBox = By.id("search");
    By searchButton = By.id("searchBtn");
    By addToCart = By.id("addCart");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProduct(String product) {

        driver.findElement(searchBox).sendKeys(product);
        driver.findElement(searchButton).click();
    }

    public void addProductToCart() {

        driver.findElement(addToCart).click();
    }
}
