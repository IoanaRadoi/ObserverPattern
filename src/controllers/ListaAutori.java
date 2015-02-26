package controllers;

import beans.Autor;
import java.util.ArrayList;
import obspattern.AutorListener;
import obspattern.AutorSubject;


public class ListaAutori implements AutorSubject{
    private static ListaAutori singleton;
    
    private ArrayList<Autor> autori;
    
    private ListaAutori(){
        autori = new ArrayList<Autor>();
    }
    
    public static ListaAutori getInstance(){
        if(singleton == null) singleton = new ListaAutori();
        return singleton;
    }
    
    public void adaugaAutor(String nume){
        autori.add(new Autor(nume));
        notifyAutorListeners();
    }
    
    public ArrayList<Autor> getAutori(){
        return autori;
    }
    
    public void removeAutor(String nume){
        autori.remove(new Autor(nume));
        notifyAutorListeners();
    }

    @Override
    public void addAutorListener(AutorListener al) {
        autorListeners.add(al);
    }

    @Override
    public void notifyAutorListeners() {
        for(AutorListener al:autorListeners) al.autorModificat();
    }
    
    
}
