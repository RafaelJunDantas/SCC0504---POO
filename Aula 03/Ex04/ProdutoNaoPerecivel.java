/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public class ProdutoNaoPerecivel extends Produto{
    
    private int anosGarantia;
    
    public ProdutoNaoPerecivel(int codigo, int precoUnitario, String descricao, int quantidadeEstoque, int anosGarantia){
        super(codigo, precoUnitario, descricao, quantidadeEstoque);
        this.anosGarantia = anosGarantia;
    }
    
    public int getAnosGarantia(){
        return this.anosGarantia;
    }
    
    public void imprimeDescricao(){
        System.out.println("Produto " + codigo + ", " + descricao + ", " + 
                           "quantidade " + quantidadeEstoque + ", anos de garantia " +
                           anosGarantia);
    }
}
