package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveMPrime implements Execute {
    @Override
    public void execute() {

        Fill fill = new Fill();
        fill.moveM();
        fill.moveM();
        fill.moveM();

    }
}
