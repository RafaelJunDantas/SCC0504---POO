/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import static Auxiliar.Consts.CHEST;
import java.io.Serializable;

/**
 *
 * @author Rafael
 */
public class Chest extends Personagem  implements Serializable{
    
    private boolean temChave = true;
    
    public Chest (String nomeImagemPNG){
        super(nomeImagemPNG);
        this.setID(CHEST);
        //this.setbTransponivel(false);
    }

    public boolean isTemChave() {
        return temChave;
    }

    public void setTemChave(boolean temChave) {
        this.temChave = temChave;
    }
    
    public void autoDesenho(){
        super.autoDesenho();
    }
}
