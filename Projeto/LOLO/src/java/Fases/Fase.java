/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fases;

import Auxiliar.Posicao;
import Modelo.*;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import static Auxiliar.Consts.*;



/**
 *
 * @author Rafael
 */
public abstract class Fase implements Serializable{
    
    protected int faseID;
    protected int hearts;
    protected int vidas;
    protected ArrayList<Personagem> personagens;
    protected Posicao exitPosition;
    
    protected Fase(int vidas){
        this.personagens = new ArrayList<>();
        this.vidas = vidas;
    }
    
    //metodos:
    
    //Fase:
    public abstract Fase nextPhase();
    
    public abstract Fase restart();
    
    public int getFaseID() {
        return faseID;
    }
    
    public void setFaseID(int faseAtual) {
        this.faseID = faseAtual;
    }
    
    //Personagem:
    public void addPersonagem(Personagem umPersonagem) {
        this.personagens.add(umPersonagem);
    }
    
    public void removePersonagem(Personagem umPersonagem) {
        this.personagens.remove(umPersonagem);
    }
    
    public ArrayList<Personagem> getPersonagens() {
        return personagens;
    }
    
    public void setPersonagens(ArrayList<Personagem> personagens) {
        this.personagens = personagens;
    }
    
    public void killEnemys(){
        for(int i = 0; i < personagens.size(); i++){
            if(personagens.get(i).getID() == ENEMY){
                removePersonagem(personagens.get(i));
                killEnemys();
            }
        }
    }
    
    //Heart:
    public int getHearts() throws IOException {
        return this.hearts;
    }
    
    public void setHearts(int hearts) {
        this.hearts = hearts;
    }
    
    public void positionHeart(int linhas, int colunas){
        Heart h = new Heart("heart.png");
        h.setPosicao(linhas, colunas);
        addPersonagem(h);
    }
    public void positionTatu(int linhas, int colunas){
        Tatu tatu = new Tatu("tatuDown.png");
        tatu.setPosicao(linhas, colunas);
        addPersonagem(tatu);
    }
    
    //Lolo:
    public Lolo getLolo() {
        for(int i = 0; i < this.personagens.size(); i++){
            if(this.personagens.get(i).getID() == LOLO){
                return (Lolo)this.personagens.get(i);
            }
        }
        return null;
    }
    
    public void setLolo(int linhas, int colunas){
        Lolo lolo = new Lolo("lolo.png");
        lolo.setPosicao(linhas, colunas);
        addPersonagem(lolo);
    }
    
    public void loloPewPew(){
        if(this.getLolo().getShots() > 0){
            addPersonagem(this.getLolo().pewpew());
            this.getLolo().setShots(this.getLolo().getShots() - 1);
        }
    }
    
    //Exit:
    public Posicao getExitPosition(){
        return exitPosition;
    }
    
    public void setExit(int linhas, int colunas){
        Exit e = new Exit("exitClose.png");
        e.setPosicao(linhas, colunas);
        exitPosition = new Posicao(linhas, colunas);
        for(int i  = 0; i < this.personagens.size(); i++){
            if(this.personagens.get(i).getPosicao().getLinha() == exitPosition.getLinha() &&
                    this.personagens.get(i).getPosicao().getColuna() == exitPosition.getColuna()){
                this.personagens.remove(i);
            }
        }
        addPersonagem(e);
    }
    
    public void unlockExit() throws IOException{
        for(int i = 0; i < this.personagens.size(); i++){
            if(this.personagens.get(i).getID() == EXIT){
                this.personagens.get(i).setbTransponivel(true);
                this.personagens.get(i).setImage("exitOpen.png");
            }
        }
    }
    
    //Muro:
    public void positionMuro(){   
        
        for(int i = 0; i < RES; i++){            //linha 0 coluna i
            Muro m = new Muro("muro3.png");   
            m.setPosicao(0, i);
            addPersonagem(m);   
        }
        
        for(int i = 0; i < RES; i++){            //linha i coluna 0
            Muro m = new Muro("muro2.png");
            m.setPosicao(i, 0);
            addPersonagem(m);   
        }
        
        for(int i = RES - 1; i >= 0; i--){           //linha 12 coluna i
            Muro m = new Muro("muro2.png");
            m.setPosicao(i,RES - 2);
            addPersonagem(m);   
        }
        
        for(int i = 0; i < RES; i++){            //linha 13 coluna i
            Muro m = new Muro("muro1.png");
            m.setPosicao(RES - 1, i);
            addPersonagem(m);   
        }
        
        
    }
    
    //Letra:
    public void positionLetra(String letraPNG, int linhas, int colunas){
        Letra l = new Letra(letraPNG);
        l.setPosicao(linhas, colunas);
        addPersonagem(l);
    }
    
    //Cobrinha:
    public void positionCobrinha(int linhas, int colunas){
        Cobrinha c = new Cobrinha("cobrinha.png");
        c.setPosicao(linhas, colunas);
        addPersonagem(c);
    }

    //Caveira:
    public void positionCaveira(int linhas, int colunas){
        Caveira c = new Caveira("caveira.png");
        c.setPosicao(linhas, colunas);
        addPersonagem(c);
    }
    
    //Chest:
    public void positionChest(int linhas, int colunas){
        Chest c = new Chest("chestClose.png");
        c.setPosicao(linhas, colunas);
        addPersonagem(c);
    }
    
    public void unlockChest() throws IOException{
        for(int i = 0; i < this.personagens.size(); i++){
            if(this.personagens.get(i).getID() == CHEST){
                Chest c = (Chest)personagens.get(i);
                if(c.isTemChave()){
                    this.personagens.get(i).setImage("chestOpen.png");
                }
            }
        }
        
    }
    
    //Pedra:
    public void positionPedra(int linhas, int colunas){
        Pedra p = new Pedra("pedra.png");
        p.setPosicao(linhas, colunas);
        addPersonagem(p);
    }
    
    //Agua:
    public void positionAgua(int linhas, int colunas){
        Agua a = new Agua("agua1.png");
        a.setPosicao(linhas, colunas);
        addPersonagem(a);
    }
    
    //Arvore:
    public void positionTree(int linhas, int colunas){
        Arvore a = new Arvore("arvore.png");
        a.setPosicao(linhas, colunas);
        addPersonagem(a);
    }
    
    //Grama:
    public void positionGrama(int linhas, int colunas){
        Grama g = new Grama("grama.png");
        g.setPosicao(linhas, colunas);
        addPersonagem(g);
    }
    
    //Caixa:
    public void positionCaixa(int linhas, int colunas){
        Caixa c = new Caixa("caixa.png");
        c.setPosicao(linhas, colunas);
        addPersonagem(c);
    }

    public boolean canUnlockTatu() throws IOException {
        for (int i = 0; i < this.personagens.size(); i++) {
            if (this.personagens.get(i).getID() == HEART) {
                Personagem p = personagens.get(i);
                if (p.getPosicao().getColuna() == 4 && p.getPosicao().getLinha() == 4) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean canUnlockCaveira() throws IOException {
        return this.hearts == 0;
    }

    //Hud:
    public void updateHud(int infoID, int newValue) throws IOException{
        switch (infoID) {
            case LOLO:
                switch (newValue) {
                    case 5:
                        for (Personagem p : personagens) {
                            if (p.getID() == INFOLOLO) {
                                p.setImage("5.png");
                            }
                        }
                        break;
                    case 4:
                        for (Personagem p : personagens) {
                            if (p.getID() == INFOLOLO) {
                                p.setImage("4.png");
                            }
                        }
                        break;
                    case 3:
                        for (Personagem p : personagens) {
                            if (p.getID() == INFOLOLO) {
                                p.setImage("3.png");
                            }
                        }
                        break;
                    case 2:
                        for (Personagem p : personagens) {
                            if (p.getID() == INFOLOLO) {
                                p.setImage("2.png");
                            }
                        }
                        break;
                    case 1:
                        for (Personagem p : personagens) {
                            if (p.getID() == INFOLOLO) {
                                p.setImage("1.png");
                            }
                        }
                        break;
                    default:
                        for (Personagem p : personagens) {
                            if (p.getID() == INFOLOLO) {
                                p.setImage("0.png");
                            }
                        }
                        break;
                }
                break;
            case SHOT:
                switch (newValue) {
                    case 5:
                        for (Personagem p : personagens) {
                            if (p.getID() == INFOSHOT) {
                                p.setImage("5.png");
                            }
                        }
                        break;
                    case 4:
                        for (Personagem p : personagens) {
                            if (p.getID() == INFOSHOT) {
                                p.setImage("4.png");
                            }
                        }
                        break;
                    case 3:
                        for (Personagem p : personagens) {
                            if (p.getID() == INFOSHOT) {
                                p.setImage("3.png");
                            }
                        }
                        break;
                    case 2:
                        for (Personagem p : personagens) {
                            if (p.getID() == INFOSHOT) {
                                p.setImage("2.png");
                            }
                        }
                        break;
                    case 1:
                        for (Personagem p : personagens) {
                            if (p.getID() == INFOSHOT) {
                                p.setImage("1.png");
                            }
                        }
                        break;
                    default:
                        for (Personagem p : personagens) {
                            if (p.getID() == INFOSHOT) {
                                p.setImage("0.png");
                            }
                        }
                        break;
                }
                break;
            case HEART:
                switch (newValue) {
                    case 5:
                        for (Personagem p : personagens) {
                            if (p.getID() == INFOHEART) {
                                p.setImage("5.png");
                            }
                        }
                        break;
                    case 4:
                        for (Personagem p : personagens) {
                            if (p.getID() == INFOHEART) {
                                p.setImage("4.png");
                            }
                        }
                        break;
                    case 3:
                        for (Personagem p : personagens) {
                            if (p.getID() == INFOHEART) {
                                p.setImage("3.png");
                            }
                        }
                        break;
                    case 2:
                        for (Personagem p : personagens) {
                            if (p.getID() == INFOHEART) {
                                p.setImage("2.png");
                            }
                        }
                        break;
                    case 1:
                        for (Personagem p : personagens) {
                            if (p.getID() == INFOHEART) {
                                p.setImage("1.png");
                            }
                        }
                        break;
                    case 0:
                        for (Personagem p : personagens) {
                            if (p.getID() == INFOHEART) {
                                p.setImage("0.png");
                            }
                        }
                        break;
                }
                break;
            default:
                break;
        }
    }
    
    public void positionHud(){
        for(int i = 0; i < RES; i++){
            Info in = new Info("fundoPreto.png");
            in.setPosicao(i,RES - 1);    
            addPersonagem(in);
        }
        
        Info lolo = new Info("lolo.png");
        lolo.setPosicao(2,RES - 1);
        addPersonagem(lolo);
        
        Info num1 = new Info("0.png");
        num1.setPosicao(3,RES - 1);
        num1.setID(INFOLOLO);
        addPersonagem(num1);
        
        Info shots = new Info("shot.png");
        shots.setPosicao(5,RES - 1);
        addPersonagem(shots);
        
        Info num2 = new Info("0.png");
        num2.setPosicao(6,RES - 1);
        num2.setID(INFOSHOT);
        addPersonagem(num2);
        
        Info heart = new Info("heart.png");
        heart.setPosicao(8,RES - 1);
        addPersonagem(heart);
        
        Info num3 = new Info("0"+ ".png");
        num3.setPosicao(9,RES - 1);
        num3.setID(INFOHEART);
        addPersonagem(num3); 
    }
    
    //Compare:
    public boolean compareLoloExit(){
        return this.getLolo().getPosicao().igual(exitPosition);
    }
    
    public boolean compareLoloEnemy(){
        for(Personagem p : this.personagens){
            if(p.getID() == ENEMY){
                if(this.getLolo().getPosicao().igual(p.getPosicao())){
                    this.vidas--;
                    this.getLolo().setVida(this.getLolo().getVida() - 1);
                    return true;
                }              
            }
        }
        
        return false;
    }
    
    public boolean compareLoloChest() throws IOException{
        for(int i = 0; i < this.personagens.size(); i++){
            if(this.personagens.get(i).getID() == CHEST){
                Personagem p = personagens.get(i);
                if(this.getLolo().getPosicao().igual(p.getPosicao())){
                    killEnemys();
                    p.setImage("chestEmpty.png");
                    Chest c = (Chest)p;
                    c.setTemChave(false);
                    return true;
                }
            }
        }
        return false;
    }
    
    public void compareLoloHeart(){
        Personagem p;
        for(int i = 0; i < this.personagens.size(); i++){
            p = personagens.get(i);
            if(p.getID() == HEART){
                if(this.getLolo().getPosicao().igual(p.getPosicao())){
                    this.hearts--;
                    this.getLolo().setShots(this.getLolo().getShots() + 1);
                    this.personagens.remove(p);
                }
            }
        }
    }
    
    public void compareShotEnviroment() throws IOException{
        for(int i = 0; i < personagens.size(); i++){
            if(personagens.get(i).getID() == SHOT){
                Personagem shot = (Shot)personagens.get(i);
                for(int j = 0; j < personagens.size(); j++){
                    Personagem enviroment = personagens.get(j);
                    if(enviroment.getID() == ENEMY){
                        if(shot.getPosicao().igual(enviroment.getPosicao()) && !enviroment.isOvo()){
                            enviroment.viraOvo();
                            removePersonagem(shot);
                        }
                        else if(shot.getPosicao().igual(enviroment.getPosicao()) && enviroment.isOvo()){
                            this.removePersonagem(enviroment);
                            this.removePersonagem(shot);
                        }
                    }
                    else if(enviroment.isbTransponivel() == false && shot.getPosicao().igual(enviroment.getPosicao())){
                            removePersonagem(shot);
                        }
                }
            }
        }
    }
    
    public void comparePersonagemEnviroment(){
        for(int i = 0; i < personagens.size(); i++){
            Personagem p = personagens.get(i);
            if(p.getID() == ENEMY || p.getID() == LOLO){
                for(int j = 0; j < personagens.size(); j++){
                    if(personagens.get(j).isbTransponivel() == false && personagens.get(j).getPosicao().igual(p.getPosicao())){
                        p.getPosicao().volta();
                        personagens.get(j).getPosicao().volta();
                    }
                }
            }
        }
    }
    
    
    //metodo de inicializacao
    //Start:
    public Fase Start() throws IOException{
        
        if(this.getFaseID() == 0 || this.getFaseID() == -1){
            return this;
        }
        
        this.updateHud(LOLO, this.getLolo().getVida());
        this.updateHud(SHOT, this.getLolo().getShots());
        this.updateHud(HEART, this.hearts);
        
        this.comparePersonagemEnviroment();
        this.compareShotEnviroment();
        this.compareLoloHeart();
                
        if(this.compareLoloEnemy()){
            return this.restart();
        }
        
        if(this.vidas == 0 && this.faseID != -2){
            return new TelaGameOver(vidas);
        }
        
        if(this.getHearts() == 0){
            this.unlockChest();
            if(this.compareLoloChest()){
                this.unlockExit();
            }
            if(this.compareLoloExit()){
                return this.nextPhase();
            }
        }
        return this;
    }
}
