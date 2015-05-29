package ru.ifmo.fomin;

import java.util.Hashtable;

public class Main {

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
        hashtable.put("u", new MoveUw());
        hashtable.put("r", new MoveRw());
        hashtable.put("l", new MoveLw());
        hashtable.put("f", new MoveFw());
        hashtable.put("d", new MoveDw());
        hashtable.put("b", new MoveBw());
        hashtable.put("x", new MoveX());
        hashtable.put("y", new MoveY());
        hashtable.put("z", new MoveZ());
        hashtable.put("U'", new MoveUPrime());
        hashtable.put("R'", new MoveRPrime());
        hashtable.put("L'", new MoveLPrime());
        hashtable.put("F'", new MoveFPrime());
        hashtable.put("D'", new MoveDPrime());
        hashtable.put("B'", new MoveBPrime());
        hashtable.put("M'", new MoveMPrime());
        hashtable.put("S'", new MoveSPrime());
        hashtable.put("E'", new MoveEPrime());
        hashtable.put("x'", new MoveXPrime());
        hashtable.put("y'", new MoveYPrime());
        hashtable.put("z'", new MoveZPrime());
        hashtable.put("u'", new MoveUwPrime());
        hashtable.put("r'", new MoveRwPrime());
        hashtable.put("l'", new MoveLwPrime());
        hashtable.put("f'", new MoveFwPrime());
        hashtable.put("d'", new MoveDwPrime());
        hashtable.put("b'", new MoveBwPrime());
        hashtable.put("Help", new ForUser());
        hashtable.put("Scramble", new Scramble());
        hashtable.put("Undo", new Undo());

        Fill f = new Fill();
        Undo undo = new Undo();

        f.fill();
        graphicsPanel.setHashtable(hashtable);

    }

}