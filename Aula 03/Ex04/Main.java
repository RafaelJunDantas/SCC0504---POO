/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Rafael
 */

import java.util.Date;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estoque e = new Estoque();
        
        Date d1 = new Date(2022, 4, 30);
        Date d2 = new Date(2022, 5, 30);
        
        Produto p1 = new Produto(1, 1, "A", 1);      
        ProdutoPerecivel p2 = new ProdutoPerecivel(2, 3, "B", 50, d1);
        ProdutoPerecivelEspecial p3 = new ProdutoPerecivelEspecial(3, 5, "C", 100, d2);
        ProdutoNaoPerecivel p4 = new ProdutoNaoPerecivel(4, 100, "D", 1, 4);
        
        e.cadastrar(p1);
        e.cadastrar(p2);
        e.cadastrar(p3);
        e.cadastrar(p4);
        
        e.buscar(2);
        e.totalEstoque();
        e.retirar(3, 50);
        e.totalEstoque();
        e.listaEstoque();
        
        
    }
    
}
