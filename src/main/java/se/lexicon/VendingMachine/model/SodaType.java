package se.lexicon.VendingMachine.model;

public enum SodaType {
    PEPSI("Pepsi",20.0,true),
    PEPSI_MAX("Pepsi max",25.0,true),
    LOKA("Loka",14.0,true),
    FESTIS("Festis",12.0,false);

    private String name;
    private double price;

    private boolean sparkle;

    SodaType(String name,double price, boolean sparkle) {

        this.name = name;

        this.price = price;
        this.sparkle = sparkle;
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
