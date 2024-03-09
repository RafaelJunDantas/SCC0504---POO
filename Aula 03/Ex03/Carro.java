/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public class Carro implements PegadaDeCarbono{
    
    private String modelo;
    private String fabricante;
    private int anoFabricacao;
    private int anosGarantia;
    private int kmLitro;
    
    public Carro(String modelo, String fabricante, int anoFabricacao, int anosGarantia, int kmLitro){
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.anoFabricacao = anoFabricacao;
        this.anosGarantia = anosGarantia;
        this.kmLitro = kmLitro;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public String getFabricante(){
        return fabricante;
    }
    
    public int getAnoFabricacao(){
        return anoFabricacao;
    }
    
    public int getAnosGarantia(){
        return anosGarantia;
    }
    
    public int getKmLitro(){
        return kmLitro;
    }
    
    public int getAnoVencimentoGarantia(){
        return anoFabricacao + anosGarantia;
    }
    
    public boolean estaVencido(int anoAtual){
        return getAnoVencimentoGarantia() < anoAtual;
    }

    public int getPegadaDeCarbono(){
        return 10 * kmLitro;
    }
}
