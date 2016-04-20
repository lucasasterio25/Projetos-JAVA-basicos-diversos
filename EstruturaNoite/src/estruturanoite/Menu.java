/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturanoite;

import java.util.Vector;
import javax.swing.JOptionPane;


/**
 *
 * @author ABITTENCOURTFARIA
 */
public class Menu {

    public static ListaLigada listaTotal = new ListaLigada();
    public static Livro l ;
    public static Livro[] livros ;

    public static int menu;
    public static Vector v = new Vector();
   
    public static int[] vetor = {56, 446, 389, 18, 446, 17, 493, 186, 455,
        94, 374, 119, 81, 250, 496, 84, 129, 73, 414, 156, 199, 84, 17, 16, 56};
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        menu = Integer.parseInt(JOptionPane.showInputDialog("Entre com 1 para continuar ou 0 para sair"));
        
        while (menu > 0) {
            l = new Livro();
            l.setCatalogoLivro(Integer.parseInt(JOptionPane.showInputDialog("Entre com o catalogo")));
            l.setNomeLivro(JOptionPane.showInputDialog("Entre com Nome do Livro"));
            v.add(l);
            menu = Integer.parseInt(JOptionPane.showInputDialog("Entre com 1 para continuar ou 0 para sair"));
        }

        livros = new Livro[v.size()];
        
        for (int i = 0; i < v.size(); i++) {
            livros[i] = (Livro) v.get(i);
            System.out.println(livros[i].getCatalogoLivro());
        }
        

        for (int i = 0; i < v.size(); i++) {
            System.out.println(livros[i].getCatalogoLivro());
        }

        
        quick_sort(livros,0,livros.length);
        
        JOptionPane.showMessageDialog(null, "" + v.size());

        ListaLigada lu = montaLista(v,1);
        JOptionPane.showMessageDialog(null, "" + lu.tamanho());
        
        ListaLigada le = montaLista(v,2);
        JOptionPane.showMessageDialog(null, "" + le.tamanho());
    
        ListaLigada lb = montaLista(v,3);
        JOptionPane.showMessageDialog(null, "" + lb.tamanho());

    }
 

    public static ListaLigada montaLista(Vector v, int tipo) {
        
        ListaLigada lista = new ListaLigada();
        Livro l ;
        
        for (int i = 0; i < v.size(); i++) {
            
            l = (Livro) v.get(i);
            
            if(l.getCatalogoLivro() == tipo) {
                 lista.adiciona(v.get(i));
            }
        }
        
        return lista;
    }
    
    public static void imprime(int[] aux) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" " + aux[i]);
        }
    }
 
    public static void quick_sort(int[] v, int ini, int fim) {
        int meio;
 
        if (ini < fim) {
            meio = partition(v, ini, fim);
            quick_sort(v, ini, meio);
            quick_sort(v, meio + 1, fim);
        }
    }
 
    public static int partition(int[] v, int ini, int fim) {
        int pivo, topo, i;
        pivo = v[ini];
        topo = ini;
 
        for (i = ini + 1; i <= fim; i++) {
            if (v[i] < pivo) {
                v[topo] = v[i];
                v[i] = v[topo + 1];
                topo++;
            }
        }
        v[topo] = pivo;
        return topo;
    }


  public static void quick_sort(Livro[] v, int ini, int fim) {
        int meio;
 
        if (ini < fim) {
            meio = partition(v, ini, fim);
            quick_sort(v, ini, meio);
            quick_sort(v, meio + 1, fim);
        }
    }
 
    public static int partition(Livro[] v, int ini, int fim) {
        int pivo, topo, i;
        pivo = v[ini].getCatalogoLivro();
        topo = ini;
 
        for (i = ini + 1; i <= fim; i++) {
            if (v[i].getCatalogoLivro() < pivo) {
                v[topo] = v[i];
                v[i] = v[topo + 1];
                topo++;
            }
        }
        v[topo].setCatalogoLivro(pivo);
        return topo;
    }

}
