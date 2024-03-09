

import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author Rafael
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> v1 = new ArrayList();
        v1.add(1);
        v1.add(2);
        v1.add(5);
        v1.add(3);
        
        ArrayList<Integer> v2 = new ArrayList();
        v2.add(3);
        v2.add(3);
        v2.add(4);
        v2.add(5);
        
        MeusVetores mv = new MeusVetores(v1, v2);
        
        Random rand = new Random();
        
        for(int i = 0; i < 10; i++){
            mv.calcula(FactoryOperacao.getOperacao(rand.nextInt(3)));
        }
    
    }
    
}
