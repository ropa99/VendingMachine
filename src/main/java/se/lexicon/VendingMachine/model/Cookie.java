package se.lexicon.VendingMachine.model;


public class Cookie extends Product{
    private CookieType cookieType;

    public Cookie(CookieType cookieType) {
        super(cookieType.getArtikelNumber(), cookieType.getPrice(), cookieType.getName());
        this.cookieType = cookieType;

    }

    @Override
    public String getDescription() {
        //return "Id: " + getId() + "Cookie type: " + cookieType.getName() + " Price: " +cookieType.getPrice() + " Soft: " + cookieType.getIsSoft();
        return "Artikelnumber: " + cookieType.getArtikelNumber() + " Cookie Name: " + cookieType.getName() + " Price: " +cookieType.getPrice() + " Soft: " + cookieType.getIsSoft();
    }

    @Override
    public String examine() {
        return "Artikelnumber: " + cookieType.getArtikelNumber() + " Cookie Name: " + cookieType.getName() + " Price: " +cookieType.getPrice() + " Soft: " + cookieType.getIsSoft();
    }

    @Override
    public String use() {
        return "Artikelnumber: " + cookieType.getArtikelNumber() + " Cookie Name: " + cookieType.getName() + " Price: " +cookieType.getPrice() + " Soft: " + cookieType.getIsSoft();
    }
}
