package org.example.DAO;
import org.example.Model.Notiz;
import java.io.*;

public class NotizBinaryDAO {
 private File file;

 public NotizBinaryDAO(String pfad){
    this.file = new File(pfad);
 }


 public void saveNotiz(Notiz notiz) throws IOException{
    try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))){
        out.writeObject(notiz);
    }
 }

 
 public Notiz loadNotiz() throws IOException{
    if(!file.exists()) return null ;
    try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))){
        return(Notiz) in.readObject();
    }catch(ClassNotFoundException e){
        throw new IOException("Fehler beim Lesen der Notiz", e);
    }

 }
    
}
