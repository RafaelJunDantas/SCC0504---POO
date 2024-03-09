import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class Intercecao implements Operacao{

    @Override
    public ArrayList realizaOperacao(MeusVetores mv) {
        System.out.println("Realizando Intercecao de " + mv.getV1() + " com " + mv.getV2());
        
        ArrayList<Integer> v = new ArrayList();
        
        for(int i = 0; i < mv.getV2().size(); i++){
            if(mv.getV1().contains(mv.getV2().get(i)) && !v.contains((Integer) mv.getV2().get(i))){
                v.add((Integer) mv.getV2().get(i));
            }
        }
        
        return v;
    }
    
}
