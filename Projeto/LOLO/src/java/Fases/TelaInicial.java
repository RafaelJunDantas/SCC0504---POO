/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fases;

import Auxiliar.Consts;

/**
 *
 * @author Rafael
 */
public class TelaInicial extends Fase{
    
    public TelaInicial(int vidas){
        super(vidas);
        setFaseID(0);
        setLolo(8,5);
        positionMuro();
        positionHud();
        imprimiTelaInicial();

    }
    
    public Fase nextPhase() {
        return new Fase1(vidas);
    }
    
    public Fase restart() {
        return new TelaInicial(vidas);
    }
    
    public void imprimiTelaInicial(){   
        int row = 1;
        int col = 1;
        for (int i = 0; i < Consts.RES; i++) {
            for (int j = 0; j < Consts.RES; j++) {
                row = i + 1;
                col = j + 1;
                positionLetra("menu/" + "row-"+ row + "-column-"+ col + ".png",i, j); //a
            }
        }
    }

    
}
