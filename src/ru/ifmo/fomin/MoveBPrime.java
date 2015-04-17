package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveBPrime implements Execute {
    @Override
    public void execute() {

        Fill fill = new Fill();
        fill.moveB();
        fill.moveB();
        fill.moveB();

    }
}
