
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
        
        
        Calcula c = new Multiplo2(new Multiplo3(new DemaisNumeros(null)));
        
        c.calcula(sc.nextInt());
        
    }
}
    

