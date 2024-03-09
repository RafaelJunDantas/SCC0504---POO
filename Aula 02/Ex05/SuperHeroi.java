package lista.aula02.ex05;

/**
 *
 * @author Rafael
 */
public class SuperHeroi extends Personagem{

    public SuperHeroi(String nome, String nomeReal, Superpoder[] poderes, int vida) {
        super(nome, nomeReal, poderes, vida);
    }
    

    public String getNomeReal() {
        return nomeReal;
    }

    public double getTotalPoder(){
        
        double total = 0;
        
        for(int i = 0; i < poderes.length; i++){
            total = poderes[i].getCategoria();
        }
        
        return total;
    }
}
