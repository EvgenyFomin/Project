package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveDPrime implements Execute {
    @Override
    public void execute() {

        Fill fill = new Fill();
        fill.moveD();
        fill.moveD();
        fill.moveD();

    }
}
