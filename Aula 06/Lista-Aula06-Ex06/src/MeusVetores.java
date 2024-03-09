
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public class MeusVetores {
    private ArrayList<Integer> v1;
    private ArrayList<Integer> v2;
    
    public MeusVetores(ArrayList<Integer> v1, ArrayList<Integer> v2){
        this.v1 = v1;
        this.v2 = v2;
    }

    public ArrayList getV1() {
        return v1;
    }

    public ArrayList getV2() {
        return v2;
    }
    
    public void calcula(Operacao op){
        System.out.println("Resultado: " + op.realizaOperacao(this));
        System.out.println();
    }
}
