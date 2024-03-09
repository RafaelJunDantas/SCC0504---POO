
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StringObservavel observado = new StringObservavel(); 
        
        ObservadorAno oa = new ObservadorAno();
        ObservadorTamanho ot = new ObservadorTamanho();
        
        observado.addObserver(oa);
        observado.addObserver(ot);
        
        Scanner sc = new Scanner(System.in);
        
        while(true){
            String s = sc.nextLine();
            observado.setString(s);
            observado.notifyObservers(observado);
        }      
    }
    
}
