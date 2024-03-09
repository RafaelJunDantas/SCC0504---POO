/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public class Mouse extends Drivers{
    
    public Mouse(){
        ligado = 0;
        status = 0;
    }
    
    public void ligar(){
        ligado = 1;
        System.out.println("Mouse ligado");
    }
    
    public void desligar(){
        ligado = 0;
        System.out.println("Mouse desligado");
    }
    
    public int checarStatus(){
        System.out.println("Condicao de status atual do mouse: " + status);
        return status;
    }
    
    public void calibrar(int novoStatus){
        this.status = novoStatus;
        this.checarStatus();
    }
}
