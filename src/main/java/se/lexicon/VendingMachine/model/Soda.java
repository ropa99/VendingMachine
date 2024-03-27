package se.lexicon.VendingMachine.model;
import se.lexicon.VendingMachine.model.SodaType;
public class Soda extends Product{
    private SodaType sodaType;
    private boolean isSparkle;
    private String taste;

    public Soda(SodaType sodaType,String taste) {
        super(sodaType.getArtikelNumber(), sodaType.getPrice(),sodaType.getName());
        this.sodaType = sodaType;
        this.taste = taste;
        this.isSparkle = sodaType.isSparkle();



    }

    public SodaType getSodaType() {
        return sodaType;
    }

    public boolean getIsSparkle() {
        return isSparkle;
    }

    public String getTaste() {
        return taste;
    }

    @Override
    public String getDescription() {

        //return "Artikelnumber: " + this.getId() + " Soda Name: " + this.getProductName() +" Taste: " + this.getTaste() + " Sparkle: " + this.getIsSparkle();
        return "Artikelnumber: " + sodaType.getArtikelNumber() + " Soda Name: " + sodaType.getName() +" Taste: " + this.getTaste() + " Sparkle: " + sodaType.isSparkle();
    }

    @Override
    public String examine() {
        return "Artikelnumber: " + sodaType.getArtikelNumber() + " Soda Name: " + sodaType.getName() +" Taste: " + this.getTaste() + " Sparkle: " + sodaType.isSparkle();
    }

    @Override
    public String use() {
        return "Artikelnumber: " + sodaType.getArtikelNumber() + " Soda Name: " + sodaType.getName() +" Taste: " + this.getTaste() + " Sparkle: " + sodaType.isSparkle();
    }
}
