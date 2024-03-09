/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public class Usuario {
    
    private String nome;
    private String CPF;
    private int idade;

    public Usuario(String nome, String CPF, int idade) {
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
    }
    
    public void printUsuario(){
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("CPF: %s%n", CPF);
        System.out.printf("Idade: %d%n", idade);
    }
}
