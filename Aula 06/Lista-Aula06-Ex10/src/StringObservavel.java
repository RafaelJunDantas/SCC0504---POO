import java.util.Observable;

/**
 *
 * @author Rafael
 */
public class StringObservavel extends Observable{
    private String string;
    
    public StringObservavel(){
        this.string = "";
    }
    
    public String getString(){
        return this.string;
    }
    
    public void setString(String string){
        this.string = string;
        this.setChanged();
    }
}
