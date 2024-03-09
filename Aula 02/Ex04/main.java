/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Data data1 = new Data(10, 5, 2022);
        Usuario usuario1 = new Usuario("Rafael", "000000", 19);
         
        Resultado resultado1 = new Resultado(5, 10, 0);
        
        resultado1.setUsuarioData(usuario1, data1);        
        resultado1.setOperacao();      
        resultado1.printResultado();
        
        
        
        Data data2 = new Data(15, 3, 2022);
        Usuario usuario2 = new Usuario("Lucas", "11111", 20);
        
        Resultado resultado2 = new Resultado(1, 5, 2);
        
        resultado2.setUsuarioData(usuario2, data2);        
        resultado2.setOperacao();      
        resultado2.printResultado();
    }
    
}
