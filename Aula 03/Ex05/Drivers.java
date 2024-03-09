/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public abstract class Drivers {
    
    public int ligado;
    public int status;
    
    public abstract void ligar();
    public abstract void desligar();
    
    public abstract int checarStatus();
    public abstract void calibrar(int novoStatus);
}
