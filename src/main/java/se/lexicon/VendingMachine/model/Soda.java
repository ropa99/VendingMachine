package se.lexicon.VendingMachine.model;
import se.lexicon.VendingMachine.model.SodaType;
public class Soda extends Product{
    private SodaType sodaType;
    private boolean isSparkle;
    private String taste;

    public Soda(SodaType sodaType,String taste) {

        this.sodaType = sodaType;
        this.taste = taste;
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
        return "Soda Name: " + getSodaType() +" Taste: " + getTaste() + " Sparkle: " + getIsSparkle();
    }
}
