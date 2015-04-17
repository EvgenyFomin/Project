package ru.ifmo.fomin;

/**
 * Created by wolfram on 15.04.15.
 */
public class xMove implements Execute {
    @Override
    public void execute() {
        Fill fill = new Fill();
        fill.moveR();
        fill.moveM();
        fill.moveM();
        fill.moveM();
        fill.moveL();
        fill.moveL();
        fill.moveL();
    }
}
