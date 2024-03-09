
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

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
    private FileOutputStream canoOut;
    private GZIPOutputStream zipCompactador;
    private ObjectOutputStream serializador;
    
    private FileInputStream canoIn;
    private GZIPInputStream zipDescompactador;
    private ObjectInputStream deserializador;
    
    public FileHandler(String fileName) throws IOException{
        this.fileName = fileName;
        this.file = new File(fileName);
        this.file.createNewFile();
    }
    
    public void writeObject(Object o) throws IOException{
        this.file = new File(this.fileName);
        this.canoOut = new FileOutputStream(this.file);
        this.zipCompactador = new GZIPOutputStream(this.canoOut);
        this.serializador = new ObjectOutputStream(this.zipCompactador);
        this.serializador.writeObject(o);
        this.serializador.close();
        this.zipCompactador.close();
        this.canoOut.close();
    }
    
    public Object readObject() throws IOException, ClassNotFoundException{
        this.file = new File(this.fileName);
        this.canoIn = new FileInputStream(this.file);
        this.zipDescompactador = new GZIPInputStream(this.canoIn);
        this.deserializador = new ObjectInputStream(this.zipDescompactador);
        Object aux = this.deserializador.readObject();
        this.deserializador.close();
        this.zipDescompactador.close();
        this.canoIn.close();
        return aux;
    }
}
