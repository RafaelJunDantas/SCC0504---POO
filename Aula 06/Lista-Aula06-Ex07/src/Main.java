
/**
 *
 * @author Rafael
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Juros j = new Juros(5);
        System.out.println(j.dividaTotal());
        
        JurosComDesconto c = new JurosComDesconto(new Juros(5));
        System.out.println(c.dividaTotal());
        
        JurosDescontoTaxa d = new JurosDescontoTaxa(new JurosComDesconto(new Juros(5)));
        System.out.println(d.dividaTotal());
    }
    
}
