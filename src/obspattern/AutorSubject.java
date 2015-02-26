package obspattern;

import java.util.ArrayList;


public interface AutorSubject {
    ArrayList<AutorListener> autorListeners = new ArrayList<AutorListener>();
    
    public void addAutorListener(AutorListener al);
    public void notifyAutorListeners();
}
