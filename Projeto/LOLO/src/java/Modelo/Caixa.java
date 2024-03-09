/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import static Auxiliar.Consts.CAIXA;
import java.io.Serializable;

/**
 *
 * @author Rafael
 */
public class Caixa extends Personagem  implements Serializable{
    public Caixa (String nomeImagemPNG){
        super(nomeImagemPNG);
        this.setID(CAIXA);
    }
    
    public void autoDesenho(){
        super.autoDesenho();
    }
}
