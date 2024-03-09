/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import static Auxiliar.Consts.ARVORE;
import java.io.Serializable;

/**
 *
 * @author Rafael
 */
public class Arvore extends Personagem implements Serializable{
    
    public Arvore(String nomeImagemPNG){
        super(nomeImagemPNG);
        this.bTransponivel = false;
        this.setID(ARVORE);
    }
    
    public void autoDesenho(){
        super.autoDesenho();
    }
}
