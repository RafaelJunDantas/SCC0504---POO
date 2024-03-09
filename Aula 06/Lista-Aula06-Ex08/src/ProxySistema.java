/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public class ProxySistema {
    private Sistema s;
    
    public ProxySistema(Sistema s){
        this.s = s;
    }
    
    public void acessoSistema(int codigo){
        if(codigo == 789){
            System.out.println("Tentativa de desligar sistema");
        }
        else{
            this.s.acessoSistema(codigo);
        }
    }
}
