public class BookProduct extends Product {
    String author;

    public BookProduct(String name, double price, String reference, String author) {
        super(name, price, reference);
        this.author="author";
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    @Override
    String getDescription() {
        return "Product [name="+name+ "price="+price+ "reference="+reference+ "author=" +author+"]";
    }

  
    
}