package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveB implements Execute {
    @Override
    public void execute() {
        final Fill fill = new Fill();
        fill.moveB();
    }
}
