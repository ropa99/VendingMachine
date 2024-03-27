package se.lexicon.VendingMachine.model;
import se.lexicon.VendingMachine.model.CandyType;

public class Candy extends Product{
    private CandyType candyType;
    private boolean isChocolate;
    private int artikelnumber;

    public Candy( CandyType candyType) {
        super(candyType.getArtikelNumber(),candyType.getPrice(), candyType.getName());
        this.isChocolate = candyType.getIsChocolate();



    }

    public CandyType getCandyType() {
        return candyType;
    }

    public boolean getIsChocolate(){
        return isChocolate;
    }

    public int getArtikelnumber(){
        return artikelnumber;
    }

    @Override
    public String getDescription() {

        return "Artikelnumber: " + this.getId() + " Candy Name: " + this.getProductName() + " Price: " + this.getPrice() + " Chocolate: " + this.getIsChocolate();
    }

    @Override
    public String examine() {
        return "Artikelnumber: " + this.getId() + " Candy Name: " + this.getProductName() + " Price: " + this.getPrice() + " Chocolate: " + this.getIsChocolate();
    }

    @Override
    public String use() {
        return "Artikelnumber: " + this.getId() + " Candy Name: " + this.getProductName() + " Price: " + this.getPrice() + " Chocolate: " + this.getIsChocolate();
    }
}
