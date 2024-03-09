/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import static Auxiliar.Consts.PEDRA;
import java.io.Serializable;

/**
 *
 * @author Rafael
 */
public class Pedra extends Personagem  implements Serializable{
    
    public Pedra(String nomeImagemPNG) {
        super(nomeImagemPNG);
        this.setID(PEDRA);
        this.setbTransponivel(false);
    }
    public void autoDesenho(){
        super.autoDesenho();
    }
}
