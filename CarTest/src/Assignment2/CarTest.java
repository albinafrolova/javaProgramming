/**
 *
 * @author albinafrolova
 */
public class CarTest {
    public static void main (String[] args){
        Car c1 = new Car ("Ford", "Taurus", 2007);
		System.out.println(c1);
		c1.setModel ("Explorer");
		System.out.println(c1);       
               
        Car c2 = new Car ("Porsche", "911", 2015);
		System.out.println(c2);
		c2.setModel ("Panomera");
                c2.setYear(2011);
		System.out.println(c2);                
                
        Car c3 = new Car ("Mercedes", "GLS", 2010);
		System.out.println(c3);
		c3.setMake ("AMG");
                c3.setModel("Sport");
		System.out.println(c3);                
         
        Car c4 = new Car ("BMW", "X5", 2007);
		System.out.println(c4);
		c4.setModel ("X6");
		System.out.println(c4);                             
    }
}
