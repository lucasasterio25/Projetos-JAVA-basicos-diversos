/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BubleSort;
import java.util.Scanner;


/**
 *
 * @author Lucas
 */
public class Buble {
    public static void main (String [] args) {
        int[] lucas = new int[16];
        int i,j;
        int aux ;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ler numeros");
         for(i=0;i<16;i++){
         lucas[i] = input.nextInt();
         }
        
    
        
        for(i=0;i<16;i++){
            for(j=i+1;j<16;j++){
                if(lucas[i] > lucas[j]){
                   aux = lucas[i]; 
                   lucas[i] = lucas[j];
                   lucas[j] = aux;
                }
            }
        
        }
        
        
        System.out.println("***");
        for(i=1;i<16;i++){        
            System.out.println("Organizado " + lucas[i] );
        }
        
        
    }
    
}
