package ru.ifmo.fomin;

/**
 * Created by wolfram on 26.04.15.
 */
public class MoveFwPrime implements Execute {

    @Override
    public void execute() {

        Fill fill = new Fill();
        fill.moveF();
        fill.moveF();
        fill.moveF();
        fill.moveS();
        fill.moveS();
        fill.moveS();

    }

}
