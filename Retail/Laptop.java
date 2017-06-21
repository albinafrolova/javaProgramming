/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author albinafrolova
 */
public class Laptop extends Computer{
    public void a() {
        System.out.println("Laptop a");
    }
    public void c() {
        b();
        System.out.println("Laptop c");
    }
    
}
