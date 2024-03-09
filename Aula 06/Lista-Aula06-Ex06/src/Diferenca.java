
import java.util.ArrayList;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public class Diferenca implements Operacao{

    @Override
    public ArrayList realizaOperacao(MeusVetores mv) {
        System.out.println("Realizando Diferenca de " + mv.getV1() + " com " + mv.getV2());
        
        for(int i = 0; i < mv.getV2().size(); i++){
            if(mv.getV1().contains(mv.getV2().get(i))){
                mv.getV1().remove(mv.getV2().get(i));
            }
        }
        
        Collections.sort(mv.getV1());
        
        return mv.getV1();
    }
    
}
