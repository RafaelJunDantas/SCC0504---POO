package lista.aula02.ex05;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Rafael
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Superpoder[] poderesHeroi = new Superpoder[2];
        poderesHeroi[0] = new Superpoder(3, "Raio gelado");
        poderesHeroi[1] = new Superpoder(1, "Raio Mortal");   
        SuperHeroi hero = new SuperHeroi("Capitao Raio", "Jeremy Richards", poderesHeroi, 100);
        
        Superpoder[] poderesVilao = new Superpoder[2];
        poderesVilao[0] = new Superpoder(2, "Ataque Aquatico");
        poderesVilao[1] = new Superpoder(2, "Fogo Quente");
        Vilao villain = new Vilao("Capitao elemento", "Richards Jeremy", poderesVilao, 100);
        
        int turnos = 1;
        
        while(hero.vida > 0 && villain.vida > 0){
            
            System.out.printf("Turno %d%n", turnos);
            
            hero.printVida();
            villain.printVida();
            
            System.out.println();
            
            if(Math.random() >= 0.5){
                hero.atacar(10 * hero.poderes[turnos % hero.poderes.length].getCategoria(), hero.poderes[turnos % hero.poderes.length].getNome(), villain);
                villain.atacar(10 * villain.poderes[turnos % villain.poderes.length].getCategoria(), villain.poderes[turnos % villain.poderes.length].getNome(), hero);
            }
            
            else{
                villain.atacar(10 * villain.poderes[turnos % villain.poderes.length].getCategoria(), villain.poderes[turnos % villain.poderes.length].getNome(), villain);
                hero.atacar(10 * hero.poderes[turnos % hero.poderes.length].getCategoria(), hero.poderes[turnos % hero.poderes.length].getNome(), hero);
            }
            
            System.out.println();
            
            hero.checarVida();
            villain.checarVida();
            
            turnos++;
        }
        
        System.out.println();
    }
    
}
