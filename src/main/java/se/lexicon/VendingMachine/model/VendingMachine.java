package se.lexicon.VendingMachine.model;

public interface VendingMachine {

    void addCurrency(double amount);
    int getBalanceC();
    Product request(int id);
    int endSession();
    String getDescription(int id);
    String[] getProducts();
}
