/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public class Operacao {
    
    private float valor1;
    private float valor2;

    public Operacao(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    public float realizarCalculo(int codigoOperacao){
        
        float resultado = 0;
        
        switch(codigoOperacao){
            case 0 -> resultado = valor1 + valor2;
            case 1 -> resultado = valor1 - valor2;
            case 2 -> resultado = valor1 * valor2;
            case 3 -> resultado = valor1 / valor2;
            default -> System.out.println("Codigo Invalido");
        }
        
        return resultado;
    }
}
