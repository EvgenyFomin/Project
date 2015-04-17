package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveFPrime implements Execute {
    @Override
    public void execute() {

        Fill fill = new Fill();
        fill.moveF();
        fill.moveF();
        fill.moveF();

    }
}
