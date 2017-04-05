/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package changingpeople;

/**
 *
 * @author albinafrolova
 */
public class Changingpeople {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person1 = new Person("Sally", 13);
        Person person2 = new Person("Sam", 15);
        
        int age = 21;
        String name = "Jill";
        
        System.out.println("\nParameter Passing... Original values...");
        System.out.println("person1= " + person1);
        System.out.println("person2= " + person2);
        System.out.println("person3= Name: " +name + "\tAge: " +age +"\n");
        
        changepeople(person1, person2, age, name);
        
        System.out.println("\nValues after calling changePeople...");
        System.out.println("person1= " + person1);
        System.out.println("person2= " + person2);
        System.out.println("person3= Name: " +name + "\tAge: " +age +"\n");
    }
    
    public static void changepeople(Person p1, Person p2, int age, String name){
        p1.changeName("Jack");
        p1.changeAge(101);
        
        p2.changeName(name);
        p2.changeAge(age);
    }
}
