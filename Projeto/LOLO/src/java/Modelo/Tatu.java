/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Auxiliar.Consts;
import Auxiliar.Posicao;
import Auxiliar.UnlockTatu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static Auxiliar.UnlockTatu.*;

/**
 *
 * @author Rodrigues
 */
public class Tatu extends Personagem {

    private int iDirecao = 0;
    private int timer = 0;
    private UnlockTatu canUnlock = LOCK;
    private List<Map<Integer, Integer>> caminho;

    public Tatu(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.setbTransponivel(true);
        this.setID(Consts.ENEMY);
        caminho = criarCriculo();
    }

    //fica andando em circulo até que Lolo pegue a vida de uma dada celula,
    //dai fica indo em linha reta.
    public void autoDesenho(){
        if(canUnlock.equals(UNLOCK) && this.getPosicao().igual(new Posicao(4, 3))) {
            caminho = criarLinhaReta();
            iDirecao = 0;
            canUnlock = UNMODIFY;
        }
        this.setPosicao(
                caminho.get(iDirecao).entrySet().iterator().next().getKey(),
                caminho.get(iDirecao).entrySet().iterator().next().getValue()
        );
        iDirecao++;
        setarImagem(this.getPosicao());

        super.autoDesenho();
        if((iDirecao >= criarCriculo().size() && canUnlock.equals(LOCK)) ||(iDirecao >= criarLinhaReta().size()))
            iDirecao = 0;
    }

    private List<Map<Integer, Integer>> criarCriculo() {
        List<Map<Integer, Integer>> circulo = List.of(
                Map.of(1,2), Map.of(1, 1), Map.of(2, 1),Map.of(3, 1),
                Map.of(4, 1), Map.of(4, 2), Map.of(4, 3), Map.of(3, 3),
                Map.of(2, 3), Map.of(1, 3)
        );
        return circulo;
    }

    private List<Map<Integer, Integer>> criarLinhaReta() {
        List<Map<Integer, Integer>> linhaReta = new ArrayList<>();
        for (int i = 4; i <= 11; i++) {
            linhaReta.add(Map.of(4, i));
        }
        for (int i = 10; i >= 1; i--) {
            linhaReta.add(Map.of(4, i));
        }
        linhaReta.add(Map.of(4, 2));
        linhaReta.add(Map.of(4, 3));
        return linhaReta;
    }

    private void setarImagem(Posicao posicaoAtual) {
        try {
            int moveuHorizontalmente = posicaoAtual.getColuna() - posicaoAtual.getColunaAnterior();
            int moveuVerticalmente = posicaoAtual.getLinha() - posicaoAtual.getLinhaAnterior();

            if(moveuVerticalmente > 0)
                this.setImage("tatuDown.png");
            else if(moveuVerticalmente < 0)
                this.setImage("tatuUp.png");
            else if(moveuHorizontalmente > 0)
                this.setImage("tatuRight.png");
            else if(moveuHorizontalmente < 0)
                this.setImage("tatuLeft.png");
            else
                this.setImage("tatuDown.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public UnlockTatu getCanUnlock() {
        return canUnlock;
    }

    public void setCanUnlock(UnlockTatu canUnlock) {
        this.canUnlock = canUnlock;
    }
}
