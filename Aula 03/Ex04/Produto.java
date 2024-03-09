/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */

import java.util.Date;

public class Produto {
    
    protected int codigo;
    protected float precoUnitario;
    protected String descricao;
    protected int quantidadeEstoque;
    
    public Produto(int codigo, float precoUnitario, String descricao, int quantidadeEstoque){
        this.codigo = codigo;
        this.precoUnitario = precoUnitario;
        this.descricao = descricao;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    public float getPrecoUnitario(){
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }
    
    public int retiraEstoque(int quantidade){
        if(quantidade > this.quantidadeEstoque){
            quantidade = this.quantidadeEstoque;
            this.quantidadeEstoque = 0;
            return quantidade;
        }
        
        else{
            this.quantidadeEstoque = this.quantidadeEstoque - quantidade;
            return quantidade;
        }
    }
    
    public boolean acrescenteEstoque(int quantidade){
        
        if(this.quantidadeEstoque == 0){
            this.quantidadeEstoque = quantidade;
            return true;
        }
        
        return false;
    }
    
    public void imprimeDescricao(){
        System.out.println("Produto " + codigo + ", " + descricao + ", " + "custo de R$" + precoUnitario + ", " + "quantidade " + quantidadeEstoque);
    }
}

