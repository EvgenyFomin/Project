package ru.ifmo.fomin;
import java.util.Hashtable;

/**
 * Created by wolfram on 15.04.15.
 */
public class MyHashtable {

    Hashtable hashtable;

    public void myHashtable() {

        Fill fill = new Fill();

        hashtable = new Hashtable();
        hashtable.put("U", new MoveU());
        hashtable.put("R", new MoveR());
        hashtable.put("L", new MoveL());
        hashtable.put("F", new MoveF());
        hashtable.put("D", new MoveD());
        hashtable.put("B", new MoveB());
        hashtable.put("U'", new MoveUPrime());
        hashtable.put("R'", new MoveRPrime());
        hashtable.put("L'", new MoveLPrime());
        hashtable.put("F'", new MoveFPrime());
        hashtable.put("D'", new MoveDPrime());
        hashtable.put("B'", new MoveBPrime());
        hashtable.put("M", new MoveM());
        hashtable.put("help", new ForUser());
        hashtable.put("scramble", new Scramble());
        hashtable.put("solve", new Solve());


    }

}
