package ru.ifmo.fomin;

import javax.swing.*;
import java.util.Hashtable;

public class Main extends JPanel {

    public static void main(String[] args) {

        GraphicsPanel graphicsPanel = new GraphicsPanel();
        graphicsPanel.frame();

        Hashtable hashtable = new Hashtable();
        hashtable.put("U", new MoveU());
        hashtable.put("R", new MoveR());
        hashtable.put("L", new MoveL());
        hashtable.put("F", new MoveF());
        hashtable.put("D", new MoveD());
        hashtable.put("B", new MoveB());
        hashtable.put("M", new MoveM());
        hashtable.put("S", new MoveS());
        hashtable.put("E", new MoveE());
        hashtable.put("x", new xMove());
        hashtable.put("y", new yMove());
        hashtable.put("z", new zMove());
        hashtable.put("U'", new MoveUPrime());
        hashtable.put("R'", new MoveRPrime());
        hashtable.put("L'", new MoveLPrime());
        hashtable.put("F'", new MoveFPrime());
        hashtable.put("D'", new MoveDPrime());
        hashtable.put("B'", new MoveBPrime());
        hashtable.put("M'", new MoveMPrime());
        hashtable.put("S'", new MoveSPrime());
        hashtable.put("E'", new MoveEPrime());
        hashtable.put("x'", new xPrimeMove());
        hashtable.put("y'", new yPrimeMove());
        hashtable.put("z'", new zPrimeMove());
        hashtable.put("Help", new ForUser());
        hashtable.put("Scramble", new Scramble());
        hashtable.put("solve", new Solve());

        Fill f = new Fill();
        ForUser user = new ForUser();

        user.execute();
        f.fill();
        f.output();
        f.setHashtable(hashtable);
        graphicsPanel.setHashtable(hashtable);
        f.Scan();
    }

}
