package ru.ifmo.fomin;

/**
 * Created by wolfram on 15.04.15.
 */
public class MoveZ implements Execute {
    @Override
    public void execute() {
        Fill fill = new Fill();
        fill.moveF();
        fill.moveS();
        fill.moveB();
        fill.moveB();
        fill.moveB();

    }
}
