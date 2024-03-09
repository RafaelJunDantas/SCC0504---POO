/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public class Teclado extends Drivers{
    
    public Teclado(){
        ligado = 0;
        status = 0;
    }
    
    public void ligar(){
        ligado = 1;
        System.out.println("Teclado ligado");
    }
    
    public void desligar(){
        ligado = 0;
        System.out.println("Teclado desligado");
    }
    
    public int checarStatus(){
        System.out.println("Condicao de status atual do teclado: " + status);
        return status;
    }
    
    public void calibrar(int novoStatus){
        this.status = novoStatus;
        this.checarStatus();
    }
}
