package se.lexicon.VendingMachine.model;
import se.lexicon.VendingMachine.model.Product;
public class VendingMachineImpl implements VendingMachine{

    Product[] products = new Product[0];
    int depositPool;

    public VendingMachineImpl(Product[] products) {
        this.products = products;
    }

    @Override
    public void addCurrency(double amount) {

    }

    @Override
    public int getBalanceC() {
        return 0;
    }

    @Override
    public se.lexicon.VendingMachine.model.Product request(String id) {
        return null;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription(String id) {
        return null;
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }
}
