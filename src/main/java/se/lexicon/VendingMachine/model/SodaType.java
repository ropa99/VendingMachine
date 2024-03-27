package se.lexicon.VendingMachine.model;

public enum SodaType {
    PEPSI(3001,"Pepsi",20.0,true),
    PEPSI_MAX(3002,"Pepsi max",25.0,true),
    LOKA(3003,"Loka",14.0,true),
    FESTIS(3004,"Festis",12.0,false);

    private int artikelNumber;

    private String name;
    private double price;

    private boolean sparkle;

    SodaType(int artikelNumber,String name,double price, boolean sparkle) {

        this.name = name;

        this.price = price;
        this.sparkle = sparkle;
        this.artikelNumber = artikelNumber;
    }

    public int getArtikelNumber() {
        return artikelNumber;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isSparkle() {
        return sparkle;
    }
}
