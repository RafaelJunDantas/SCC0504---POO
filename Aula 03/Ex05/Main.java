/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Video v = new Video();
        Impressora i = new Impressora();
        Mouse m = new Mouse();
        Teclado t = new Teclado();
        
        v.ligar();
        i.ligar();
        m.ligar();
        t.ligar();
        
        v.calibrar(1);
        i.calibrar(2);
        m.calibrar(3);
        t.calibrar(4);
    
        
    }
    
}
