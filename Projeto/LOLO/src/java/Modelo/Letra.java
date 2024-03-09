/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import static Auxiliar.Consts.LETRA;
import java.io.Serializable;


/**
 *
 * @author Rafael
 */
public class Letra extends Personagem implements Serializable{
    
    public Letra(String nomeImagemPNG){
        super(nomeImagemPNG);
        this.bTransponivel = false;
        this.setID(LETRA);
    }
    
    public void autoDesenho(){
        super.autoDesenho();
    }
}
