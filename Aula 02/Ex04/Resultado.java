/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public class Resultado {
    private Data data;
    private Usuario usuario;
    private int codigoOp;
    private String operacao; 
    private Operacao op;
    private float resultado;

    public Resultado(float valor1, float valor2, int codigoOp) {
        this.op = new Operacao(valor1, valor2);
        this.codigoOp = codigoOp;
    }
    
    public void setOperacao() {
        switch(this.codigoOp){
            case 0 -> this.operacao = "Soma";
            case 1 -> this.operacao = "Subtracao";
            case 2 -> this.operacao = "Multiplicacao";
            case 3 -> this.operacao = "Coeficiente";
            default -> this.operacao = "Operacao Invalida";
        } 
        
        this.resultado = op.realizarCalculo(this.codigoOp);
    }

    public void setUsuarioData(Usuario usuario, Data data) {
        this.usuario = usuario;
        this.data = data;
    }
    
    public void printResultado(){
        data.printData();
        usuario.printUsuario();  
        System.out.printf("Operacao: %s%n", operacao);
        System.out.printf("Resultado: %.2f%n%n", resultado);            
    }
    
}
