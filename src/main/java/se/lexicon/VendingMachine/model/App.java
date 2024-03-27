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
        //System.out.println(ck.getDescription());
        Candy candy = new Candy(CandyType.GOTT_BLANDAT);
        //System.out.println(candy.getDescription());
        Soda drink = new Soda(SodaType.FESTIS,"Hallon");
        //System.out.println(drink.getDescription());

        Soda drink2 = new Soda(SodaType.LOKA,"Päron");
        //System.out.println(drink2.getDescription());

       //3
        Product product[] = new se.lexicon.VendingMachine.model.Product[3];

       product[0] =ck;
       product[1] =candy;
       product[2] =drink;

        System.out.println(product[0].use());
        System.out.println(product[0].examine());

        Candy candy_2 = new Candy(CandyType.GOTT_BLANDAT);


        VendingMachineImpl vm = new VendingMachineImpl(product);
        vm.setProduct(candy_2);
        vm.getProducts();
        vm.addCurrency(10.00);
      //  System.out.println(vm.getDescription(candy_2.getArtikelnumber()));
        //System.out.println("Balance: " + vm.getBalanceC());


    }
}
