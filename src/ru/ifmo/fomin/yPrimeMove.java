package ru.ifmo.fomin;

/**
 * Created by wolfram on 15.04.15.
 */
public class yPrimeMove implements Execute {
    @Override
    public void execute() {
        Fill fill = new Fill();
        fill.moveU();
        fill.moveU();
        fill.moveU();
        fill.moveE();
        fill.moveD();
    }
}
