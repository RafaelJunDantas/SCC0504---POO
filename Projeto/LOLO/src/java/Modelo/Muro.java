/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import static Auxiliar.Consts.MURO;
import java.io.Serializable;

/**
 *
 * @author Rafael
 */
public class Muro extends Personagem  implements Serializable{
    
    public Muro(String nomeImagemPNG) {
        super(nomeImagemPNG);
        this.setID(MURO);
        this.setbTransponivel(false);
    }
    public void autoDesenho(){
        super.autoDesenho();
    }
}
