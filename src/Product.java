abstract class Product {
    String name;
    double price;
    String reference;
    public Product (String name, double price, String reference){
        this.name=name;
        this.price=price;
        this.reference=reference;
    }
    public Product (String name, double price){
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
    abstract  String getDescription( );

    
  
}