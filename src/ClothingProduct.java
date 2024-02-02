public class ClothingProduct extends Product {
String size;

public ClothingProduct(String name, double price, String reference, String size) {
    super(name, price, reference);
    this.size=size;
}

public String getSize() {
    return size;
}

public void setSize(String size) {
    this.size = size;
}
@Override
    String getDescription() {
        return "Product name="+name+ "price="+price+ "reference="+reference+ "size=" +size;
    }
}