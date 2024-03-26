package se.lexicon.VendingMachine.model;


public class Cookie extends Product{
    public CookieType cookieType;

    public Cookie(CookieType cookieType) {
        this.cookieType = cookieType;
    }

    @Override
    public String getDescription() {
        //return "Id: " + getId() + "Cookie type: " + cookieType.getName() + " Price: " +cookieType.getPrice() + " Soft: " + cookieType.getIsSoft();
        return "Cookie Name: " + cookieType.getName() + " Price: " +cookieType.getPrice() + " Soft: " + cookieType.getIsSoft();
    }
}
