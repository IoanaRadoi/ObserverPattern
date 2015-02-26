package controllers;

import beans.Carte;
import java.util.ArrayList;
import obspattern.CarteListener;
import obspattern.CarteSubject;


public class ListaCarti implements CarteSubject{
    private static ListaCarti singleton;
    
    private ArrayList<Carte> carti;
    
    private ListaCarti(){
        carti = new ArrayList<Carte>();
    }
    
    public static ListaCarti getInstance(){
        if(singleton == null) singleton = new ListaCarti();
        return singleton;
    }
    
    public void adaugaCarte(String nume){
        carti.add(new Carte(nume));
        notifyCarteListeners();
    }
    
    public ArrayList<Carte> getCarti(){
        return carti;
    }
    

    @Override
    public void addCarteListener(CarteListener cl) {
        carteListeners.add(cl);
    }

    @Override
    public void notifyCarteListeners() {
        for(CarteListener cl:carteListeners) cl.carteAdaugata();
    }
}
