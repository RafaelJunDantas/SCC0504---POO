/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Rafael
 */

import java.util.ArrayList;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<PegadaDeCarbono> lista = new ArrayList();
        ArrayList<String> listaString = new ArrayList();
        
        Carro c1 = new Carro("C", "C", 2018, 4, 10);
        Carro c2 = new Carro("D", "D", 2020, 5, 20);
        
        lista.add(c1);
        lista.add(c2);
        
        listaString.add(c1.getModelo());
        listaString.add(c2.getModelo());
        
        Bicicleta b1 = new Bicicleta("E", "E", 29, 2019);
        Bicicleta b2 = new Bicicleta("F", "F", 26, 2021);
        
        lista.add(b1);
        lista.add(b2);
        
        listaString.add(b1.getMarca());
        listaString.add(b2.getMarca());
        
        Casa k1 = new Casa("G", 4, 60);
        Casa k2 = new Casa("H", 2, 34);
        
        lista.add(k1);
        lista.add(k2);
        
        listaString.add(k1.getRua());
        listaString.add(k2.getRua());
        
        Escola e1 = new Escola("I", 380, "I");
        Escola e2 = new Escola("J", 600, "J");
        
        lista.add(e1);
        lista.add(e2);
        
        listaString.add(e1.getRua());
        listaString.add(e2.getRua());
        
        for(int i = 0; i < lista.size(); i++){
            System.out.println("Pegada de carbono de " + listaString.get(i) + ": " + lista.get(i).getPegadaDeCarbono());
        }
    }
    
}
