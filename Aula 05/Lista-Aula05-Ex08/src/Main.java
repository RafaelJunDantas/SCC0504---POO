
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
     */
    public static void main(String[] args) throws IOException {
        
        MeuLineNumberReader r = new MeuLineNumberReader("Ex08.txt");
        r.readLine();
        r.printFile();
        r.printLine(2);
        r.printLine(5);
        r.printLine(3);
    }
    
}
