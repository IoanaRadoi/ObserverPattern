package beans;

import java.util.ArrayList;

public class Carte implements java.io.Serializable{
    
    private ArrayList<Autor> autori = new ArrayList<Autor>();
    private String nume;

    public Carte() {
    }

    public Carte(String nume) {
        this.nume = nume;
    }

    public ArrayList<Autor> getAutori() {
        return autori;
    }

    public void setAutori(ArrayList<Autor> autori) {
        this.autori = autori;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }    
    
    public void adaugaAutor(Autor a){
        autori.add(a);
    }
    
    public void removeAutor(String nume){
        autori.remove(new Autor(nume));
    }
    
    @Override
    public String toString() {
        return nume;
    }
    
}
