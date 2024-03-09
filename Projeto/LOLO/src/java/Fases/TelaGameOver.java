/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fases;

import Auxiliar.Consts;
import Controler.Tela;

import java.awt.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael
 */
public class TelaGameOver extends Fase{
    
    public TelaGameOver(int vidas){
        super(vidas);
        setFaseID(-1);
        imprimirTelaGameOver();
    }

    private void imprimirTelaGameOver() {
          
        for (int i = 0; i <= Consts.RES; i++) {
            for (int j = 0; j <= Consts.RES; j++) {
                positionLetra("GameOver/row-" + i + "-column-" + j + ".png",i-1, j-1);
            }
        }
    
    }

    public Fase nextPhase() {
        return new TelaInicial(vidas);
    }
    
    public Fase restart(){
        return this;
    }
    
}
