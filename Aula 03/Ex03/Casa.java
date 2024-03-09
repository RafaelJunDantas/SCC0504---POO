/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public class Casa extends Predio{
    
    float metrosQuadrados;
    
    public Casa(String rua, int numMoradores, float metrosQuadrados) {
        super(rua, numMoradores);
        this.metrosQuadrados = metrosQuadrados;
    }
    
    public String getRua(){
        return rua;
    }
    
    public int getPessoas(){
        return pessoas;
    }
    
    public int getPegadaDeCarbono(){
        return 5 * pessoas / 3;
    }
}
