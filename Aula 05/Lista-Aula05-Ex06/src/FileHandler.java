
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public class FileHandler {
    private String fileName;
    private File file;

    
    
    public FileHandler(String fileName) throws FileNotFoundException{
        this.fileName = fileName;
        this.file = new File(this.fileName);
    }
    
    public void readFile() throws FileNotFoundException, IOException{
        RandomAccessFile randFile = new RandomAccessFile(this.fileName, "rw"); 

        while(randFile.getFilePointer() < randFile.length()){
            //char buffer = randFile.readChar();
            String line = randFile.readLine();
            System.out.println(line);
        }
        
        randFile.close();
    }
    
    public void swapWord(String word, String newWord) throws FileNotFoundException, IOException{
        
        
        RandomAccessFile randFile = new RandomAccessFile(this.fileName, "rw"); 
        
        long filePointer = randFile.getFilePointer();
        
        while(randFile.getFilePointer() < randFile.length()){
            String line = randFile.readLine();
            if(line.contains(word)){
                line = line.replaceAll(word, newWord);
                randFile.seek(filePointer);
                randFile.writeBytes(line);
            }
            filePointer = randFile.getFilePointer();
        }
        
        randFile.close();
    }
}
