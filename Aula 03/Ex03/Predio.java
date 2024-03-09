/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public abstract class Predio implements PegadaDeCarbono{

    public String rua;
    public int pessoas;

    public Predio(String rua, int pessoas) {
        this.rua = rua;
        this.pessoas = pessoas;
    }

    public abstract String getRua();
    
    public abstract int getPessoas();

    public abstract int getPegadaDeCarbono();
}
