/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import static Auxiliar.Consts.HEART;
import java.io.Serializable;

/**
 *
 * @author Rafael
 */
public class Heart extends Personagem implements Serializable{
    public Heart(String nomeImagemPNG){
        super(nomeImagemPNG);
        this.setID(HEART);
    }
    
    public void autoDesenho(){
        super.autoDesenho();
    }
    
}
