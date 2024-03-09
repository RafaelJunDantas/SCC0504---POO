/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public class FilteredSystem {
    private ProxySistema fs;
    
    public FilteredSystem(ProxySistema fs){
        this.fs = fs;
    }
    
    public void acessoSistema(int codigo){
        if(codigo == 789){
            codigo = 987;
        }
        this.fs.acessoSistema(codigo);
    }
}
