/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fases;

/**
 *
 * @author Rafael
 */
public class Fase1 extends Fase{
    
    public Fase1(int vidas){
        super(vidas);
        setHearts(6);
        positionMuro();
        setFaseID(1);
        positionHud();
        addHeart();
        addTree();
        addGrama();
        addCobrinha();
        addPedra();
        positionChest(3,6);
        setExit(0,6);
        setLolo(9,6);
        getLolo().setVida(vidas);
        getLolo().setShots(0);
    } 
    
    public void addCobrinha(){
        positionCobrinha(2,2);
        positionCobrinha(7,4);
        positionCobrinha(7,8);
    }
    
    public void addHeart(){
        positionHeart(2,1);
        positionHeart(1,11);
        positionHeart(1,8);
        positionHeart(12,2);
        positionHeart(12,8);
        positionHeart(12,9);
    }
    
    public void addTree(){
        positionTree(11,11);
        positionTree(12,11);
        positionTree(12,10);
        positionTree(12,7);
        positionTree(12,6);
        positionTree(10,7);
        positionTree(11,7);
        positionTree(10,1);
        positionTree(9,1);
        positionTree(10,2);
        positionTree(8,1);
        positionTree(9,2);
        positionTree(4,1);
        positionTree(3,3);
        positionTree(3,4);
        positionTree(2,3);
        positionTree(2,4);
        positionTree(1,9);
        positionTree(2,9);
        positionTree(1,10);
        positionTree(2,10);
        positionTree(3,10);
    }
    
    public void addGrama(){
        positionGrama(5,1);
        positionGrama(6,1);
        positionGrama(7,1);
        positionGrama(7,2);
        positionGrama(8,2);
        positionGrama(9,10);
        positionGrama(9,11);
        positionGrama(10,10);
        positionGrama(8,11);
        positionGrama(7,11);
    }
    
    public void addPedra(){
        positionPedra(1,1);
        positionPedra(3,1);
        positionPedra(2,8);
        positionPedra(3,8);
        positionPedra(3,9);
        positionPedra(4,9);
        positionPedra(11,6);
        positionPedra(11,5);
        positionPedra(12,5);
        positionPedra(12,4);
        positionPedra(10,11);
        positionPedra(11,10);
        positionPedra(11,1);
        positionPedra(12,1);
        positionPedra(3,1);
        positionPedra(1,1);
    }
    
    public Fase nextPhase(){
        return new Fase2(vidas);
    }
    
    public Fase restart(){
        return new Fase1(vidas);
    }
}
