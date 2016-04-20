/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SelectionSort;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Selection {
    public static void main (String [] args) {
        int[] lucas = new int[16];
        int i,j;
        int menor, eleito, pos;
        
        Scanner input = new Scanner(System.in);//função para ler os numeros
        
        System.out.println("Ler numeros");
         for(i=1;i<15;i++){
         lucas[i] = input.nextInt();//nextInt serve para chamar a funçao
         }
         
         for(i=1;i<15;i++){
         eleito = lucas[i];
         menor = lucas[i+1];
         pos= i + 1;
         for(j=i+2; j<15; j++){
            if(lucas[j]<menor){
                menor = lucas[j];
                pos = j;
               }          
             }
         if(menor < eleito){
             lucas[i]=lucas[pos];
             lucas[pos] = eleito;
            }
         }
     
        System.out.println("***");
        for(i=1;i<15;i++){        
            System.out.println("Organizado " + lucas[i] );
        }
         
         
         
    

    }
}