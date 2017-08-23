package enc.test.shoppingcart;

import android.graphics.drawable.Drawable;

/**
 * Created by pc41 on 23-08-2017.
 */

public class Product {

    public String title;
    public Drawable productImage;
    public String description;
    public double price;
    public boolean selected;

    public Product(String title, Drawable productImage, String description,
                   double price) {
        this.title = title;
        this.productImage = productImage;
        this.description = description;
        this.price = price;
    }
}
