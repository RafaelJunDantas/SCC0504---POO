/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Rafael
 */

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Time> lista = new ArrayList();
        
        Time t1 = new Time("A", 0, 2, 1);
        Time t2 = new Time("B", 1, 1, 1);
        Time t3 = new Time("C", 0, 2, 2);
        Time t4 = new Time("D", 2, 0, 1);
        
        lista.add(t1);
        lista.add(t2);
        lista.add(t3);
        lista.add(t4);
        
        Collections.sort(lista);
        
        int j = 1;
        for(int i = lista.size() - 1; i >= 0; i--){
            System.out.println("Posicao " + j + ": " + lista.get(i).getNome());
            j++;
        }
    
    }
    
}
