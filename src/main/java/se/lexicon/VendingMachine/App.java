package se.lexicon.VendingMachine;
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
        System.out.println(ck.getDescription());
        Candy candy = new Candy(CandyType.GOTT_BLANDAT);
        System.out.println(candy.getDescription());
        Soda drink = new Soda(SodaType.FESTIS,"Hallon");
        System.out.println(drink.getDescription());

      /*  Product product[] = new se.lexicon.VendingMachine.model.Product[1];
        product[0] =ck;
       // product[0].getDescription();
        //VendingMachineImpl vm = new se.lexicon.VendingMachine.model.VendingMachineImpl(product);
        vm.setProduct(candy);*/



    }
}
