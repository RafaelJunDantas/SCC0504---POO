
import static java.lang.Math.sqrt;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public class DemaisNumeros extends Calcula{
    
    public DemaisNumeros(Calcula sucessor){
        super(sucessor);
    }

    @Override
    public void calcula(int n) {
        System.out.println("Nao e multiplo de 2 nem de 3");
        int quadrado = n*n;
        float raiz = (float) sqrt(n);
        System.out.println(n + "^2" + " = " + quadrado);
        System.out.println("Raiz de " + n + " = " + raiz);
    }
    
}
