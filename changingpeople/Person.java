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
public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void changeName(String newName){
        name = newName;
    }
    
    public void changeAge(int newAge){
        age = newAge;
    }
    
    public String toString(){
           return "Name: " + name + "\tAge: " + age;
    }
}