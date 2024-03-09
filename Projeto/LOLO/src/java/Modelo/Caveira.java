package Modelo;

import Auxiliar.Posicao;
import Auxiliar.UnlockTatu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import static Auxiliar.Consts.ENEMY;
import static Auxiliar.UnlockTatu.*;

public class Caveira extends Personagem{

    private int contador = 0;
    private int timer = 0;
    private int iDirecao = 0;
    private UnlockTatu canUnlock = LOCK;
    private List<Map<Integer, Integer>> caminho;

    public Caveira(String nomeImagemPNG) {
        super(nomeImagemPNG);
        this.setID(ENEMY);
        this.setbTransponivel(true);
    }

    public void viraOvo() throws IOException {
        super.viraOvo();
        this.contador = 50;
    }

    public void autoDesenho(){

        if(this.contador <= 0){
            this.contador = 0;
            try {
                this.setImage("caveira.png");
                this.setbTransponivel(true);
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
        verSePodeCaminhar();
        super.autoDesenho();
        if(iDirecao >= caminharAteVida().size())
            iDirecao = 0;
    }

    public void verSePodeCaminhar(){
        if(canUnlock.equals(UNLOCK) && this.getPosicao().igual(new Posicao(7, 8))) {
            caminho = caminharAteVida();
            iDirecao = 0;
            canUnlock = UNMODIFY;
        }

        if(canUnlock == UNMODIFY && timer == 2) {
            this.setPosicao(
                    caminho.get(iDirecao).entrySet().iterator().next().getKey(),
                    caminho.get(iDirecao).entrySet().iterator().next().getValue()
            );
            iDirecao++;
            setarImagem(this.getPosicao());
        }
        timer++;
        if(timer >= 3)
            timer = 0;
    }

    private List<Map<Integer, Integer>> caminharAteVida() {
        List<Map<Integer, Integer>> caminho = List.of(
                Map.of(6, 8), Map.of(6, 7), Map.of(5, 7),
                Map.of(4, 7), Map.of(3, 7), Map.of(3, 6),
                Map.of(3, 5), Map.of(3, 4), Map.of(3, 3),
                Map.of(2, 3), Map.of(1, 3), Map.of(2, 3),
                Map.of(3, 3), Map.of(3, 4), Map.of(3, 5),
                Map.of(3, 6), Map.of(3, 7), Map.of(4, 7),
                Map.of(5, 7), Map.of(6, 7), Map.of(6, 8),
                Map.of(7, 8)
        );
        return caminho;
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
                this.setImage("caveiraDown.png");
            else if(moveuVerticalmente < 0)
                this.setImage("caveiraUp.png");
            else if(moveuHorizontalmente > 0)
                this.setImage("caveiraRight.png");
            else if(moveuHorizontalmente < 0)
                this.setImage("caveiraLeft.png");
            else
                this.setImage("caveiraDown.png");
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
