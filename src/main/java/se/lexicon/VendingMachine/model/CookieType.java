package se.lexicon.VendingMachine.model;

public enum CookieType {
    CHOKLADBOLLAR("Choclate boll",1.0,true),
    DAMMSUGARE("Dammsugare",2.0,false),
    CHOCOLATE_CHIP_COOKIE("Kaka",3.0,false);

    private String name;
    private double price;
    private boolean soft;


    CookieType(String name,double price,boolean soft){
        this.name = name;
        this.price = price;
        this.soft = soft;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean getIsSoft() {
        return soft;
    }
}
