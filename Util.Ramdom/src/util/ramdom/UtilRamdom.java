/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util.ramdom;
import java.util.Random;

/**
 *
 * @author Lucas
 */
public class UtilRamdom {
    
    

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        int x;
        Random gerador = new Random() ;
        x= gerador.nextInt(999) ;
        
            
            System.out.println("Numeros " + x);
        
      
        
    }
}
