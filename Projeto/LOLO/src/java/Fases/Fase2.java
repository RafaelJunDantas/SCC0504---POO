/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fases;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Rafael
 */
public class Fase2 extends Fase{
    
    public Fase2(int vidas){
        super(vidas);
        setHearts(7);
        positionChest(1, 1);
        addHeart();
        addTree();
        addPedra();
        positionMuro();
        positionCobrinha(8, 5);
        addCaveira();
        setFaseID(2);
        positionHud();
        setExit(0, 7);
        setLolo(9, 11);
        getLolo().setVida(vidas);
        getLolo().setShots(0);
    }
    public void addCaveira() {
        positionCaveira(3, 5);
        positionCaveira(7, 8);
    }

        public void addHeart(){
        positionHeart(11, 1);
        positionHeart(7, 1);
        positionHeart(7, 1);
        positionHeart(1,3);
        positionHeart(1, 7);
        positionHeart(7, 6);
        positionHeart(10, 7);
    }

    public void addTree(){
        positionTree(11,4);
        positionTree(12, 2);
        positionTree(8, 1);
        positionTree(6, 2);
        positionTree(1, 2);
        positionTree(1, 4);
        positionTree(1, 5);
        positionTree(1, 6);
        positionTree(1, 8);
        positionTree(2, 8);
        positionTree(4, 8);
        positionTree(4, 10);
        positionTree(3, 10);
        positionTree(7, 7);
        positionTree(7, 5);
        positionTree(7, 3);
        positionTree(2, 6);
        positionTree(2, 4);
        positionTree(5, 6);
        positionTree(6, 6);
        positionTree(8, 11);
        positionTree(9, 10);
        positionTree(9, 9);
        positionTree(9, 7);
        positionTree(9, 4);
        positionTree(11, 6);
        positionTree(11, 7);
        positionTree(10, 8);
        positionTree(11, 10);
        positionTree(12, 10);
    }

    public void addGrama(){
        positionGrama(5,1);
        positionGrama(6,1);
    }

    public void addPedra(){
        positionPedra(12,1);
        positionPedra(11, 12);
        positionPedra(12, 4);
        positionPedra(6, 1);
        positionPedra(5, 2);
        positionPedra(4, 2);
        positionPedra(3, 8);
        positionPedra(2, 10);
        positionPedra(5, 10);
        positionPedra(7, 9);
        positionPedra(7, 4);
        positionPedra(5, 4);
        positionPedra(3, 2);
        positionPedra(4, 4);
        positionPedra(4, 6);
        positionPedra(9, 8);
        positionPedra(9, 6);
        positionPedra(9, 5);
        positionPedra(9, 3);
        positionPedra(12, 9);
    }
    public Fase nextPhase(){
        return new Fase3(vidas);
    }
    
    public Fase restart(){
        return new Fase2(vidas);
    }
}
