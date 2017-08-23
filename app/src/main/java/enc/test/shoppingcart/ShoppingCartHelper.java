package enc.test.shoppingcart;

import android.content.res.Resources;

import java.util.List;
import java.util.Vector;

/**
 * Created by pc41 on 23-08-2017.
 */

public class ShoppingCartHelper {

    public static final String PRODUCT_INDEX = "PRODUCT_INDEX";

    private static List<Product> catalog;
    private static List<Product> cart;

    public static List<Product> getCatalog(Resources res){
        if(catalog == null) {
            catalog = new Vector<Product>();
            catalog.add(new Product("Flower", res
                    .getDrawable(R.drawable.image),
                    "flower is beatiful", 29.99));
            catalog.add(new Product("Switch", res
                    .getDrawable(R.drawable.ic_gift_color),
                    "Switch by Chip Heath and Dan Heath", 24.99));
            catalog.add(new Product("Watchmen", res
                    .getDrawable(R.drawable.ic_cab_color),
                    "Watchmen by Alan Moore and Dave Gibbons", 14.99));
        }

        return catalog;
    }

    public static List<Product> getCart() {
        if(cart == null) {
            cart = new Vector<Product>();
        }

        return cart;
    }
}
