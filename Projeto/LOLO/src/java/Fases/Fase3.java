package Fases;

import Auxiliar.Posicao;
import Modelo.Personagem;
import Modelo.Tatu;

import java.io.IOException;

import static Auxiliar.Consts.ENEMY;
import static Auxiliar.Consts.HEART;

public class Fase3 extends Fase {

    public Fase3(int vidas) {
        super(vidas);
        setHearts(6);
        positionChest(6, 2);
        addHeart();
        addTree();
        addPedra();
        addAgua();
        positionMuro();
        setFaseID(3);
        positionHud();
        positionTatu(1, 3);
        setExit(0, 7);
        addCaixa();
        setLolo(11, 11);
        getLolo().setVida(vidas);
        getLolo().setShots(0);
    }

    public void addHeart() {
        positionHeart(9, 2);
        positionHeart(6, 1);
        positionHeart(6, 3);
        positionHeart(4, 4);
        positionHeart(10, 10);
        positionHeart(1, 8);

    }

    public void addTree() {
        positionTree(5, 1);
        positionTree(5, 5);
        positionTree(5, 6);
        positionTree(5, 7);
        positionTree(6, 6);
        positionTree(1, 6);
        positionTree(1, 5);
        positionTree(10, 6);
        positionTree(11, 5);
        positionTree(12, 9);
        positionTree(9, 9);
    }

    public void addGrama() {
        positionGrama(5, 1);
        positionGrama(6, 1);
    }

    public void addPedra() {
        positionPedra(5, 2);
        positionPedra(5, 3);
        positionPedra(5, 4);
        positionPedra(6, 5);
        positionPedra(2, 4);
        positionPedra(3, 4);
        positionPedra(2, 5);
        positionPedra(2, 6);
        positionPedra(1, 4);
        positionPedra(10, 9);
        positionPedra(11, 9);
        positionPedra(9, 10);
        positionPedra(1, 9);
        positionPedra(2, 9);
        positionPedra(2, 8);
    }

    public void addCaixa() {
        positionCaixa(11, 1);
        positionCaixa(11, 2);
        positionCaixa(11, 3);
        positionCaixa(8, 1);
        positionCaixa(8, 2);
        positionCaixa(8, 3);
        positionCaixa(8, 10);
    }

    public void addAgua() {
        for (int i = 6; i <= 11; i++)
            positionAgua(i, 4);

        positionAgua(8, 5);
        positionAgua(9, 5);
        positionAgua(9, 6);
        positionAgua(10, 5);

    }

    public Fase nextPhase() {
        return new TelaGameOver(vidas);
    }

    public Fase restart() {

        return new Fase3(vidas);
    }
}
