package lista.aula02.ex05;

/**
 *
 * @author Rafael
 */
public class Vilao extends Personagem{
    
    private int anosPrisao;

    public Vilao(String nome, String nomeReal, Superpoder[] poderes, int vida) {
        super(nome, nomeReal, poderes, vida);
    }

    public int getAnosPrisao() {
        return anosPrisao;
    }

    public void setAnosPrisao(int anosPrisao) {   
        this.anosPrisao = anosPrisao;
    }
    
    
    
}
