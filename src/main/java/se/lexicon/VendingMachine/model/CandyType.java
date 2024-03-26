package se.lexicon.VendingMachine.model;

public enum CandyType {
    SNICKERS("Snickers",15.0,true),
    DAIM("Daim",20,true),
    GOTT_BLANDAT("Gott & Blandat",30,true);

    private String name;
    private double price;

    private boolean isChocolate;

    CandyType(String name, double price,boolean chocolate) {
        this.name = name;
        this.isChocolate = chocolate;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public boolean getIsChocolate() {
        return isChocolate;
    }

    public double getPrice() {
        return price;
    }
}
