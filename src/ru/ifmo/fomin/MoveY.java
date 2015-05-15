package ru.ifmo.fomin;

/**
 * Created by wolfram on 15.04.15.
 */
public class MoveY implements Execute {
    @Override
    public void execute() {
        Fill fill = new Fill();
        fill.moveU();
        fill.moveE();
        fill.moveE();
        fill.moveE();
        fill.moveD();
        fill.moveD();
        fill.moveD();
    }
}
