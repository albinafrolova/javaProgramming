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
public class Q1 {
    int grade = 88;
    static int total;
    
    Q1(){
        total=total+90;
    }
    public void showData(){
        System.out.println("Your grade is = " + grade++);
        System.out.println("Your total is = " + total);
    }

}
