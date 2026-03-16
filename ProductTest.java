package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.ProductPage;

public class ProductTest extends BaseTest;

public class ProductTest extends BaseTest {

    @Test
    public void searchProduct() {

        ProductPage product = new ProductPage(driver);

        product.searchProduct("Laptop");
        product.addProductToCart();
    }
}
