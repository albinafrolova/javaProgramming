/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

/**
 *
 * @author albinafrolova
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Q1 s1 = new Q1();
        s1.showData();
        
        Q1 s2 = new Q1();
        s2.showData();
        
        Q1.total++;
        s1.showData();
    }
}