/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */

import java.util.ArrayList;

public class Estoque {
    
    ArrayList<Produto> lista;
    
    public Estoque(){
        this.lista = new ArrayList();
    }
    
    public void cadastrar(Produto p){
        this.lista.add(p);
    }
    
    private Produto buscar_(int codigo){
        for(int i = 0; i < lista.size(); i++){
            if(codigo == lista.get(i).getCodigo()){
                return lista.get(i);
            }
        }
        return null;
    }
    
    public void buscar(int codigo){
        
        Produto p = buscar_(codigo);
        
        if(p == null){
            System.out.println("Produto nao encontrado");
        }
        
        else{
            p.imprimeDescricao();
        }
    }
    
    public void retirar(int codigo, int quantidade){
        
        Produto p = buscar_(codigo);
        
        if(p == null){
            System.out.println("Produto nao encontrado");
        }
        
        else{
            int retirado = p.retiraEstoque(quantidade);
            System.out.println("Quantidade retirada: " + retirado);
        }
    }
    
    public void totalEstoque(){
        int total = 0;
        
        for(int i = 0; i < lista.size(); i++){
            total = total + lista.get(i).quantidadeEstoque;
        }
        
        System.out.println("Total no estoque " + total);
    }
    
    public void listaEstoque(){
        for(int i = 0; i < lista.size(); i++){
            lista.get(i).imprimeDescricao();
        }
    }
}
