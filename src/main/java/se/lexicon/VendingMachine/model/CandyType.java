package se.lexicon.VendingMachine.model;

public enum CandyType {
    SNICKERS(1001,"Snickers",15.0,true),
    DAIM(1002,"Daim",20,true),
    GOTT_BLANDAT(1003,"Gott & Blandat",30,false);

    private int artikelNumber;
    private String name;

    private double price;

    private boolean isChocolate;

    CandyType(int artikelNumber,String name, double price,boolean chocolate) {
        this.name = name;
        this.isChocolate = chocolate;
        this.price = price;
        this.artikelNumber = artikelNumber;
    }

    public int getArtikelNumber() {
        return artikelNumber;
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
