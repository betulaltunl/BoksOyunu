
package javaapplication5;

/**
 *
 * @author Betül Altunel
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Fighter marc = new Fighter("Ali" , 10 , 100, 90, 0);
      Fighter alex = new Fighter("Veli" , 10 , 100, 90, 0);
      Ring r = new Ring(marc,alex , 90 , 100);
      r.run();
    }
    
}
