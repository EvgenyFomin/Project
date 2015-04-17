package ru.ifmo.fomin;

/**
 * Created by wolfram on 02.04.15.
 */
public class MoveU implements Execute {
    @Override
    public void execute() {

        final Fill fill = new Fill();
        fill.moveU();

    }
}
