package se.lexicon.VendingMachine.model;

public interface VendingMachine {

    void addCurrency(double amount);
    int getBalanceC();
    Product request(String id);
    int endSession();
    String getDescription(String id);
    String[] getProducts();
}
