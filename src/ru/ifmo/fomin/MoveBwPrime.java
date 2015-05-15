package ru.ifmo.fomin;

/**
 * Created by wolfram on 26.04.15.
 */
public class MoveBwPrime implements Execute {

    @Override
    public void execute() {

        Fill fill = new Fill();
        fill.moveB();
        fill.moveB();
        fill.moveB();
        fill.moveS();

    }

}
