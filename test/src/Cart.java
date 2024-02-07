import model.Product;

public interface Cart {
    void addProduct(Product product);
    boolean removeProduct(Product product);
    void displayProducts();
    double total();

}