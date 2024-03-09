/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public class Bicicleta implements PegadaDeCarbono{
    
    private String modelo;
    private String marca;
    private int aro;
    private int ano;
    
    public Bicicleta(String modelo, String marca, int aro, int ano){
        this.modelo = modelo;
        this.marca = marca;
        this.aro = aro;
        this.ano = ano;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public int getAro(){
        return aro;
    }
    
    public int getAno(){
        return ano;
    }
    
    public int getPegadaDeCarbono(){
        return 3 * (aro - 10);
    }
}
