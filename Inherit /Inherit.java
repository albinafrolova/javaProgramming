/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author albinafrolova
 */
public class Inherit {
    abstract class Figure{
        void display(){
            System.out.println("Figure");
        }
    }
    abstract class Rectangle extends Figure{
        
    }
    class Box extends Rectangle{
        void disply(){
            System.out.println("Rectangle");
        }
    }
    Inherit(){
        Figure f=(Figure)new Box();
        f.display();
        Rectangle r = (Rectangle)f;
        r.display();
    }
}
