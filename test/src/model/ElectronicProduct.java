package model;
public class ElectronicProduct extends  Product {  
    double power;
     public ElectronicProduct(String name,double price, String reference, double power){
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
    public String getDescription() {
        return "Product name: "+name+ " price: "+price+ " reference: "+reference+ " power: " +power;
    }

}