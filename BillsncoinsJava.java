
package billsncoins.java;
import java.util.Scanner;
/**
 *
 * @author albinafrolova
 */
public class BillsncoinsJava {
    
    public static void main(String[] args) {
        
        double amount;
        int one, five, ten;
        int penny, nickel, dime, quarter;

        Scanner scan= new Scanner(System.in);

        System.out.print("What is the amount? ");
        amount = scan.nextDouble();

        ten = (int) amount/10;
        amount = amount%10;

        five = (int) amount/5;
        amount = amount%5;

        one = (int) amount/1;
        amount = amount%1;

        quarter = (int) (amount/0.25);
        amount = amount%.25;

        dime = (int) (amount/0.10);
        amount = amount%.10;

        nickel = (int) (amount/0.5);
        amount = amount%.5;

        penny = (int) (amount/0.01);
        amount = amount%.1;

        System.out.println (ten + " ten dollar bills");
        System.out.println (five + " five dollar bills");
        System.out.println (one + " one dollar bills");
        System.out.println (quarter + " quarters");
        System.out.println (dime +  " dimes");
        System.out.println (nickel + " nickels");
        System.out.println (penny + " pennies");
    }
    
}
