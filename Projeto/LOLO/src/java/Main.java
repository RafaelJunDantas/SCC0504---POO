/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import Controler.Tela;

/**
 *
 * @author junio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {               
                Tela tela = new Tela();            
                
                tela.setVisible(true);
                tela.createBufferStrategy(2);
                tela.go();
                
                
            }
        });
    }
}

