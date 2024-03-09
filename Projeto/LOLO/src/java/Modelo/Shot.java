/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

import static Auxiliar.Consts.*;

/**
 *
 * @author Rafael
 */
public class Shot extends Personagem implements Serializable{
    private int direcao;
    
    public Shot(String nomeImagemPNG) {
        super(nomeImagemPNG);
        this.setID(SHOT);
    }
    
    public void autoDesenho(){
        super.autoDesenho();
        switch (this.direcao) {
            case NORTE:
                try {
                    this.setImage("shotUp.png");
                } catch (IOException ex) {
                    Logger.getLogger(Shot.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.setPosicao(this.getPosicao().getLinha() - 1, this.getPosicao().getColuna());
                break;
            case LESTE:
                try {
                    this.setImage("shotRight.png");
                } catch (IOException ex) {
                    Logger.getLogger(Shot.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.setPosicao(this.getPosicao().getLinha(), this.getPosicao().getColuna() + 1);
                break;
            case SUL:
                try {
                    this.setImage("shotDown.png");
                } catch (IOException ex) {
                    Logger.getLogger(Shot.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.setPosicao(this.getPosicao().getLinha() + 1, this.getPosicao().getColuna());
                break;
            case OESTE:
                try {
                    this.setImage("shotLeft.png");
                } catch (IOException ex) {
                    Logger.getLogger(Shot.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.setPosicao(this.getPosicao().getLinha(), this.getPosicao().getColuna() - 1);
                break;
        }
    }

    public int getDirecao() {
        return direcao;
    }

    public void setDirecao(int direcao) {
        this.direcao = direcao;
    }
    
}
