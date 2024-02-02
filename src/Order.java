public class Order extends Product implements Cart {
   int size;
   String[] products;
public Order(String name, double price, String reference, int size, String[] products) {
    super(name, price, reference);
    this.size = size;
    this.products = products;
}
@Override
public void addProduct(Product product) {   
    if(products!=null){
    for(int i=0; i<products.length;i++){
        
        }

    }
}

@Override
public boolean removeProduct(Product product) {
    return true;
}

@Override
public void displayProducts() {
    
}

@Override
public double total() {
    return size;
   
}
  
@Override
String getDescription() {
 return "gg"+size;
}

}