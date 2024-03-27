package se.lexicon.VendingMachine.model;

public enum CookieType {
    CHOKLADBOLLAR(2001,"Choclate boll",1.0,true),
    DAMMSUGARE(2002,"Dammsugare",2.0,false),
    CHOCOLATE_CHIP_COOKIE(2003,"Kaka",3.0,false);

    private int artikelNumber;
    private String name;
    private double price;
    private boolean soft;


    CookieType(int artikelNumber,String name,double price,boolean soft){
        this.name = name;
        this.price = price;
        this.soft = soft;
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

    public boolean getIsSoft() {
        return soft;
    }
}
