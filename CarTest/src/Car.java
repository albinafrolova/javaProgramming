/**
 *
 * @author albinafrolova
 */
public class Car {
    
       String make;
       String model;
       int year;
       
       public Car(String m, String s, int y){
           this.make = m;
           this.model = s;
           this.year = y;
       }
       
       public String getMake(){
           return this.make;
       }
       public String getModel(){
           return this.model;
       }
       public int getYear(){
            return this.year;
       }
       public Car setMake(String make){
           this.make = make;
           return this;
       }    
       public Car setModel(String model){
           this.model = model;
           return this;
       }       
       public Car setYear(int year){
           this.year = year;
           return this;
       }
       public String toString(){
           return "\nCar\n" +"---\n" + "Make:" + make +  "\nModel:" 
                   + model + "\nYear:" + year;
       }
    }
