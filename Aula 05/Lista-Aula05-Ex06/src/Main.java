
import java.io.IOException;
import java.io.RandomAccessFile;

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
     */
    public static void main(String[] args) throws IOException {
        FileHandler fh = new FileHandler("Ex06.txt");
       
        fh.readFile();
        System.out.println("----------------------");
        fh.swapWord("muito", "pouco");
        fh.readFile();
    }
    
}
