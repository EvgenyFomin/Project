package ru.ifmo.fomin;

/**
 * Created by wolfram on 26.04.15.
 */
public class MoveRwPrime implements Execute {

    @Override
    public void execute() {

        Fill fill = new Fill();
        fill.moveR();
        fill.moveR();
        fill.moveR();
        fill.moveM();

    }

}
