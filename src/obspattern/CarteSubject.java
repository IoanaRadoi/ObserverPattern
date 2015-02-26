package obspattern;

import java.util.ArrayList;

public interface CarteSubject {
    ArrayList<CarteListener> carteListeners = new ArrayList<CarteListener>();
    
    public void addCarteListener(CarteListener cl);
    public void notifyCarteListeners();
}
