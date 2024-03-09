
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
public class Uniao implements Operacao{

    @Override
    public ArrayList<Integer> realizaOperacao(MeusVetores mv) {
        System.out.println("Realizando Uniao de " + mv.getV1() + " com " + mv.getV2());
        
        ArrayList<Integer> vetorOrdenado = new ArrayList();
        vetorOrdenado.addAll(mv.getV1());
        vetorOrdenado.addAll(mv.getV2());
        Collections.sort(vetorOrdenado);
        
        ArrayList<Integer> vetorSemRepeticao = new ArrayList();
        
        for(int i = 0; i < vetorOrdenado.size(); i++){
            if(!vetorSemRepeticao.contains(vetorOrdenado.get(i))){
                vetorSemRepeticao.add(vetorOrdenado.get(i));
            }
        }
        
        return vetorSemRepeticao;
    }

}
