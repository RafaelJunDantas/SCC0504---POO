/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import static Auxiliar.Consts.AGUA;

import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael
 */
public class Agua extends Personagem  implements Serializable{

    public Agua(String nomeImagemPNG){
        super(nomeImagemPNG);
        this.setID(AGUA);
        this.setbTransponivel(false);
    }


    public void autoDesenho(){
        super.autoDesenho();
    }
}
