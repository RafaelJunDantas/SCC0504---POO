
import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class FactoryOperacao {
    public static Operacao getOperacao(int codigo){
        Operacao op = null;

        switch (codigo) {
            case 0 -> op = new Uniao();
            case 1 -> op = new Intercecao();
            case 2 -> op = new Diferenca();
            default -> {System.out.println("Codigo nao reconhecido");
            }
        }
        return op;
    }
}
