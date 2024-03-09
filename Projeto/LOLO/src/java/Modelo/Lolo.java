/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.io.IOException;
import java.io.Serializable;

import static Auxiliar.Consts.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Junio
 */
public class Lolo extends Personagem implements Serializable{
    private int vida;
    private int shots;
    private int direcao;
    
    public Lolo(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.vida = 3;
        this.setID(LOLO);
        this.shots = 0;
        this.direcao = SUL;
    }
    
    //Vida:
    public int getVida(){
        return vida;
    }
    
    public void setVida(int vida){
        this.vida = vida;
    }
    
    //Shot:
    public int getShots() {
        return shots;
    }
 
    public void setShots(int shots) {
        this.shots = shots;
    }
    
    public Shot pewpew(){
        Shot s = new Shot("shots.png");
        s.setDirecao(this.direcao);

        switch (this.direcao) {
            case NORTE -> {
                s.setPosicao(this.getPosicao().getLinha() - 1, this.getPosicao().getColuna());
                s.setDirecao(NORTE);
            }
            case LESTE -> {
                s.setPosicao(this.getPosicao().getLinha(), this.getPosicao().getColuna() + 1);
                s.setDirecao(LESTE);
            }
            case SUL -> {
                s.setPosicao(this.getPosicao().getLinha() + 1, this.getPosicao().getColuna());
                s.setDirecao(SUL);
            }
            case OESTE -> {
                s.setPosicao(this.getPosicao().getLinha(), this.getPosicao().getColuna() - 1);
                s.setDirecao(OESTE);
            }
        }
        
        return s;
    }
    
    //Movimento:
    public void voltaAUltimaPosicao(){
        this.pPosicao.volta();
    }
    
    public void moveUpLolo() throws IOException{
        this.setImage("loloUp.png");
        this.direcao = NORTE;
        this.moveUp();
    }
    
    public void moveDownLolo() throws IOException{
        this.setImage("loloDown.png");
        this.direcao = SUL;
        this.moveDown();
    }
    
    public void moveLeftLolo() throws IOException{
        this.setImage("loloLeft.png");
        this.direcao = OESTE;
        this.moveLeft();
    }
    
    public void moveRightLolo() throws IOException{
        this.setImage("loloRight.png");
        this.direcao = LESTE;
        this.moveRight();
    }

    public int getDirecao() {
        return direcao;
    }
    
    
}
