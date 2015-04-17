package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveSPrime implements Execute {
    @Override
    public void execute() {

        Fill fill = new Fill();
        fill.moveS();
        fill.moveS();
        fill.moveS();

    }
}
