package se.lexicon.VendingMachine.model;
import se.lexicon.VendingMachine.model.CandyType;

public class Candy extends Product{
    public CandyType candyType;
    public boolean isChocolate;

    public Candy( CandyType candyType) {
        this.candyType = candyType;
    }

    public CandyType getCandyType() {
        return candyType;
    }

    public boolean getIsChocolate(){
        return isChocolate;
    }

    @Override
    public String getDescription() {
        //return "Id: " + super.getId() + " Candy Name: " + candyType.getName() + " Price: " + candyType.getPrice() + " Chocolate: " + candyType.getIsChocolate();
        return "Candy Name: " + candyType.getName() + " Price: " + candyType.getPrice() + " Chocolate: " + candyType.getIsChocolate();
    }
}
