/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;
import Bean.Aluno;

/**
 *
 * @author lab1aluno
 */
public class TesteArrayList01 {
    
        public static Aluno array[] ;
        

    
    public static void main (String[] args){
        
    array = new Aluno[10];
    
    
    for (int i=0;i<=9;i++){
        
        Aluno a = new Aluno ();
        
        a.setNome("Lucas");
        a.setRg("485210066");
        a.setRa("12345789");
         
        array[i] = a;               
         }
    
    for (int i=0;i<=9;i++){
    System.out.println("Nome "+array[i].getNome() );
    System.out.println("Rg "+array[i].getRg() );
    System.out.println("Ra "+array[i].getRa() );
         }
    
    }
}
