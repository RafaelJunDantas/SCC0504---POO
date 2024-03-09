/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public class Sistema {
    private int codigoLido;
    private boolean safe = true;
    
    public Sistema(){
        
    }

    public int getCodigoLido() {
        return codigoLido;
    }

    public void setCodigoLido(int codigoLido) {
        this.codigoLido = codigoLido;
    }

    public boolean isSafe() {
        return safe;
    }

    public void setSafe(boolean safe) {
        this.safe = safe;
    }
    
    
    
    public void acessoSistema(int codigo){
        if(codigo == 789){
            System.out.println("Falha de seguranca");
            this.safe = false;
        }
        else{
            this.codigoLido = codigo;
            System.out.println("Bem vindo");
        }
    }
}
