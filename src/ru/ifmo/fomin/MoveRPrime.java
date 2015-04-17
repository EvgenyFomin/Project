package ru.ifmo.fomin;

/**
 * Created by wolfram on 03.04.15.
 */
public class MoveRPrime implements Execute {
    @Override
    public void execute() {

        Fill fill = new Fill();
        fill.moveR();
        fill.moveR();
        fill.moveR();

    }
}
