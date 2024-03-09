package lista.aula02.ex05;

/**
 *
 * @author Rafael
 */
public class Personagem {
    
    public String nome;
    public String nomeReal;  
    public Superpoder[] poderes;
    public int vida;

    public Personagem(String nome, String nomeReal, Superpoder[] poderes, int vida) {
        this.nome = nome;
        this.nomeReal = nomeReal;
        this.poderes = poderes;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeReal() {
        return nomeReal;
    }
    
    public void setNomeReal(String nomeReal) {
        this.nomeReal = nomeReal;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public void printVida(){
        System.out.printf("%s --> Vida: %d%n", this.nome, this.vida);
    }
    
    public boolean checarVida(){
        if(this.vida <= 0){
            this.printVida();
            System.out.printf("%s perdeu a luta%n", this.nome);
            
            return false;
        }
        
        return true;
    }
    
    private boolean checarSuperPoder(Superpoder poderes[], String poder){
        
        for(int i = 0; i < poderes.length; i++){
            if(poderes[i].getNome() == poder){
                return true;
            }
        }
        
        return false;
    }
    
    public void atacar(int intensidadeAtaque, String SuperPoder, Personagem Inimigo){
        
        if(checarSuperPoder(this.poderes, SuperPoder) == true){
            //System.out.printf("%nPoder encontrado%n");
            if(Math.random() >= 0.5){
                System.out.printf("%s acertou o %s(%d)%n", this.nome, SuperPoder, intensidadeAtaque);
                Inimigo.vida = Inimigo.vida - intensidadeAtaque;
                //System.out.printf("%nAcertou%n");
            } 
            
            else {
                System.out.printf("%s errou o %s(%d)%n", this.nome, SuperPoder, intensidadeAtaque);
            }
        }
        /*else{
            System.out.printf("%nPoder nao encontrado%n");        
        }*/
    }

    
    
}
