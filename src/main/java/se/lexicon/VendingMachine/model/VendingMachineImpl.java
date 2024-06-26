package se.lexicon.VendingMachine.model;
import se.lexicon.VendingMachine.model.Product;
import java.util.Arrays;
public class VendingMachineImpl implements VendingMachine{

    private Product[] products;
    private int depositPool;

    static int[] validMoney ={1,2,5,10,20,50,100,200,500,1000};

    public VendingMachineImpl(Product[] products) {
        this.products = products;
    }


    @Override
    public void addCurrency(double amount) {
        if (compareMoneyValues(amount)) {
            depositPool += (int) amount;
        }
    }

    @Override
    public int getBalanceC() {
        return depositPool;
    }

    @Override
    public Product request(int id) {
        Product pr = findProduct(id);
        if(pr != null) {
            if (checkBalance((int) pr.getPrice())){
                removeProduct(pr);
                depositPool = reduceMoneyFomDepositPool(pr.getPrice());
            }
        }
        return null;
    }

    @Override
    public int endSession() {
        return depositPool =0;
    }

    @Override
    public String getDescription(int id) {

        Product pr = findProduct(id);

        return pr.examine();
    }

    @Override
    public String[] getProducts() {
        String[] strProducts = new String[products.length +1];
            for(int i =0; i < products.length;i++){

                strProducts[i] = products[i].examine();
            }
        return strProducts;
    }

   //No need for method adding one extra product.
    /* public void setProduct(Product pr){
        if(pr == null) throw new IllegalArgumentException("Product cannot be null");
        addProduct(pr);
    }*/

    private boolean compareMoneyValues(double amount){
        boolean money = false;
        for (int i =0;i< validMoney.length;i++){
            if (Double.compare((double) validMoney[i],amount) == 0) {
                money = true;
                break;
            }
        }
        return money;

    }

    private boolean checkBalance(int amount){
        boolean b = false;
        if (amount > depositPool) {
            b = false;
        }else{
            b = true;
        }
        return b;
    }

    private Product findProduct(int id){
        for (Product p : products) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    private int reduceMoneyFomDepositPool(double amount){
               return depositPool-= (int)amount;
    }

    private void removeProduct(Product pr) {
        if(pr == null) throw new IllegalArgumentException("Product cannot be null");

        int i,x=0;
        Product[] tmpProduct = new Product[products.length];
        for (i =0; i <  products.length ; i++){
              if(products[i].getId() != pr.getId()){
                  tmpProduct[x] = products[i];
                  x++;
              }
        }
         products = tmpProduct;
    }
    private void addProduct(Product pr){

        if(pr == null) throw new IllegalArgumentException("Product cannot be null");

        //Add product to array
        Product[] tmpProduct = new Product[products.length +1];
        tmpProduct = Arrays.copyOf(products,products.length +1);
        tmpProduct[tmpProduct.length -1] = pr;
        products = tmpProduct;


    }
}
