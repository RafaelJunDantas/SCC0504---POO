
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public class MeuLineNumberReader {
    private String fileName;
    private ArrayList<String> strings;
    
    public MeuLineNumberReader(String fileName){
        this.fileName = fileName;
        this.strings = new ArrayList();
    }
    
    public void readLine() throws FileNotFoundException, IOException{
        
        File file = new File(this.fileName);
        FileInputStream canoIn = new FileInputStream(file);
        InputStreamReader readerIn = new InputStreamReader(canoIn);
        BufferedReader readerBuffer = new BufferedReader(readerIn);
        
        String line = readerBuffer.readLine();
        
        while(line != null){
            strings.add(line);
            line = readerBuffer.readLine();
        }
    }
    
    public void printFile(){
        for(int i = 0; i < this.strings.size(); i++){
            System.out.println(i + ": " + this.strings.get(i));
        }
    }
    
    public void printLine(int index){
        if(this.strings.size() > index){
            System.out.println(index + ": " + this.strings.get(index));
        }
        else{
            System.out.println("Linha nao existe");
        }
    }
}
