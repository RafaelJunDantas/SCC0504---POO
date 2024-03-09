
/**
 *
 * @author Rafael
 */
public class JurosDescontoTaxa{
    private JurosComDesconto jd;
    
    public JurosDescontoTaxa (JurosComDesconto jd){
        this.jd = jd;
    }
    
    public String dividaTotal() {
        return jd.dividaTotal() + "com taxa de 7.5% ";
    }
}
