package ru.ifmo.fomin;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {


        Hashtable hashtable = new Hashtable();
        hashtable.put("U ", new MoveU());
        hashtable.put("R ", new MoveR());
        hashtable.put("L ", new MoveL());
        hashtable.put("F ", new MoveF());
        hashtable.put("D ", new MoveD());
        hashtable.put("B ", new MoveB());
        hashtable.put("U' ", new MoveUPrime());
        hashtable.put("R' ", new MoveRPrime());
        hashtable.put("L' ", new MoveLPrime());
        hashtable.put("F' ", new MoveFPrime());
        hashtable.put("D' ", new MoveDPrime());
        hashtable.put("B' ", new MoveBPrime());

        Fill f = new Fill();
        ForUser user = new ForUser();

        user.execute();
        f.fill();
        f.output();
        f.setHashtable(hashtable);
        f.Scan();
    }
}
