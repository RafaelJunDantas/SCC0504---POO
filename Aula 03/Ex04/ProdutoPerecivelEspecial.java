/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */

import java.util.Date;

public class ProdutoPerecivelEspecial extends ProdutoPerecivel{
    
    public ProdutoPerecivelEspecial(int codigo, float precoUnitario, String descricao, int quantidadeEstoque, Date dataValidade){
        super(codigo, precoUnitario, descricao, quantidadeEstoque, dataValidade);
    }
    
    public void imprimeDescricao(){
        System.out.println("Produto " + codigo + ", " + descricao + ", " + 
                           "quantidade " + quantidadeEstoque + ", data de validade " +
                           dataValidade.getDate() + "/" + dataValidade.getMonth() +
                           "/" + dataValidade.getYear());
    }
}
