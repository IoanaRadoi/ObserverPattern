package beans;

public class Autor implements java.io.Serializable{
    private String nume;

    public Autor() {
    }

    public Autor(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return nume;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Autor other = (Autor) obj;
        if ((this.nume == null) ? (other.nume != null) : !this.nume.equals(other.nume)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.nume != null ? this.nume.hashCode() : 0);
        return hash;
    }
    
    
}
