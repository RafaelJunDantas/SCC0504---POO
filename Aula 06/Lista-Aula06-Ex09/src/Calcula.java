/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public abstract class Calcula {
    private Calcula sucessor;
    
    public Calcula(Calcula sucessor){
        this.sucessor = sucessor;
    }
    
    public abstract void calcula(int n);
    
    public Calcula getSucessor(){
        return this.sucessor;
    }
}
