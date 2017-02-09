
package samevalues.java;
import java.util.Scanner;
/**
 *
 * @author albinafrolova
 */
public class SamevaluesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        double num2, result1, result2;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter integer and double: ");
        num1 = scan.nextInt();
        num2 = scan.nextDouble();
        
        result1 = (double) num1/5;
        num1 = num1%5;
       
        result2 = num2/5;
        num2 = num2%5;
        
        System.out.println(result1 + " and " + result2);
       
        
    }
    
}
