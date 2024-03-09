/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import static Auxiliar.Consts.GRAMA;
import java.io.Serializable;

/**
 *
 * @author Rafael
 */
public class Grama extends Personagem  implements Serializable{
    public Grama(String nomeImagemPNG){
        super(nomeImagemPNG);
        this.setID(GRAMA);
    }
    
    public void autoDesenho(){
        super.autoDesenho();
    }
}
