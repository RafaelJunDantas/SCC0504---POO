import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Rafael
 */
public class ObservadorTamanho implements Observer{
    
    @Override
    public void update(Observable o, Object arg) {
        StringObservavel so = (StringObservavel)o;
        System.out.println("String concatenada com o tamanho:");
        System.out.println(so.getString().toUpperCase() + so.getString().length());
    }
    
    
}
