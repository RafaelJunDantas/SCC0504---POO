package lista.aula02.ex05;

/**
 *
 * @author Rafael
 */
public class Superpoder {
    
    private int categoria;
    private String nome;

    public Superpoder(int categoria, String nome) {
        this.categoria = categoria;
        this.nome = nome;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    
    public int getCategoria() {
        return categoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void printPoder(){
        System.out.printf("%s %d%n", this.nome, this.categoria);
    }
}
