package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveLPrime implements Execute {
    @Override
    public void execute() {

        Fill fill = new Fill();
        fill.moveL();
        fill.moveL();
        fill.moveL();

    }

}
