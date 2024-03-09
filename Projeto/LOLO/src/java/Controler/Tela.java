/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Tela.java
 *
 * Created on 03/03/2011, 18:28:20
 */
package Controler;

import Auxiliar.Posicao;
import Auxiliar.UnlockTatu;
import Fases.Fase;
import Modelo.Caveira;
import Modelo.Personagem;
import Auxiliar.Consts;
import static Auxiliar.Consts.CAIXA;
import Auxiliar.Desenho;
import Fases.TelaInicial;
import Modelo.Lolo;
import Modelo.Tatu;
import Modelo.*;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import static Auxiliar.Consts.ENEMY;
import static Auxiliar.Consts.LESTE;
import static Auxiliar.Consts.NORTE;
import static Auxiliar.Consts.OESTE;
import static Auxiliar.Consts.SUL;
import Fases.*;
import java.io.FileNotFoundException;

import javax.swing.*;

/**
 *
 * @author junio
 */
public class Tela extends javax.swing.JFrame implements MouseListener, KeyListener {

    private Fase fase;
    private Fase faseBackup;
    private ControleDeJogo cj = new ControleDeJogo();
    private Graphics g2;
    private JFrame menu = new JFrame("Menu");
    
    /**
     * Creates new form tabuleiro
     */
    public Tela() {
        Desenho.setCenario(this);
        initComponents();
        this.addMouseListener(this); /*mouse*/

        this.addKeyListener(this);   /*teclado*/
        
        /*Cria a janela do tamanho do tabuleiro + insets (bordas) da janela*/
        this.setSize(Consts.RES * Consts.CELL_SIDE + getInsets().left + getInsets().right,
                Consts.RES * Consts.CELL_SIDE + getInsets().top + getInsets().bottom);
        
        this.menu.setSize(Consts.RES * Consts.CELL_SIDE + getInsets().left + getInsets().right,
                Consts.RES * Consts.CELL_SIDE + getInsets().top + getInsets().bottom);
        this.menu.setVisible(false);
        
        
        this.fase = new TelaInicial(5);
    }
    
    public Graphics getGraphicsBuffer(){
        return g2;
    }
    
    public void paint(Graphics gOld) {
        Graphics g = this.getBufferStrategy().getDrawGraphics();
        /*Criamos um contexto gráfico*/
        g2 = g.create(getInsets().left, getInsets().top, getWidth() - getInsets().right, getHeight() - getInsets().top);
        /*************Desenha cenário de fundo**************/
        for (int i = 0; i < Consts.RES; i++) {
            for (int j = 0; j < Consts.RES; j++) {
                try {
                    Image newImage = Toolkit.getDefaultToolkit().getImage(new java.io.File(".").getCanonicalPath() + Consts.PATH + "bricks.png");
                    g2.drawImage(newImage,
                            j * Consts.CELL_SIDE, i * Consts.CELL_SIDE, Consts.CELL_SIDE, Consts.CELL_SIDE, null);
                } catch (IOException ex) {
                    Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        try {
            this.fase = this.fase.Start();
        } catch (IOException ex) {
            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        if(!fase.getPersonagens().isEmpty()) {
            this.cj.desenhaTudo(fase.getPersonagens());
        }
        

        g.dispose();
        g2.dispose();
        if (!getBufferStrategy().contentsLost()) {
            getBufferStrategy().show();
        }
    }
    
    public void go() {
        TimerTask task = new TimerTask() {
            public void run() {
                repaint();
            }
        };
        
        Timer timer = new Timer();
        timer.schedule(task, 0, Consts.PERIOD);
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_C) {
            fase.getPersonagens().clear();
        } else if (e.getKeyCode() == KeyEvent.VK_L) {
            /*try {
                File tanque = new File("Teste.zip");
                FileInputStream canoOut = new FileInputStream(tanque);
                GZIPInputStream compactador = new GZIPInputStream(canoOut);
                ObjectInputStream serializador = new ObjectInputStream(compactador);
                ArrayList<Personagem> p = fase.getPersonagens();
                p = (ArrayList<Personagem>)serializador.readObject();
                Lolo l = this.fase.getLolo();
                serializador.close();
            } catch (Exception ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            /*try {
                File tanque = new File("Teste.zip");
                tanque.createNewFile();
                FileOutputStream canoOut = new FileOutputStream(tanque);
                GZIPOutputStream compactador = new GZIPOutputStream(canoOut);
                ObjectOutputStream serializador = new ObjectOutputStream(compactador);
                serializador.writeObject(this.fase.getPersonagens());
                serializador.flush();
                serializador.close();
            } catch (IOException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            try {
                fase.getLolo().moveUpLolo();
            } catch (IOException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            try {
                fase.getLolo().moveDownLolo();
            } catch (IOException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            try {
                fase.getLolo().moveLeftLolo();
            } catch (IOException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            try {
                fase.getLolo().moveRightLolo();
            } catch (IOException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getKeyCode() == KeyEvent.VK_ENTER){
            if(this.fase.getFaseID() == 0){
                this.fase = this.fase.nextPhase();
            }
        } else if(e.getKeyCode() == KeyEvent.VK_SPACE){
            fase.loloPewPew();
        } else if(e.getKeyCode() == KeyEvent.VK_M){
            if(menu.isVisible()){
                menu.setVisible(false);
                fase = faseBackup;
            }
            else{
//                menu.setVisible(true);
                new JOptionPaneExample().displayGUI();
                faseBackup = fase;
                fase = new FaseTeste(5);
            }
        } else if(e.getKeyCode() == KeyEvent.VK_1 && fase.getFaseID() == -2){
            try {
                Cobrinha c = (Cobrinha)loadPersonagem("Cobrinha");
                c.setPosicao(5, 2);
                fase.addPersonagem(c);
            } catch (IOException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(e.getKeyCode() == KeyEvent.VK_2 && fase.getFaseID() == -2){
            try {
                Caveira c = (Caveira)loadPersonagem("Caveira");
                c.setPosicao(7, 8);
                fase.addPersonagem(c);
            } catch (IOException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(e.getKeyCode() == KeyEvent.VK_3 && fase.getFaseID() == -2){
            try {
                Tatu t = (Tatu)loadPersonagem("Tatu");
                t.setPosicao(11, 2);
                fase.addPersonagem(t);
            } catch (IOException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(e.getKeyCode() == KeyEvent.VK_4 && fase.getFaseID() == -2){
            try {
                Arvore a = (Arvore)loadPersonagem("Arvore");
                a.setPosicao(12, 1);
                fase.addPersonagem(a);
            } catch (IOException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(e.getKeyCode() == KeyEvent.VK_5 && fase.getFaseID() == -2){
            try {
                Pedra p = (Pedra)loadPersonagem("Pedra");
                p.setPosicao(12, 2);
                fase.addPersonagem(p);
            } catch (IOException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(e.getKeyCode() == KeyEvent.VK_6 && fase.getFaseID() == -2){
            try {
                Agua a = (Agua)loadPersonagem("Agua");
                a.setPosicao(12, 3);
                fase.addPersonagem(a);
            } catch (IOException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(e.getKeyCode() == KeyEvent.VK_7 && fase.getFaseID() == -2){
            try {
                Grama g = (Grama)loadPersonagem("Grama");
                g.setPosicao(12, 4);
                fase.addPersonagem(g);
            } catch (IOException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(e.getKeyCode() == KeyEvent.VK_8 && fase.getFaseID() == -2){
            try {
                Caixa c = (Caixa)loadPersonagem("Caixa");
                c.setPosicao(10, 9);
                fase.addPersonagem(c);
            } catch (IOException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(e.getKeyCode() == KeyEvent.VK_F1 && fase.getFaseID() == -2){
            fase = new Fase1(5);
            fase.setFaseID(-2);
        } else if(e.getKeyCode() == KeyEvent.VK_F2 && fase.getFaseID() == -2){
            fase = new Fase2(5);
            fase.setFaseID(-2);
        } else if(e.getKeyCode() == KeyEvent.VK_F3 && fase.getFaseID() == -2){
            fase = new Fase3(5);
            fase.setFaseID(-2);
        }
        
        if (!cj.ehPosicaoValida(fase.getPersonagens(), fase.getLolo().getPosicao())) {
            fase.getLolo().voltaAUltimaPosicao();
        }
        
        verSeCaveiraEstaLivre();
        verSeTatuEstaLivre();
        moverCaixa();
        

        this.setTitle("-> Cell: " + (fase.getLolo().getPosicao().getLinha()) + ", "
                + (fase.getLolo().getPosicao().getColuna()));

        //repaint(); /*invoca o paint imediatamente, sem aguardar o refresh*/
    }
    
    private ArrayList<Personagem> loadFase(String fase) throws FileNotFoundException, IOException, ClassNotFoundException{
        File tanque = new File(fase+".zip");
        FileInputStream canoOut = new FileInputStream(tanque);
        GZIPInputStream compactador = new GZIPInputStream(canoOut);
        ObjectInputStream serializador = new ObjectInputStream(compactador);
        ArrayList<Personagem> p = (ArrayList<Personagem>)serializador.readObject();
        serializador.close();
        return p;
    }
    
    private Personagem loadPersonagem(String nome) throws FileNotFoundException, IOException, ClassNotFoundException{
        File tanque = new File(nome+".zip");
        FileInputStream canoOut = new FileInputStream(tanque);
        GZIPInputStream compactador = new GZIPInputStream(canoOut);
        ObjectInputStream serializador = new ObjectInputStream(compactador);
        Personagem p = (Personagem)serializador.readObject();
        serializador.close();
        return p;
    }

    private void verSeCaveiraEstaLivre() {
        try {
            if(fase.canUnlockCaveira()) {
                Personagem caveira  = this.fase.getPersonagens().stream()
                        .filter(p -> p.getID() == ENEMY)
                        .filter(p -> p.getPosicao().igual(new Posicao(7, 8)))
                        .findFirst()
                        .orElse(null);
                if(caveira instanceof Caveira temp) {
                    if (temp.getCanUnlock().equals(UnlockTatu.LOCK))
                        temp.setCanUnlock(UnlockTatu.UNLOCK);
                }
            }
        } catch (IOException m) {
            m.printStackTrace();
        }
    }

    private void verSeTatuEstaLivre() {
        try {
            if(fase.canUnlockTatu()) {
                Personagem tatu  = this.fase.getPersonagens().stream()
                        .filter(p -> p.getID() == ENEMY)
                        .findFirst()
                        .orElse(null);
                if(tatu instanceof Tatu) {
                    Tatu temp = (Tatu) tatu;
                    if (temp.getCanUnlock().equals(UnlockTatu.LOCK))
                        temp.setCanUnlock(UnlockTatu.UNLOCK);
                }
            }
        } catch (IOException m) {
            m.printStackTrace();
        }
    }
    
    public void moverCaixa(){
        Lolo lolo = fase.getLolo();
        for(Personagem p : fase.getPersonagens()){
            if(p.getID() == CAIXA && p.getPosicao().igual(lolo.getPosicao())){
                if(lolo.getDirecao() == NORTE && podeAndar(p.getPosicao().getLinha()-1, p.getPosicao().getColuna())){
                    p.moveUp();
                }
                else if(lolo.getDirecao() == LESTE && podeAndar(p.getPosicao().getLinha(), p.getPosicao().getColuna()+1)){
                    p.moveRight();
                }
                else if(lolo.getDirecao() == SUL && podeAndar(p.getPosicao().getLinha()+1, p.getPosicao().getColuna())){
                    p.moveDown();
                }
                else if(lolo.getDirecao() == OESTE && podeAndar(p.getPosicao().getLinha(), p.getPosicao().getColuna()-1)){
                    p.moveLeft();
                }
                else{
                    lolo.voltaAUltimaPosicao();
                }
            }
        }
    }
    
    public boolean podeAndar(int linha, int coluna){
        Posicao pos = new Posicao(linha, coluna);
        for(Personagem p : fase.getPersonagens()){
            if(p.getPosicao().igual(pos)){
                return false;
            }
        }
        return true;
    }

    public void mousePressed(MouseEvent e) {
        /* Clique do mouse desligado
         int x = e.getX();
         int y = e.getY();
     
         this.setTitle("X: "+ x + ", Y: " + y +
         " -> Cell: " + (y/Consts.CELL_SIDE) + ", " + (x/Consts.CELL_SIDE));
        
         this.lLolo.getPosicao().setPosicao(y/Consts.CELL_SIDE, x/Consts.CELL_SIDE);
         */
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POO2015-1 - Adventures of lolo");
        setAutoRequestFocus(false);
        setResizable(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    public void mouseMoved(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }
}
