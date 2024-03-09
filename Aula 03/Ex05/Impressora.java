/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public class Impressora extends Drivers{
    
    public Impressora(){
        ligado = 0;
        status = 0;
    }
    
    public void ligar(){
        ligado = 1;
        System.out.println("Impressora ligada");
    }
    
    public void desligar(){
        ligado = 0;
        System.out.println("Impressora desligada");
    }
    
    public int checarStatus(){
        System.out.println("Condicao de status atual da impressora: " + status);
        return status;
    }
    
    public void calibrar(int novoStatus){
        this.status = novoStatus;
        this.checarStatus();
    }
}
