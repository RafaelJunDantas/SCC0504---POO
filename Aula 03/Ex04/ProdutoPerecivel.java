/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */

import java.util.Date;

public class ProdutoPerecivel extends Produto{
    
    protected Date dataValidade;
    
    public ProdutoPerecivel(int codigo, float precoUnitario, String descricao, int quantidadeEstoque, Date dataValidade){
        super(codigo, precoUnitario, descricao, quantidadeEstoque);
        this.dataValidade = dataValidade;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }
    
    public int retiraEstoque(int quantidade, Date data){
        long dias = (this.dataValidade.getTime() - data.getTime()) / 86400000; //para converter milisegundo para dia
                                                                               //basta dividir a quantidade 
        if(dias < 0){                                                          //de milisegundos por 86400000
            dias = dias * (-1);
        }
        
        if(dias < 30){
            return 0;
        }
        
        else{
            return super.retiraEstoque(quantidade);
        }
    }
    
}
