/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author lab1aluno
 */
public class TesteArrayList00 {

    private static int array[];

    public static void main(String args[]){
       
        
        array = new int [10];
        for(int i =0; i<=9; i++){
            array[i] = i^2;
        }
         
        for (int i=0; i<=9; i++){
            System.out.println("O valor na posição "+ 1 +" é "+ array[i]);
            
        }
         
    }
    
}

