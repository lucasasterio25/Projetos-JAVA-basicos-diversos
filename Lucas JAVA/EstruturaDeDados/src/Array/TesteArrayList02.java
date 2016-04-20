/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;
import Bean.Aluno;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author lab1aluno
 */
public class TesteArrayList02 {
    
    public static ArrayList arrayAlunos = new ArrayList ();
    private static Aluno aluno;
    
    
    public static void main (String[] args){
        while (arrayAlunos.size() < 3){
            aluno= new Aluno ();
        aluno.setNome (JOptionPane.showInputDialog("Entre com o Nome"));
        aluno.setRg (JOptionPane.showInputDialog("Entre com o Rg"));
        aluno.setRa (Integer.parseInt(JOptionPane.showInputDialog("Entre com o RA"))); 
        arrayAlunos.add(aluno);
        }
        
        for (int i = 0; 1< arrayAlunos.size(); i++){
            aluno = (Aluno) arrayAlunos.get(i);
            System.out.println("Valor da posição " +1);
            System.out.println(" Nome");
            System.out.println("Rg");
            System.out.println("Ra");
        
       }
    }
}
