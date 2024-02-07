import model.Product;

public class Order implements Cart {
    int size;
    Product[] products;

    public Order() {
        this.products = new Product[10];
        this.size = 0;
    }

    @Override
    public void addProduct(Product product) {
        if (products.length > size) {
            size++;
            products[size] = product;
        }

    }

    @Override
    public boolean removeProduct(Product product) {

        for (int i = 0; i < products.length; i++) {
            if (products[i] == product) {
                while (size < products.length) {
                    products[i] = products[i + 1];
                    size--;
                }
                return true;
            } else {
                return false;
            }

        }
    }

    @Override
    public void displayProducts() {

    }

    @Override
    public double total() {
        return size;

    }

    @Override
    public String getDescription() {
        return "gg" + size;
    }

}