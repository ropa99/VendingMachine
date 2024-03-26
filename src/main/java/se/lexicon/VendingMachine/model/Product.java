package se.lexicon.VendingMachine.model;

public abstract class Product {
    private int id;
    private double price;
    private String productName;

    public int getId() {
        return id++;
    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }
    public String getDescription(){
        return "HEJ";
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setUniqueid(int id){
        this.id = id;
    }
}

