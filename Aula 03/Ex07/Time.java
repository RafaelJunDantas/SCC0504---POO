/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */
/*
professor autorizou trocar o sistema de pontos pelo sistema olimpico(medalhas)
*/
public class Time implements Comparable{
    
    private final String nome;
    private final int ouro;
    private final int prata;
    private final int bronze;
    
    public Time(String nome, int ouro, int prata, int bronze){
        this.nome = nome;
        this.ouro = ouro;
        this.prata = prata;
        this.bronze = bronze;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getOuro(){
        return ouro;
    }
    
    public int getPrata(){
        return prata;
    }
    
    public int getBronze(){
        return bronze;
    }
    
    public int getTotal(){
        return ouro + prata + bronze;
    }

    public int compareTo(Object o) {
        if(this.ouro > ((Time)o).getOuro()){
            return 1;
        }
        
        else if(this.ouro < ((Time)o).getOuro()){
            return -1;
        }
        
        else{
            if(this.prata > ((Time)o).getPrata()){
                return 1;
            }
            
            else if(this.prata < ((Time)o).getPrata()){
                return -1;
            }
            
            else{
                if(this.bronze > ((Time)o).getBronze()){
                    return 1;
                }
                
                else if(this.bronze < ((Time)o).getBronze()){
                    return -1;
                }
                
                else{
                    return 0;
                }
            }
        }
    }
}
