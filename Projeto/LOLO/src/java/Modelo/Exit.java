/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import static Auxiliar.Consts.EXIT;
import java.io.Serializable;

/**
 *
 * @author Rafael
 */
public class Exit extends Personagem implements Serializable{
    
    public Exit(String nomeImagemPNG){
        super(nomeImagemPNG);
        this.bTransponivel = false;
        this.setID(EXIT);
    }
    
    public void autoDesenho(){
        super.autoDesenho();
    }
    
}
