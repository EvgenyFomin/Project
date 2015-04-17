package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveEPrime implements Execute {
    @Override
    public void execute() {

        Fill fill = new Fill();
        fill.moveE();
        fill.moveE();
        fill.moveE();

    }
}
