package ru.ifmo.fomin;

/**
 * Created by wolfram on 15.04.15.
 */
public class MoveXPrime implements Execute {
    @Override
    public void execute() {
        Fill fill = new Fill();
        fill.moveR();
        fill.moveR();
        fill.moveR();
        fill.moveM();
        fill.moveL();
    }
}
