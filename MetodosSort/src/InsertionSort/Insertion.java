/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InsertionSort;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Insertion {        
public static void main (String [] args) {
        int[] lucas = new int[16];
        int i,j,eleito;
        int aux ;
        
        Scanner input = new Scanner(System.in);//função INPUT
        
        System.out.println("Ler numeros");
         for(i=1;i<15;i++){
         lucas[i] = input.nextInt();// função criada para ler os numeros
         }
         
         
         
         for(i=1;i<15;i++){//ordenação
         eleito = lucas[i];
         j = i-1;       
         while(j >= 0 && lucas[j] > eleito){
             lucas[j+1]=lucas[j];
             j = j-1;
            } 
         lucas[j+1] = eleito;
         }
         
               
         
         System.out.println("***");//mostrando numeros ordenados
        for(i=1;i<15;i++){        
            System.out.println("Organizado " + lucas[i] );
        }                                           
    }
}