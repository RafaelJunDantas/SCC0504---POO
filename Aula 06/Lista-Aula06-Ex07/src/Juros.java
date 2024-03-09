/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public class Juros extends Divida{
    
    public Juros(float divida){
        super.setTotal(divida);
    }    
    
    @Override
    public String dividaTotal() {
       return "Divida total: " + this.getTotal() + " com juros de 10% ";
    }
    
}
