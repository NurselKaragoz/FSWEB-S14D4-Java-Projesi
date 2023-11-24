import com.workintech.product.Chocolate;
import com.workintech.product.ProductForSale;

public class Store {
    public static void main(String[] args) {

        listProducts();
    }

    public static void listProducts(ProductForSale[] products) {
        ProductForSale[] sales = new ProductForSale[5];
     sales[0]= new Chocolate("white",23,"hot");


    }
}