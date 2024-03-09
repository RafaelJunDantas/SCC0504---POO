import java.util.Calendar;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Rafael
 */
public class ObservadorAno implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        StringObservavel so = (StringObservavel)o;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("String concatenada com o ano:");
        System.out.println(so.getString().toUpperCase() + year);
    }
    
}
