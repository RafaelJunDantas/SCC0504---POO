/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public class Escola extends Predio{
    
    String nome;
    
    public Escola(String rua, int numAlunos, String nome){
        super(rua, numAlunos);
        this.nome = nome;
    }
    
    public String getRua(){
        return rua;
    }
    
    public int getPessoas(){
        return pessoas;
    }
    
    public int getPegadaDeCarbono(){
        return 5 * pessoas * 2;
    }
}
