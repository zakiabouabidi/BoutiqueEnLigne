public class ElectronicProduct extends  Product {  
    double power;
     ElectronicProduct(String name,double price, String reference, double power){
       super(name , price, reference);
       this.power=power;
     }
    public double getPower() {
        return power;
    }
    public void setPower(double power) {
        this.power = power;
    }

    @Override
    String getDescription() {
        return "Product name: "+name+ " price: "+price+ " reference: "+reference+ " power: " +power;
    }

}