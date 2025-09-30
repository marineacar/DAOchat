package org.example.DAO;
import java.io.IOException;

import org.example.Model.Notiz;

public interface NotizDAO {
 void saveNotiz (Notiz notiz) throws IOException;
 Notiz loadNotiz() throws IOException;
    
} 
    

