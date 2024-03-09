/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import static Auxiliar.Consts.INFO;
import java.io.Serializable;

/**
 *
 * @author Rafael
 */
public class Info extends Personagem  implements Serializable{
    
    public Info(String nomeImagemPNG) {
        super(nomeImagemPNG);
        this.setID(INFO);
        this.setbTransponivel(false);
    }
    public void autoDesenho(){
        super.autoDesenho();
    }
}
