
/**
 *
 * @author Rafael
 */
public class JurosComDesconto{
    
    private Juros j;
    
    public JurosComDesconto(Juros j){
        this.j = j;
    }
    
    public String dividaTotal() {
        return j.dividaTotal() + "com desconto de 3.5% ";
    }
    
}
