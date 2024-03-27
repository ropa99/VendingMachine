package se.lexicon.VendingMachine.model;
import se.lexicon.VendingMachine.model.CandyType;

public class Candy extends Product{
    private CandyType candyType;
    private boolean isChocolate;


    public Candy( CandyType candyType) {
        super(candyType.getArtikelNumber(),candyType.getPrice(), candyType.getName());
        this.candyType = candyType;
        this.isChocolate = candyType.getIsChocolate();



    }

    public CandyType getCandyType() {
        return candyType;
    }

    public boolean getIsChocolate(){
        return isChocolate;
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
