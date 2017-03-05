/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vowel.java;
import java.util.Scanner;
/**
 *
 * @author albinafrolova
 */

  public class VowelJava{


    public static void main(String args []){

    int a =0, e = 0, x = 0;
    int u = 0, o = 0, total = 0;
    String text;
    Scanner scan = new Scanner(System.in);


    System.out.print("Enter the word: ");
    text = scan.nextLine();

    for (int i = 0; i < text.length(); i++) {
    char c = text.charAt(i);

    if (c=='a')
    a++; 

    else if( c=='e')
    e++;

    else if(c=='i')
    x++;

    else if(c=='o')
    o++;

    else if (c=='u')
    u++;        

    else
    total++;
    }

    System.out.println("a: " + a + "\n" +
    "e: " + e + "\n" +
    "i: " + x + "\n" +
    "o: " + o + "\n" +
    "u: " + u + "\n" +
    "total: " + total);

    }
    }