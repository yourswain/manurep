package memento;

import java.util.List;
import java.util.ArrayList;

public class You {
    public static void main(String[] args) {
        List<Life.Memento> savedTimes = new ArrayList<Life.Memento>();
 
        Life life = new Life();
 
        //time travel and record the eras
        life.set("2000 B.C.");
        savedTimes.add(life.saveToMemento());
        life.set("2000 A.D.");
        savedTimes.add(life.saveToMemento());
        life.set("3000 A.D.");
        savedTimes.add(life.saveToMemento());
        life.set("4000 A.D.");
 
        life.restoreFromMemento(savedTimes.get(0));   
        life.restoreFromMemento(savedTimes.get(1));  
 
    }
}