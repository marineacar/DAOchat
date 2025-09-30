package org.example.Model;

import java.io.Serializable;

public class Notiz implements Serializable {
    private String titel;
    private String inhalt;


public Notiz(String titel, String inhalt){
this.titel = titel;
this.inhalt = inhalt;
}

public String getTitel(){
    return titel;
}

public String setTitel(String titel){
return titel;
}

public String getInhalt(){
    return inhalt;
}

public String setInhalt(String inhalt){
    return inhalt;
}

@Override
public String toString(){
    return "[" + titel + "]" + inhalt;
}
}
