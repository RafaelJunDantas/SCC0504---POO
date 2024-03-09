
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
        
        Scanner sc = new Scanner(System.in);
        
        int codigo = sc.nextInt();
        
        FilteredSystem s = new FilteredSystem(new ProxySistema(new Sistema()));
        s.acessoSistema(codigo);
    }
    
}
