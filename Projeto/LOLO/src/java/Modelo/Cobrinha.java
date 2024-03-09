/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.util.Random;
import static Auxiliar.Consts.ENEMY;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Rafael
 */
public class Cobrinha extends Personagem  implements Serializable{
    
    private int contador = 0;
    
    public Cobrinha(String nomeImagemPNG) {
        super(nomeImagemPNG);
        this.setID(ENEMY);
        this.setbTransponivel(false);
    }
    
    public void viraOvo() throws IOException{
        super.viraOvo();
        this.contador = 50;
    }
    
    public void autoDesenho(){
        /*Random rand = new Random();
        int iDirecao = rand.nextInt(85);
        switch (iDirecao) {
            case 1 -> this.getPosicao().moveUp();
            case 2 -> this.getPosicao().moveRight();
            case 3 -> this.getPosicao().moveDown();
            case 4 -> this.getPosicao().moveLeft();
        }*/
        if(this.contador <= 0){
            this.contador = 0;
            try {
                this.setImage("cobrinha.png");
            } catch (IOException ex) {
                Logger.getLogger(Cobrinha.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setOvo(false);
        }
        
        this.contador--;
        
        if(this.contador == 25){
            try {
                super.viraOvoQuebrado();
            } catch (IOException ex) {
                Logger.getLogger(Cobrinha.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        super.autoDesenho();
    }
}
