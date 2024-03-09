
import java.io.IOException;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        
        Endereco e = new Endereco("Rua Sao Carlos, 100");
        DadosPessoais dp1 = new DadosPessoais(e, "Carlos", 20);
        DadosPessoais dp2 = new DadosPessoais(e, "Paulo", 20);
        
        FileHandler fh = new FileHandler("Ex05.txt");
        fh.writeObject(dp1);
        DadosPessoais dp3 = (DadosPessoais)fh.readObject();
        fh.writeObject(dp2);
        DadosPessoais dp4 = (DadosPessoais)fh.readObject();
  
        dp3.printDadosPessoais();
        dp4.printDadosPessoais();
    }
    
}
