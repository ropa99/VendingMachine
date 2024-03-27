package se.lexicon.VendingMachine.model;
import se.lexicon.VendingMachine.model.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Create a cookie
        Cookie ck = new Cookie(CookieType.CHOCOLATE_CHIP_COOKIE);
        //System.out.println(ck.use());
        Candy candy = new Candy(CandyType.GOTT_BLANDAT);
        //System.out.println(candy.examine());
        Soda drink = new Soda(SodaType.FESTIS,"Hallon");
        //System.out.println(drink.use());

        Soda drink2 = new Soda(SodaType.LOKA,"Päron");
        //System.out.println(drink2.examine());

       //3
        Product product[] = new se.lexicon.VendingMachine.model.Product[3];

       product[0] =ck;
       product[1] =candy;
       product[2] =drink;

        //System.out.println(product[0].use());
        //System.out.println(product[0].examine());

        Candy candy_2 = new Candy(CandyType.GOTT_BLANDAT);


        VendingMachineImpl vm = new VendingMachineImpl(product);
        //vm.setProduct(candy_2);
        //vm.getProducts();
        //vm.addCurrency(50.00);
        //vm.addCurrency(12.00);
        //vm.request(candy_2.getId());
        //System.out.println(vm.getDescription(ck.getId()));
        //System.out.println("Balance: " + vm.getBalanceC());
        //System.out.println(vm.getDescription(candy_2.getArtikelnumber()));
       /* String[] str = vm.getProducts();
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }*/


    }
}
