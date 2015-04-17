package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveUPrime implements Execute {
    @Override
    public void execute() {

        Fill fill = new Fill();
        fill.moveU();
        fill.moveU();
        fill.moveU();

    }
}
