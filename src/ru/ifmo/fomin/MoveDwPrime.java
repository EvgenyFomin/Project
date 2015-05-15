package ru.ifmo.fomin;

/**
 * Created by wolfram on 26.04.15.
 */
public class MoveDwPrime implements Execute {

    @Override
    public void execute() {

        Fill fill = new Fill();
        fill.moveD();
        fill.moveD();
        fill.moveD();
        fill.moveE();
        fill.moveE();
        fill.moveE();

    }

}
